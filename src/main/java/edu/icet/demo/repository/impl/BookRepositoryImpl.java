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
    public int retrieveBookCount() throws NullPointerException {
        String query = "SELECT COUNT(*) FROM BOOK";
        //noinspection DataFlowIssue
        return jdbcTemplate.queryForObject(query,
                    Integer.class);

    }
}
