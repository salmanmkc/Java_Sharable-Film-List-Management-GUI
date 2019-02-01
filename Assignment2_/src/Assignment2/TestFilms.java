package Assignment2;

public class TestFilms {
	public static void main(String[] args) {
		Film film1 = new Film();
		Film film2 = new Film("Conjuring", "C1FJW", 5, 4.99);
		Films films = new Films();
		films.add(film1);
		films.add(film2);
		
		System.out.println("There are " + films.getSize() + " films in the container");
		films.printFilms();
		films.delFlim(film1);
		System.out.println("There are " + films.getSize() + " films in the container");
		
	}
}
