package dev.pablogj.spotify2026.songs.domain;

import java.util.ArrayList;

public interface SongRepository {
    ArrayList<Song> findAll();
    void saveSong(Song song);
    void deleteSong(String id);
}
