package dev.pablogj.spotify2026.songs.presentation;

import dev.pablogj.spotify2026.songs.data.SongDataRepository;
import dev.pablogj.spotify2026.songs.data.SongsMemLocalDataSource;
import dev.pablogj.spotify2026.songs.domain.GetSongsUseCase;
import dev.pablogj.spotify2026.songs.domain.SaveSongUseCase;
import dev.pablogj.spotify2026.songs.domain.Song;
import dev.pablogj.spotify2026.songs.domain.SongRepository;

import java.util.ArrayList;

public class SongView {
    public static void printSongs(){
        GetSongsUseCase getSongsUseCase = new GetSongsUseCase(new SongDataRepository(SongsMemLocalDataSource.getInstance()));
         ArrayList<Song> songs = getSongsUseCase.execute();
        System.out.println("Songs: \n" + songs);
    }
    public static void saveSong(){
        Song songTest = new Song("3", "Hotel California", "Eagles", "6:30");
        SaveSongUseCase saveSongUseCase = new SaveSongUseCase(new SongDataRepository(SongsMemLocalDataSource.getInstance()));
        saveSongUseCase.execute(songTest);
        printSongs();
    }
}
