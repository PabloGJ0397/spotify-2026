package dev.pablogj.spotify2026.authors.domain;

import dev.pablogj.spotify2026.albums.domain.Album;

import java.util.ArrayList;

public interface AuthorRepository {
    public ArrayList<Author> findAll();
    public void saveAuthor(Author author);


}
