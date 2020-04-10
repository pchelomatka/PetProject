package main.repository;

import main.domain.Author;
import main.repository.common.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CommonRepository<Author> {
}
