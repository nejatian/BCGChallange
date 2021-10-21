package Challange.BCG.application.service;

import Challange.BCG.application.port.OrderService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultOrderServiceTest {
    @Autowired
    private OrderService orderService;

    @Test
    @DisplayName("Check if total of ['001','002','001','004','003'] returns 360")
    void totalShouldBe360(){
        Integer total = orderService.getTotal(List.of("001","002","001","004","003"));

        assertThat(total).isEqualTo(360);
    }
}
