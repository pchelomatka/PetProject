package main.controller;

import main.controller.common.AbstractController;
import main.domain.Author;
import main.service.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/author")
public class AuthorController extends AbstractController<Author, AuthorService> {

    public AuthorController(AuthorService service) {
        super(service);
    }
}
