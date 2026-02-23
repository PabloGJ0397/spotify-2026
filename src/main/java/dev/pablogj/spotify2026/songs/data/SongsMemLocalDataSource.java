package dev.pablogj.spotify2026.songs.data;

import dev.pablogj.spotify2026.songs.domain.Song;

import java.util.ArrayList;

public class SongsMemLocalDataSource {
    private static SongsMemLocalDataSource instance;

    private ArrayList<Song> songsMemStorage = new ArrayList<>();

    private SongsMemLocalDataSource() {
        initData();
    }
    private void initData() {
        songsMemStorage.add(new Song("1", "Macarena", "Los del Rio", "4:00"));
        songsMemStorage.add(new Song("2", "Bohemian Rhapsody", "Queen", "5:55"));
    }
    public ArrayList<Song> findAll() {
        return songsMemStorage;
    }
    public static SongsMemLocalDataSource getInstance() {
        if (instance == null) {
            instance = new SongsMemLocalDataSource();
        }
        return instance;
    }

}
