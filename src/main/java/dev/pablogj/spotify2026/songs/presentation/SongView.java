package dev.pablogj.spotify2026.songs.presentation;

import dev.pablogj.spotify2026.songs.data.SongDataRepository;
import dev.pablogj.spotify2026.songs.domain.GetSongsUseCase;
import dev.pablogj.spotify2026.songs.domain.Song;
import dev.pablogj.spotify2026.songs.domain.SongRepository;

import java.util.ArrayList;

public class SongView {
    public static void printSongs(){
        GetSongsUseCase getSongsUseCase = new GetSongsUseCase(new SongDataRepository());
         ArrayList<Song> songs = getSongsUseCase.execute();
        System.out.println("Songs: \n" + songs);


    }
}
