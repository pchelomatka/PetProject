package main.service;

import main.domain.Hall;
import main.repository.HallRepository;
import main.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class HallService extends AbstractService<Hall, HallRepository> {

    public HallService(HallRepository repository) {
        super(repository);
    }
}
