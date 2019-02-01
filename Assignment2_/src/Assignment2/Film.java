package Assignment2;

import java.io.Serializable;
import java.util.Random;

public class Film implements Serializable{
	
	//all the properties of film, these are private so can only be accessed by other classes with my get methods and set methods
	private String name;
	private String ref;
	private double rating;
	private double price;
	private int year;

	//default constructor class, if no parameters are passed in, then this will run
	public Film() {
		//random number for the reference is generated
		Random rand = new Random();
		int n = rand.nextInt(100000) + 1;
		set("unknown", String.valueOf(rand),0.0,0.0,0);
	}

	
	//if they enter the name, reference, rating, price and year then it will call the set method
	public Film(String name, String ref, double rating, double price, int year) {
		set(name,ref,rating,price, year);
	}

	//the set method is called by the constructor and it calls the individual methods to set each variable
	public void set(String name, String ref, double rating, double price, int year) {
		setName(name);
		setRef(ref);
		setRating(rating);
		setPrice(price);
		setYear(year);
	}

	//get all properties by calling each individual method
	public void get() {
		getName();
		getRef();
		getRating();
		getPrice();
		getYear();
	}
	
	
	//below are all the individual set methods for each variable
	public void setName(String name) { //sets name to what is passed in 
		this.name = name;
	}
	
	public void setRef(String ref) { //sets ref to what is passed in 
		this.ref = ref;
	}
	
	public void setRating(double rating) { //sets rating to what is passed in 
		this.rating = rating;
	}
	
	public void setPrice(double price) { //sets price to what is passed in 
		this.price = price;
	}
	public void setYear(int year) { //sets year to what is passed in 
		this.year = year;
	}
	
	public String getName() { //gets the name and returns it
		return name;
	}
	
   public String getRef() { //gets the ref and returns it
	   return ref;
   }
   
   public double getRating() { //gets the rating and returns it
	   return rating;
   }
   
   public double getPrice() { //gets the price and returns it
	   return price;
   }
   public int getYear() { //gets the year and returns it
	   return year;
   }


}


