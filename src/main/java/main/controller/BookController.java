package main.controller;

import main.controller.common.AbstractController;
import main.domain.Book;
import main.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController extends AbstractController<Book, BookService> {

    public BookController(BookService service) {
        super(service);
    }
}
