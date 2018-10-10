package com.gmail.manjko;

import java.util.ArrayList;

public class Playlist {
	private final String title;
	private final ArrayList<Song> songs = new ArrayList<>();
	
	public Playlist(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
	public void addSong(Song song) {
		songs.add(song);
	}

	public long getTotalLength() {
		long totalLength =0;
		for(Song song:songs) {
			totalLength += song.getLenght();
		}
		return totalLength;
	}
	
	 public ArrayList<Song> findTitle(String title){
	        ArrayList<Song> Title =  new ArrayList<>();
	        for (Song elem:songs) {
	            if (elem.getTitle().equalsIgnoreCase(title)){
	                Title.add(elem);
	            }
	        }
	        return Title;
	    }
	 
	 public ArrayList<Song> findAuthor(String author){
	        ArrayList<Song> Author =  new ArrayList<>();
	        for (Song elem:songs) {
	            if (elem.getAuthor().equalsIgnoreCase(author)){
	            	Author.add(elem);
	            }
	        }
	        return Author;
	    }

	@Override
	public String toString() {
		return "Playlist [title=" + title + ", songs=" + songs + "]";
	}
	 
	 
}
