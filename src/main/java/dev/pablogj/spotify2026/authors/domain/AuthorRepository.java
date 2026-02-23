package dev.pablogj.spotify2026.authors.domain;

import java.util.ArrayList;

public interface AuthorRepository {
    ArrayList<Author> findAll();
}
