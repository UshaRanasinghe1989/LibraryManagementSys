package edu.icet.demo.repository.impl;

import edu.icet.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor; 
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class BookRepositoryImpl implements BookRepository {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public Optional<Integer> retrieveBookCount() {
        Integer count = jdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM BOOK", Integer.class);
        return Optional.ofNullable(count);

    }
}
