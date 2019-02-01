package Assignment2;

public class Menu {
	static Film film;
	static Films films = new Films();
	static boolean finished = false;

	public static void main(String args[]) {
		while(!finished) {


			System.out.println("1: Add default film to list");
			System.out.println("2: Add film to list");
			System.out.println("3: Output how many films");
			System.out.println("4: Print films");
			System.out.println("5: Find reference  number");
			System.out.println("6: test");
			char input = Console.askChar("Enter your choice");
			switch(input) {
			case '1': 
				addHandler();
				break;
			case '2': 
				addHandlerCustom();
				break;
			case '3':
				sizeHandler();
				break;
			case '4':
				printHandler();
				break;
			case '5':
				//films.removeName(Console.askString(""));
				break;
			case '6':
				for(int i = 0; i < films.getSize();i++) {
					System.out.println(films.names.get(i));
				}
				break;
			case 'Q':
				finished = !finished;
			default:
				System.out.println("Invalid entry");
			}
		}
	}

	public static void addHandler() {
		film = new Film();
		films.add(film);
	}

	public static void addHandlerCustom() {
		film = new Film();
		film.ask();
		films.add(film);
	}

	public static void sizeHandler() {
		System.out.println(films.getSize());
	}

	public static void printHandler() {
		films.printFilms();
	}

	public static void findHandler() {
		film = new Film();
		String ref = film.askRefNo("Enter ref no: ");
		if (films.findFilmByRef(ref) != null) {
			System.out.println("Film found: " + films.findFilmByRef(ref));
		} else {
			System.out.println("Not found");
		}
	}

}
