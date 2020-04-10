package main.repository;

import main.domain.Locker;
import main.repository.common.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LockerRepository extends CommonRepository<Locker> {
}
