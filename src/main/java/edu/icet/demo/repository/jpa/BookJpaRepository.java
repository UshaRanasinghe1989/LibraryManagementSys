package edu.icet.demo.repository.jpa;

import edu.icet.demo.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookJpaRepository extends CrudRepository<BookEntity, Integer> {
}
