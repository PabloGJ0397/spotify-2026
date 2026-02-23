package dev.pablogj.spotify2026.albums.domain;

import java.util.ArrayList;

public interface AlbumRepository {
    public ArrayList<Album> findAll();
    public void saveAlbum(Album album);
}
