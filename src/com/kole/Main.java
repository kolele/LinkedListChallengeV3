package com.kole;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        LinkedList<Song> playList = new LinkedList<>();

        Album album = new Album("Kill em all", "Metallica");

        album.addSongToAlbum("Whiplash", 12.22);
        album.addSongToAlbum("Fuel", 11.1);
        album.addSongToAlbum("Memory remains", 2.32);
        album.addSongToAlbum("2x4", 12.42);
        album.addSongToAlbum("Prince Charming", 12.52);

        System.out.println("******************************************************");

        albums.add(album);

        album = new Album("Sol Invictus", "Faith No More");

        album.addSongToAlbum("Separation Anxiety", 2.44);
        album.addSongToAlbum("Matador", 3.11);
        album.addSongToAlbum("Cone Of Shame", 4.87);
        album.addSongToAlbum("Superhero", 2.31);
        album.addSongToAlbum("Easy", 2.87);

        System.out.println("******************************************************");

        albums.add(album);


        albums.get(0).addSongToPlayList("Whiplash", playList);
        albums.get(0).addSongToPlayList("2x4", playList);
        albums.get(0).addSongToPlayList("Prince Charming", playList);


        albums.get(1).addSongToPlayList("Superhero", playList);
        albums.get(1).addSongToPlayList("Matador", playList);
        albums.get(1).addSongToPlayList("Matador", playList);
    }

    public static void play(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        boolean quit = false;
        while (!quit){

        }
    }
}