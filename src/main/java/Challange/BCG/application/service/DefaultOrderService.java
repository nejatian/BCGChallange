package Challange.BCG.application.service;

import Challange.BCG.application.port.OrderService;
import Challange.BCG.domain.Order;
import Challange.BCG.domain.WatchRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DefaultOrderService implements OrderService {
    WatchRepository watchRepository;

    public DefaultOrderService(WatchRepository watchRepository) {
        this.watchRepository = watchRepository;
    }

    @Override
    public Integer getTotal(List<String> requestList) {
        Map<String, Integer> orderCountPerItem = new HashMap<String, Integer>();

        // create an order
        Order order = new Order();

        // TODO: we can do it in fewer steps
        requestList.forEach(item -> {
            int count = Collections.frequency(requestList, item);
            orderCountPerItem.put(item, count);
        });

        // TODO: try to use WatchListOf instead of watchOf
        orderCountPerItem.forEach((id, count) -> order.addOrderLine(watchRepository.watchOf(id).orElseThrow(), count));

        // add order line for each watch
        return order.orderTotalPrice().amount();
    }
}
