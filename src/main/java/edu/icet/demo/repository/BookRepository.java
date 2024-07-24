package edu.icet.demo.repository;

import java.util.Optional;

public interface BookRepository {
    Optional<Integer> retrieveBookCount();
}
