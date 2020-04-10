package main.controller;

import main.controller.common.AbstractController;
import main.domain.Type;
import main.service.TypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/type")
public class TypeController extends AbstractController<Type, TypeService> {

    public TypeController(TypeService service) {
        super(service);
    }
}
