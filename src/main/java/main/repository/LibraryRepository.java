package main.repository;

import main.domain.Library;
import main.repository.common.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends CommonRepository<Library> {
}
