package Challange.BCG.presentation;

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

    @PostMapping("/checkout")
    public ResponseEntity<?> checkout(@RequestBody @Valid List<String> req){
        Integer total = 0;
        return ResponseEntity.ok(total);
    }
}
