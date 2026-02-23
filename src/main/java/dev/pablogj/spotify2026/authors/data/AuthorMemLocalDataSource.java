package dev.pablogj.spotify2026.authors.data;

import dev.pablogj.spotify2026.albums.data.AlbumMemLocalDataSource;
import dev.pablogj.spotify2026.authors.domain.Author;

import java.util.ArrayList;

public class AuthorMemLocalDataSource {
    private static AuthorMemLocalDataSource instance = null;
    private ArrayList<Author> authorsMemStorage = new ArrayList<>();

    private AuthorMemLocalDataSource(){initData();}
    private void initData(){
        Author author1 = new Author("1", "Freddie Mercury", "05-09-1946", "British");
        authorsMemStorage.add(author1);
        Author author2 = new Author("2", "David Bowie", "08-01-1947", "British");
        authorsMemStorage.add(author2);
    }
    public void save(Author author){
        authorsMemStorage.add(author);
    }
    public ArrayList<Author> findAll(){
        return authorsMemStorage;
    }
    public static AuthorMemLocalDataSource getInstance(){
        if(instance == null){
            instance = new AuthorMemLocalDataSource();
        }
        return instance;
    }
}
