package dev.pablogj.spotify2026.albums.data;

import dev.pablogj.spotify2026.albums.domain.Album;

import java.util.ArrayList;

public class AlbumMemLocalDataSource {
    private static AlbumMemLocalDataSource instance = null;

    private ArrayList<Album> storage = new ArrayList<>();

    private AlbumMemLocalDataSource() {
        initData();
    }
    private void initData() {
        storage.add(new Album ("1","Abbey Road", "1969"));
        storage.add(new Album ("2","Escape Plan", "2021"));
    }
    public ArrayList<Album> findAll() {
        return storage;
    }
    public void save(Album album) {
        storage.add(album);
    }
    public static AlbumMemLocalDataSource getInstance() {
        if (instance == null) {
            instance = new AlbumMemLocalDataSource();
        }
        return instance;
    }
}
