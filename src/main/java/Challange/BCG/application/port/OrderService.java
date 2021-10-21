package Challange.BCG.application.port;

import java.util.List;

public interface OrderService {
    Integer getTotal(List<String> requestList);
}
