package dev.pablogj.spotify2026.albums.domain;

import java.util.ArrayList;

public class SaveAlbumUseCase {
    private AlbumRepository albumRepository;
    public SaveAlbumUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }
    public void execute(Album album) {
        albumRepository.saveAlbum(album);
    }
}
