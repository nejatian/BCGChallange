package Challange.BCG.presentation;

import Challange.BCG.application.port.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping()
public class CheckoutController {

    private final OrderService iTotalService;

    public CheckoutController(OrderService iTotalService) {
        this.iTotalService = iTotalService;
    }

    @PostMapping("/checkout")
    public ResponseEntity<?> checkout(@RequestBody @Valid List<String> req){
        Integer total = iTotalService.getTotal(req);
        return ResponseEntity.ok(total);
    }
}
