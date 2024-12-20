package hust.soict.dsai.aims.media;

import java.util.Objects;
import java.util.Scanner;

public class track implements Playable{
	private String title;
	private int length;
	
	public track() {
		super();
	}
	
	public track(String title) {
		this.title = title;
	}
	
	public track(String title, int length) {
		this(title);
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}
	public String getDetails() {
		return String.format("Title: %s\nLength: %dm.\n", title, length).replaceAll(" null | 0 ", " Unknown ");
	}
	public void play() {
		System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		track other = (track) obj;
		return length == other.length && Objects.equals(title, other.title);
	}
	public static track createTrack() {
		String title;
		int length;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter track title: ");
		title = sc.nextLine();
		
		System.out.print("Enter track length: ");
		length = sc.nextInt();
		
		return new track(title, length);
	}
} 