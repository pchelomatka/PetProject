package main.service;

import main.domain.Shelf;
import main.repository.ShelfRepository;
import main.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ShelfService extends AbstractService<Shelf, ShelfRepository> {

    public ShelfService(ShelfRepository repository) {
        super(repository);
    }
}
