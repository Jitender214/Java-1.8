package com.test;

import java.util.ArrayList;
import java.util.List;

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }
    int repeat=0;
    public boolean isRepeatingPlaylist() {
    	if(this.nextSong==null) {
    		return false;
    	}
    	else {
    		repeat++;
    		if(repeat>1)
    			return true;
    	}
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    	return this.isRepeatingPlaylist();
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);
       
        System.out.println(first.isRepeatingPlaylist());
    }
}