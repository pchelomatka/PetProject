package main.service.common;

import main.domain.common.AbstractEntity;
import main.repository.common.CommonRepository;
import main.util.ErrorType;
import main.util.SampleException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public abstract class AbstractService<E extends AbstractEntity, R extends CommonRepository<E>> implements CommonService<E> {

    protected final R repository;

    @Autowired
    public AbstractService(R repository) {
        this.repository = repository;
    }

    @Override
    public Optional<E> save(E entity) {
        return Optional.of(repository.save(entity));
    }

    @Override
    public Optional<E> update(E entity) {
        return Optional.of(repository.save(entity));
    }

    @Override
    public Optional<E> get(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<E> getAll() {
        return (List<E>) repository.findAll();
    }

    @Override
    public Boolean deleteById(Long id) {
        E entity = get(id)
                .orElseThrow(() -> new SampleException(String.format(ErrorType.ENTITY_NOT_FOUND.getDescription(), id)));
        repository.delete(entity);
        return !repository.findById(entity.getId()).isPresent();
    }


}
