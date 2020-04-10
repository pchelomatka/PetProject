package main.service;

import main.domain.Author;
import main.repository.AuthorRepository;
import main.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class AuthorService extends AbstractService<Author, AuthorRepository> {

    public AuthorService(AuthorRepository repository) {
        super(repository);
    }
}
