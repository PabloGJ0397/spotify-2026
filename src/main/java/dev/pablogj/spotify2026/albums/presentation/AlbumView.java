package dev.pablogj.spotify2026.albums.presentation;

import dev.pablogj.spotify2026.albums.data.AlbumDataRepository;
import dev.pablogj.spotify2026.albums.data.AlbumMemLocalDataSource;
import dev.pablogj.spotify2026.albums.domain.Album;
import dev.pablogj.spotify2026.albums.domain.GetAlbumsUseCase;
import dev.pablogj.spotify2026.albums.domain.SaveAlbumUseCase;

import java.util.ArrayList;

public class AlbumView {
    public static void printAlbums(){
        GetAlbumsUseCase getAlbumsUseCase = new GetAlbumsUseCase(new AlbumDataRepository(AlbumMemLocalDataSource.getInstance()));

        ArrayList<Album> albums = getAlbumsUseCase.execute();
        System.out.println(albums);
    }
    public static void saveAlbum() {
        Album album3 = new Album("3","Thriller","1982");
        SaveAlbumUseCase saveAlbumUseCase = new SaveAlbumUseCase(new AlbumDataRepository(AlbumMemLocalDataSource.getInstance()));
        saveAlbumUseCase.execute(album3);
        printAlbums();
    }
}
