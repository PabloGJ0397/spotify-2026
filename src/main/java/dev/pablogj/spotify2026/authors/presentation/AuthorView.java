package dev.pablogj.spotify2026.authors.presentation;

import dev.pablogj.spotify2026.albums.domain.Album;
import dev.pablogj.spotify2026.authors.data.AuthorApiLocalDataSource;
import dev.pablogj.spotify2026.authors.data.AuthorDataRepository;
import dev.pablogj.spotify2026.authors.data.AuthorMemLocalDataSource;
import dev.pablogj.spotify2026.authors.domain.Author;
import dev.pablogj.spotify2026.authors.domain.GetAuthorsUseCase;

import java.util.ArrayList;

public class AuthorView {
    public static void printAuthors(){
        GetAuthorsUseCase getAuthorsUseCase = new GetAuthorsUseCase
                (new AuthorDataRepository(AuthorMemLocalDataSource.getInstance(), AuthorApiLocalDataSource.getInstance()));

        ArrayList<Author> authors = getAuthorsUseCase.execute();
        System.out.println(authors);
    }
}
