package main.controller;

import main.controller.common.AbstractController;
import main.domain.Library;
import main.service.LibraryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
public class LibraryController extends AbstractController<Library, LibraryService> {

    public LibraryController(LibraryService service) {
        super(service);
    }
}
