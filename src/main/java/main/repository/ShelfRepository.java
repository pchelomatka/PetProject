package main.repository;

import main.domain.Shelf;
import main.repository.common.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelfRepository extends CommonRepository<Shelf> {
}
