package main.repository;

import main.domain.Hall;
import main.repository.common.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepository extends CommonRepository<Hall> {
}