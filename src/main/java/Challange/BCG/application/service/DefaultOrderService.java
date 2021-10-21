package Challange.BCG.application.service;

import Challange.BCG.application.port.OrderService;
import Challange.BCG.domain.Order;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DefaultOrderService implements OrderService {
    @Override
    public Integer getTotal(List<String> requestList) {
        Map<String, Integer> orderCountPerItem = new HashMap<String, Integer>();

        // create an order
        Order order = new Order();
        return 0;
    }
}
