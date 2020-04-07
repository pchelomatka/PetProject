package main.service.common;

import main.domain.AbstractEntity;

import java.util.Optional;

public interface CommonService<E extends AbstractEntity> {

    Optional<E> save(E entity);
}
