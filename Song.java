package com.gmail.manjko;

public class Song {
	private final String title;
	private final String author;
	private final String genre;
	private final int lenght;
	private final SongContent content;
	
	public Song(String title, String author, String genre, int lenght,
			SongContent content) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.lenght = lenght;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}

	public int getLenght() {
		return lenght;
	}

	public SongContent getContent() {
		return content;
	}

	public String toString() {
		return "Song [title=" + title + ", author=" + author + ", genre="
				+ genre + ", lenght=" + lenght + ", content=" + content + "]";
	}
	
	
	
	
	

}
