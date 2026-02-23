package dev.pablogj.spotify2026.albums.domain;

import java.util.ArrayList;

public interface AlbumRepository {
    ArrayList<Album> findAll();
    void saveAlbum(Album album);
    void deleteAlbum(String id);
}
