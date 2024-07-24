package edu.icet.demo.repository.jpa;

import edu.icet.demo.entity.BookEntity;
import edu.icet.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookJpaRepository extends CrudRepository<BookEntity, Integer> {

}
