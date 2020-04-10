package main.controller;

import main.controller.common.AbstractController;
import main.domain.Locker;
import main.service.LockerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/locker")
public class LockerController extends AbstractController<Locker, LockerService> {

    public LockerController(LockerService service) {
        super(service);
    }
}
