package dev.pablogj.spotify2026.songs.data;

import dev.pablogj.spotify2026.songs.domain.Song;
import dev.pablogj.spotify2026.songs.domain.SongRepository;

import java.util.ArrayList;

public class SongDataRepository implements SongRepository {

   private SongsMemLocalDataSource songsMemLocalDataSource;

   public SongDataRepository(SongsMemLocalDataSource songsMemLocalDataSource) {
       this.songsMemLocalDataSource = songsMemLocalDataSource;
   }
   @Override
    public ArrayList<Song> findAll() {
        return songsMemLocalDataSource.findAll();
    }

    @Override
    public void saveSong(Song song) {
       songsMemLocalDataSource.saveSong(song);
    }

    @Override
    public void deleteSong(String id) {
       songsMemLocalDataSource.deleteSong(id);
    }

}
