package edu.icet.demo.repository.impl;

import edu.icet.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BookRepositoryImpl implements BookRepository {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public int retrieveBookCount() {
        String query = "SELECT COUNT(*) FROM BOOK";
        return jdbcTemplate.queryForObject(query, Integer.class);
    }
}
