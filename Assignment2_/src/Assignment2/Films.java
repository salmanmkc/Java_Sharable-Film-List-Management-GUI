package Assignment2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Films {

	public static ArrayList<Film> filmlist;
	
	//data is private, therefore I use get methods
	private static int foundYear;
	private static double foundRating;
	private static double foundPrice;
	private static String foundReference;
	private static String foundName;
	static DecimalFormat formatter = new DecimalFormat("#.00"); // I use this to format the price in the table

	public Films() { //this is my constructor, when instantiating it creates a filmlist array list of Film objects
		filmlist = new ArrayList<Film>();
	}

	//below are my get methods so that the data can be accessed from my FilmAdder2 (GUI class) even though the data is private
	public static String getFoundName(){
		return foundName;
	}
	public static String getFoundRef(){
		return foundReference;
	}
	public static double getFoundRating(){
		return foundRating;
	}
	public static double getFoundPrice(){
		return foundPrice;
	}
	public static int getFoundYear(){
		return foundYear;
	}
	public static void sortPrice(int input) {
		// call Collections.sort passing filmlist and compare Film objects
		Collections.sort(filmlist, new Comparator<Film>() {
			// use Film objects o1, o2
			public int compare(Film o1, Film o2) {
				// sort by price
				if (input == 0) {
					return Double.compare(o1.getPrice(), o2.getPrice());
				} else {
					return Double.compare(o2.getPrice(), o1.getPrice());
				}
			}
		});
	}

	public static void sortRating(String input) {
		// call Collections.sort passing filmlist and compare Film objects
		Collections.sort(filmlist, new Comparator<Film>() {
			// use Film objects o1, o2
			public int compare(Film o1, Film o2) {
				// sort by rating
				if (input.equals("HighToLow")) {
					return Double.compare(o1.getRating(), o2.getRating());
				} else {
					return Double.compare(o2.getRating(), o1.getRating());
				}

			}
		});
	}

	public static void sortRef(String input) {
		// call Collections.sort passing filmlist and compare Film objects
		Collections.sort(filmlist, new Comparator<Film>() {
			// use Film objects o1, o2
			public int compare(Film o1, Film o2) {
				// sort by ref
				if (input.equals("HighToLow")) {
					return o1.getRef().toLowerCase().compareTo(o2.getRef().toLowerCase());
				} else {
					return o2.getRef().toLowerCase().compareTo(o1.getRef().toLowerCase());
				}

			}
		});
	}

	public static void sortName(String input) {
		// call Collections.sort passing filmlist and compare Film objects
		Collections.sort(filmlist, new Comparator<Film>() {
			// use Film objects o1, o2
			public int compare(Film o1, Film o2) {
				// sort by name
				if (input.equals("HighToLow")) {
					return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
				} else {
					return o2.getName().toLowerCase().compareTo(o1.getName().toLowerCase());
				}

			}
		});
	}

	public static void sortYear(String input) {
		// call Collections.sort passing filmlist and compare Film objects
		Collections.sort(filmlist, new Comparator<Film>() {
			// use Film objects o1, o2
			public int compare(Film o1, Film o2) {
				// sort by year
				if (input.equals("HighToLow")) {
					return Integer.compare(o1.getYear(), o2.getYear());
				} else {
					return Integer.compare(o2.getYear(), o1.getYear());
				}

			}
		});
	}

	public void add(Film film) {
		// adds the film to filmlist
		filmlist.add(film);
	}

	public static void writeToFile(File file) {
		// try to save the file
		try {
			// set output destination to where the user chose
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));
			// write filmlSist objects to binary file
			os.writeObject(filmlist);
			// close file
			os.close();
			// tell user that the file has been saved successfully
			JOptionPane.showMessageDialog(null, "Successfully saved " + file.getName(), "Success",
					JOptionPane.DEFAULT_OPTION);
		}
		// error saving file
		catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error saving file, try again", "Failed to write file",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void readFile(File file) {
		// try read file
		try {
			// read file that the user has selected
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
			// assign filmlist to the filmlist object that was read from the fil
			filmlist = (ArrayList<Film>) is.readObject();
			// close file
			is.close();
			// tell user that the file has been read successfully
			JOptionPane.showMessageDialog(null, "Successfully read " + file.getName(), "Success",
					JOptionPane.DEFAULT_OPTION);
			// if file is not found tell the user
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Please select a valid bat file", "Invalid file compatibility",
					JOptionPane.ERROR_MESSAGE);
			// if error in reading the file, tell the user
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error reading file", "File Error", JOptionPane.ERROR_MESSAGE);
			// if class not found tell the user to select a valid file
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Please select a valid bat file", "Invalid file compatibility",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public int getSize() {
		return filmlist.size();
	}

	public static boolean findFilmByRef(String refNo) {
		// creates temporary array
		ArrayList<String> temp = new ArrayList<String>();
		// boolean to check if found
		boolean found = false;
		// for every film in filmist
		for (int i = 0; i < filmlist.size(); i++) {
			//add every reference of every film in the list to the temp array
			temp.add(filmlist.get(i).getRef());
		}
		// for all references in temp
		for (int i = 0; i < temp.size(); i++) {
			// if it equals the refNo that the user entered then set variables
			if (temp.get(i).toLowerCase().equals(refNo.toLowerCase())) {
				//call method to set all static variables to properties of film at i
				setTempFromGet(i);
				// clear temp array
				temp.removeAll(temp);
				// set found to true
				found = true;
				// exit for loop
				break;
			}
		}
		//return value of found
		return found;
	}

	private static void setTempFromGet(int i) {
		foundName = filmlist.get(i).getName();
		foundReference = filmlist.get(i).getRef();
		foundRating = filmlist.get(i).getRating();
		foundPrice = filmlist.get(i).getPrice();
		foundYear = filmlist.get(i).getYear();
	}

	public static boolean findFilmByName(String nameEntered) {
		// creates temporary array
		ArrayList<String> temp = new ArrayList<String>();
		// blean to check if found
		boolean found = false;
		// for every film in filmlist
		for (int i = 0; i < filmlist.size(); i++) {
			///add every name of every film in the list to the temp array
			temp.add(filmlist.get(i).getName());
		}
		// for all names in temp
		for (int i = 0; i < temp.size(); i++) {
			// if it equals the nameEntered then set variables
			if (temp.get(i).toLowerCase().equals(nameEntered.toLowerCase())) {
				//call method to set all static variables to properties of film at i
				setTempFromGet(i);
				// remove everything from temp
				temp.removeAll(temp);
				// set found to true
				found = true;
				// exit for loop
				break;
			}
		}
		//return value of found
		return found;
	}

	public static int getEditIndexAndFindReference(String nameEntered) {
		// make a temporary arraylist
		ArrayList<String> temp = new ArrayList<String>();
		// create return val to return index of film in arraylist
		int returnval = 0;
		// add every film name in filmlist to temp arraylist
		for (int i = 0; i < filmlist.size(); i++) {
			temp.add(filmlist.get(i).getName());
		}
		// check every film name in temp
		for (int i = 0; i < temp.size(); i++) {
			// and check if it matches nameEntered
			if (temp.get(i).toLowerCase().equals(nameEntered.toLowerCase())) {
				// if it does set return val to the index
				returnval = i;
				// used to allow reuse of same reference in edit
				foundReference = filmlist.get(i).getRef();
				// clear temp arary
				temp.removeAll(temp);
				// break from for loop
				break;
			}
		}
		// return index
		return returnval;
	}

	public static void removeName(int comboBoxIndex) {
		// remove film based on comboBox index
		filmlist.remove(comboBoxIndex);
	}


	public static String highOrLowPrice(String input) {
		// create temporary array so that original array order is not affected
		ArrayList<Film> temp = new ArrayList<Film>();
		// each object in each array added to temporary array
		for (int i = 0; i < filmlist.size(); i++) {
			temp.add(filmlist.get(i));
		}
		// sort temporary array, the comparators used are Film objects
		Collections.sort(temp, new Comparator<Film>() {
			public int compare(Film o1, Film o2) {
				// sorted by price
				return Double.compare(o1.getPrice(), o2.getPrice());
			}
		});
		// if user enters 1 then give them the highest price string
		if (input.equals("Highest")) {
			return "Most expensive: " + temp.get(temp.size() - 1).getName() + " (price: £"
					+ formatter.format(temp.get(temp.size() - 1).getPrice()) + ")";
		}
		// if not give them the lowest price string
		else {
			return "Cheapest: " + temp.get(0).getName() + " (price: £" + formatter.format(temp.get(0).getPrice()) + ")";
		}
	}

	public static String highOrLowRating(String input) {
		// create temporary array so that original array order is not affected
		ArrayList<Film> temp = new ArrayList<Film>();
		// each object in each array added to temporary array
		for (int i = 0; i < filmlist.size(); i++) {
			temp.add(filmlist.get(i));
		}
		// sort temporary array, the comparators used are Film objects
		Collections.sort(temp, new Comparator<Film>() {
			public int compare(Film o1, Film o2) {
				// sorted by rating
				return Double.compare(o1.getRating(), o2.getRating());
			}
		});
		// if user enters 1 then give them the highest rated string
		if (input.equals("Highest")) {
			return "Highest rated: " + temp.get(temp.size() - 1).getName() + " ("
					+ temp.get(temp.size() - 1).getRating() + " stars)";
		}
		// if not give them the lowest rating string
		else {
			return "Lowest rated: " + temp.get(0).getName() + " (" + temp.get(0).getRating() + " stars)";
		}
	}

	public static String oldOrNew(String input) {
		// create temporary array so that original array order is not affected
		ArrayList<Film> temp = new ArrayList<Film>();
		// each object in each array added to temporary array
		for (int i = 0; i < filmlist.size(); i++) {
			temp.add(filmlist.get(i));
		}
		// sort temporary array, the comparators used are Film objects
		Collections.sort(temp, new Comparator<Film>() {
			public int compare(Film o1, Film o2) {
				// sorted by year
				return Double.compare(o1.getYear(), o2.getYear());
			}
		});
		// if user enters 1 then give them the latest film string
		if (input.equals("Newest")) {
			return "Latest film: " + temp.get(temp.size() - 1).getName() + " (" + temp.get(temp.size() - 1).getYear()
					+ ")";
		}
		// if not give them the oldest film string
		else {
			return "Oldest film: " + temp.get(0).getName() + " (" + temp.get(0).getYear() + ")";
		}
	}

}
