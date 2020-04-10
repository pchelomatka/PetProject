package main.service.common;

import main.domain.common.AbstractEntity;

import java.util.List;
import java.util.Optional;

public interface CommonService<E extends AbstractEntity> {

    Optional<E> save(E entity);

    Optional<E> update(E entity);

    Optional<E> get(Long id);

    List<E> getAll();

    Boolean deleteById(Long id);
}
