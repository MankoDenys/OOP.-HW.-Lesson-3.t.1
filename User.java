package com.gmail.manjko;

import java.util.ArrayList;

public class User {
	private final String name;
	private  final ArrayList<Playlist> playlists = new ArrayList<>();
	
	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Playlist createPlaylist(String newPlaylist) {
		return new Playlist(newPlaylist);
	}
	
	public Playlist findByTitle (String title) {
        for (Playlist elem: playlists) {
            if (elem.getTitle().equalsIgnoreCase(title))
                return elem;
        }
        return null;
	}
	
	public void addSongToPlaylist(String newPlaylist, Song song) {
		findByTitle(newPlaylist).addSong(song);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", playlists=" + playlists + "]";
	}

	
}
