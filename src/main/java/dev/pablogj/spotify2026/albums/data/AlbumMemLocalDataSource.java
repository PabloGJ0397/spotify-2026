package dev.pablogj.spotify2026.albums.data;

import dev.pablogj.spotify2026.albums.domain.Album;

import java.util.ArrayList;

public class AlbumMemLocalDataSource {
    private static AlbumMemLocalDataSource instance = null;

    private ArrayList<Album> albumMemStorage = new ArrayList<>();

    private AlbumMemLocalDataSource() {
        initData();
    }
    private void initData() {
        albumMemStorage.add(new Album ("1","Abbey Road", "1969"));
        albumMemStorage.add(new Album ("2","Escape Plan", "2021"));
    }
    public ArrayList<Album> findAll() {
        return albumMemStorage;
    }
    public void save(Album album) {
        albumMemStorage.add(album);
    }
    public void deleteAlbum(String Id) {
        albumMemStorage.removeIf(album -> album.getId().equals(Id));
    }
    public static AlbumMemLocalDataSource getInstance() {
        if (instance == null) {
            instance = new AlbumMemLocalDataSource();
        }
        return instance;
    }
}
