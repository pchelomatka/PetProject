package main.service;

import main.domain.Type;
import main.repository.TypeRepository;
import main.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class TypeService extends AbstractService<Type, TypeRepository> {

    public TypeService(TypeRepository repository) {
        super(repository);
    }
}
