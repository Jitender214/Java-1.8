package com.test;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie{
	String name;
	String hero;
	String director;
	public Movie(String name, String hero, String director) {
		super();
		this.name = name;
		this.hero = hero;
		this.director = director;
	}
}
	
public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> l = new ArrayList<Movie>();
		populate(l);
		Consumer<Movie> c = m->{
			System.out.println("Movie Name "+m.name);
			System.out.println("Hero Name "+m.hero);
			System.out.println("Director Name "+m.director);
		};
	for(Movie m : l) {
		c.accept(m);
	}
	}
	
	public static void populate(ArrayList<Movie> l) {
		l.add(new Movie("Maharshi","MaheshBabu","Vamshi"));
		l.add(new Movie("Sahoo","Prabhas","Sujit"));
		l.add(new Movie("Bharat Ane Nenu","MaheshBabu","Siva"));
	}

}
