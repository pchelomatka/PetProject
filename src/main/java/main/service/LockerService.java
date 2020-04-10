package main.service;

import main.domain.Locker;
import main.repository.LockerRepository;
import main.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class LockerService extends AbstractService<Locker, LockerRepository> {

    public LockerService(LockerRepository repository) {
        super(repository);
    }
}
