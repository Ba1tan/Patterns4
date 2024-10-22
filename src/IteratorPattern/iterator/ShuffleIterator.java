package IteratorPattern.iterator;


import IteratorPattern.playlist.Song;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ShuffleIterator implements Iterator<Song> {
    private List<Song> songs;
    private int position = 0;

    public ShuffleIterator(List<Song> songs) {
        this.songs = songs;
        Collections.shuffle(this.songs);
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(position++);
    }
}
