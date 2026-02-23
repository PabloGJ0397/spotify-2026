package dev.pablogj.spotify2026.albums.data;

import dev.pablogj.spotify2026.albums.domain.Album;
import dev.pablogj.spotify2026.albums.domain.AlbumRepository;

import java.util.ArrayList;

public class AlbumDataRepository implements AlbumRepository {

    private AlbumMemLocalDataSource albumMemLocalDataSource;
    public AlbumDataRepository(AlbumMemLocalDataSource albumMemLocalDataSource) {
        this.albumMemLocalDataSource = albumMemLocalDataSource;
    }

    @Override
    public ArrayList<Album> findAll() {
        return albumMemLocalDataSource.findAll();
    }

    @Override
    public void saveAlbum(Album album) {
        albumMemLocalDataSource.save(album);
    }

    @Override
    public void deleteAlbum(String id) {
        albumMemLocalDataSource.deleteAlbum(id);
    }
}
