package com.gmail.manjko;

public class MusicRunner {

	public static void main(String[] args) {
		byte[] b = {1};
		SongContent c = new SongContent(b);
		
		Playlist p1 = new Playlist("Trance");
		Playlist p2 = new Playlist("Rock");
		
		Song s1 = new Song("Alpha", "ATB", "Trance", 3, c);
		Song s2 = new Song("Serenity", "Armin", "Trance", 6, c);
		Song s3 = new Song("SMGO", "Queen", "Rock", 4, c);
		Song s4 = new Song("Wind of Change", "scorpions", "Rock", 4, c);
		
		p1.addSong(s1);
		p1.addSong(s2);
		p2.addSong(s3);
		p2.addSong(s4);
		
		System.out.println(p1.getTotalLength());
		System.out.println(p1.findAuthor("ATB"));
		System.out.println(p2.findTitle("SMGO"));

	}

}
