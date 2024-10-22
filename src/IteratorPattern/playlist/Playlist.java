package IteratorPattern.playlist;


import IteratorPattern.iterator.GenreFilterIterator;
import IteratorPattern.iterator.SequentialIterator;
import IteratorPattern.iterator.ShuffleIterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public SequentialIterator getSequentialIterator() {
        return new SequentialIterator(songs);
    }

    public ShuffleIterator getShuffleIterator() {
        return new ShuffleIterator(songs);
    }

    public GenreFilterIterator getGenreFilterIterator(String genre) {
        return new GenreFilterIterator(songs, genre);
    }
}
