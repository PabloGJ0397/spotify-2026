package dev.pablogj.spotify2026.songs.domain;

public class SaveSongUseCase {
    private SongRepository songRepository;

    public SaveSongUseCase(SongRepository songRepository) {
        this.songRepository = songRepository;
    }
    public void execute(Song song){
        songRepository.saveSong(song);
    }

}
