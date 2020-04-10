package main.service;

import main.domain.Book;
import main.repository.BookRepository;
import main.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class BookService extends AbstractService<Book, BookRepository> {

    public BookService(BookRepository repository) {
        super(repository);
    }
}
