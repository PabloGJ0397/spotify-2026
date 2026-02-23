package dev.pablogj.spotify2026.authors.domain;

import java.util.ArrayList;

public class GetAuthorsUseCase {
    private AuthorRepository authorRepository;

    public GetAuthorsUseCase(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }
   public ArrayList<Author> execute(){
        return authorRepository.findAll();}
}
