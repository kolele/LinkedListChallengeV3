package com.kole;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        LinkedList<Song> playList = new LinkedList<>();

        Album album = new Album("Kill em all", "Metallica");
        albums.get(0).addSongToPlayList("Kobasica", playList);
    }
}
