package IteratorPattern;

import IteratorPattern.playlist.Playlist;
import IteratorPattern.playlist.Song;
import IteratorPattern.iterator.SequentialIterator;
import IteratorPattern.iterator.ShuffleIterator;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song A", "Artist 1", "Pop"));
        playlist.addSong(new Song("Song B", "Artist 2", "Rock"));
        playlist.addSong(new Song("Song C", "Artist 1", "Pop"));
        playlist.addSong(new Song("Song D", "Artist 3", "Jazz"));

        System.out.println("Sequential Playlist:");
        SequentialIterator sequentialIterator = playlist.getSequentialIterator();
        while (sequentialIterator.hasNext()) {
            Song song = sequentialIterator.next();
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }

        System.out.println("\nShuffled Playlist:");
        ShuffleIterator shuffleIterator = playlist.getShuffleIterator();
        while (shuffleIterator.hasNext()) {
            Song song = shuffleIterator.next();
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }
    }
}
