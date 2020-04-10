package main.repository;

import main.domain.Book;
import main.repository.common.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CommonRepository<Book> {
}
