package dev.pablogj.spotify2026;

import dev.pablogj.spotify2026.albums.presentation.AlbumView;
import dev.pablogj.spotify2026.authors.presentation.AuthorView;
import dev.pablogj.spotify2026.songs.presentation.SongView;

public class Main {


    // TEST SONGS FEATURE FROM MAIN

    public static void main(String[] args) {
        SongView.printSongs();
        SongView.saveSong();
    }


    /*
    //TEST ALBUMS FEATURE FROM MAIN

    public static void main(String[] args) {
        AlbumView.saveAlbum();
    }
    */

    /*
    //TEST AUTHORS FROM MAIN
    public static void main(String[] args) {
        AuthorView.printAuthors();
    }
    */
}
