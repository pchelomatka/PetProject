package main.controller;

import main.controller.common.AbstractController;
import main.domain.Shelf;
import main.service.ShelfService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shelf")
public class ShelfController extends AbstractController<Shelf, ShelfService> {

    public ShelfController(ShelfService service) {
        super(service);
    }
}
