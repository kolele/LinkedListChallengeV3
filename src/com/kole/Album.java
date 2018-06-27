package com.kole;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public void addSongToPlayList(int songIndex, LinkedList<Song> playList){
        if (songIndex>=0 && songIndex<=this.songs.size()){
            System.out.println("Added song with index " + songIndex + " to album");
            playList.add(this.songs.get(songIndex));
        }else {
            System.out.println("No song with index " + songIndex + " in album");
        }
    }

    public void addSongToPlayList(String songName, LinkedList<Song> playList){
        Song tempSong = returnSong(songName);
        if (tempSong!=null){
            System.out.println("Song is already on playlist");
        }else {
            System.out.println("Added song with name " + songName + " to playlist");
            playList.add(returnSong(songName));
        }
    }

    public void addSongToAlbum(String songName, String songArtist, double duration){
        if (returnSong(songName)!=null){
            System.out.println("Added song " + songName + " to the album");
            this.songs.add(new Song(songName,duration));
        }else {
            System.out.println("Song is already on the album");
        }
    }

    private Song returnSong(String songName){
        for (Song tempSong : this.songs){
            if (tempSong.getName().equals(songName)){
                return tempSong;
            }
        }return null;
    }
}
