package main.controller;

import main.controller.common.AbstractController;
import main.domain.Hall;
import main.service.HallService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hall")
public class HallController extends AbstractController<Hall, HallService> {

    public HallController(HallService service) {
        super(service);
    }
}
