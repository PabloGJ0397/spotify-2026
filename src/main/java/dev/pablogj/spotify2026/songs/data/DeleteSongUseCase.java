package dev.pablogj.spotify2026.songs.data;

import dev.pablogj.spotify2026.songs.domain.SongRepository;

public class DeleteSongUseCase {
    private SongRepository songRepository;

    public DeleteSongUseCase(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public void execute(String id){
        songRepository.deleteSong(id);
    }
}
