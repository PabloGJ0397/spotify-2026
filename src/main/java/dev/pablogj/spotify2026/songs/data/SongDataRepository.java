package dev.pablogj.spotify2026.songs.data;

import dev.pablogj.spotify2026.songs.domain.Song;
import dev.pablogj.spotify2026.songs.domain.SongRepository;

import java.util.ArrayList;

public class SongDataRepository implements SongRepository {

    public ArrayList<Song> findAll() {
        Song song1 = new Song("1","Bohemian Rapsody", "Queen", "5:55");
        Song song2 = new Song("2","Adventure Of a Lifetime", "Coldplay", "4:30");

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);

        return songs;
    }
}
