package dev.pablogj.spotify2026.authors.data;

import dev.pablogj.spotify2026.authors.domain.Author;

import java.util.ArrayList;

public class AuthorApiLocalDataSource {
    public static AuthorApiLocalDataSource instance;
    public static ArrayList<Author> authorsApiStorage =new ArrayList<>();

    private AuthorApiLocalDataSource(){
    initData();}

    private void initData(){
        Author author1 = new Author("API-1", "Freddie Mercury", "05-09-1946", "British");
        authorsApiStorage.add(author1);
        Author author2 = new Author("API-2", "David Bowie", "08-01-1947", "British");
        authorsApiStorage.add(author2);

    }
    public ArrayList<Author> findAll(){
        return authorsApiStorage;
    }
    public void save(Author author){
        authorsApiStorage.add(author);
    }
    public static AuthorApiLocalDataSource getInstance(){
        if(instance == null){
            instance = new AuthorApiLocalDataSource();
        }
        return instance;
    }
}