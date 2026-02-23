package dev.pablogj.spotify2026.authors.data;

import dev.pablogj.spotify2026.authors.domain.Author;
import dev.pablogj.spotify2026.authors.domain.AuthorRepository;

import java.util.ArrayList;

public class AuthorDataRepository implements AuthorRepository {
    private AuthorMemLocalDataSource authorMemLocalDataSource;
    private AuthorApiLocalDataSource authorApiLocalDataSource;

    public AuthorDataRepository(AuthorMemLocalDataSource authorMemLocalDataSource, AuthorApiLocalDataSource authorApiLocalDataSource) {
        this.authorMemLocalDataSource = authorMemLocalDataSource;
        this.authorApiLocalDataSource = authorApiLocalDataSource;
    }
    @Override
    public ArrayList<Author> findAll(){
        return authorMemLocalDataSource.findAll();
    }

    @Override
    public void saveAuthor(Author author){
        authorMemLocalDataSource.save(author);
    }

}
