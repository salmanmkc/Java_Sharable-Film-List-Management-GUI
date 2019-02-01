package Assignment2;

public class TestFilm {

	public static void main(String args[]) {
	Film film1 = new Film();
	Film film2 = new Film("Conjuring","OAIJS",5,4.99);
	Film film3 = new Film();
	film3.ask();
	
	film1.print();
	film2.print();
	film3.print();
	}
}
