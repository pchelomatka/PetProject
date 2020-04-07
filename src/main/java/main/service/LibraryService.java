package main.service;

import main.domain.Library;
import main.repository.LibraryRepository;
import main.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class LibraryService extends AbstractService<Library, LibraryRepository> {

    public LibraryService(LibraryRepository repository) {
        super(repository);
    }
}
