package Assignment2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.Toolkit;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GUI {

	private JFrame frmFilmAdderMade;

	static Film film;
	public static Films films = new Films();
	static boolean finished = false;
	private JTextField textField;
	private JTextField txtExitApplication;
	private JTextField txtName;
	private JTextField txtRef;
	private JTextField txtRating;
	private JTextField txtPrice;
	private int initialX;
	private int initialY;
	DecimalFormat formatter = new DecimalFormat("#.00"); // I use this to format the price in the table
	JLayeredPane layeredPane = new JLayeredPane();
	JLayeredPane layeredPane2 = new JLayeredPane();
	JPanel findName = new JPanel();
	JPanel findRef = new JPanel();
	JPanel panelAddFilm = new JPanel();
	JPanel panelIntro = new JPanel();
	JPanel panelFind = new JPanel();
	JPanel panelOverview = new JPanel();
	JPanel panelViewAll = new JPanel();
	JPanel panelEdit = new JPanel();
	JPanel panelRemove = new JPanel();
	DefaultTableModel model = new DefaultTableModel();
	int count = 0;
	JPanel panel_2 = new JPanel();
	private JTextField txtNumberOfFilms;
	JLabel topNoOfFilms = new JLabel("Number of films: 0");
	private JTextField enterName;
	private JTextField enterRef;
	private JTable table;
	private JTextField loadNameTxt;
	private JTextField loadRatingTxt;
	private JTextField loadPriceTxt;
	private JTextField filmtoload;
	private JTextField loadRefTxt;
	JButton addFilmButton = new JButton("Add");
	JButton refCheck = new JButton("Check if exists");
	JButton nameCheck = new JButton("Check if exists");
	JButton loadBtn = new JButton("load");
	JButton btnSaveFile = new JButton("save file");
	JButton btnLoadFile = new JButton("Load file");
	JButton btnSave = new JButton("Save");
	String selectedCombo;
	JLabel appearName = new JLabel("Name:");
	JLabel appearRef = new JLabel("Reference:");
	JLabel appearRating = new JLabel("Rating:");
	JLabel appearPrice = new JLabel("Price:");
	JLabel lblPrice_1 = new JLabel("Name:");
	JLabel lblRating_1 = new JLabel("Reference:");
	JLabel lblReference_1 = new JLabel("Rating:");
	JLabel lblYear_1 = new JLabel("Year:");
	JLabel lblName = new JLabel("Price:");
	JLabel appearYear = new JLabel("Year:");
	JComboBox comboBoxRemove = new JComboBox();
	JComboBox comboBoxEdit = new JComboBox();
	private JTextField txtMostExpensive;
	private JTextField txtCheapest;
	private JTextField txtHighestRatedFilm;
	private JTextField txtLowestRatedFilm;
	private boolean clicked = false;
	private boolean clicked1 = false;
	private boolean clicked2 = false;
	private boolean clicked3 = false;
	private boolean clicked4 = false;
	JButton btnSortByName = new JButton("Name");
	JButton btnSortByPrice = new JButton("Price");
	JButton btnSortByReference = new JButton("Reference");
	JButton btnSortByRating = new JButton("Rating");
	JButton btnSortByYear = new JButton("Year");
	private JTextField txtYear;
	private JTextField loadYearTxt;
	private JTextField latestFilm;
	private JTextField oldestFilm;
	private JTextField outYear;
	JLabel outNameLabel = new JLabel("");
	JLabel outRefLabel = new JLabel("");
	JLabel outRatingLabel = new JLabel("");
	JLabel outPriceLabel = new JLabel("");
	JLabel outYearLabel = new JLabel("");
	boolean refFound = false;
	boolean refNameFound = false;
	private final JLabel outNameNameLabel = new JLabel("");
	private final JLabel outNameReferenceLabel = new JLabel("");
	private final JLabel outNameRatingLabel = new JLabel("");
	private final JLabel outNamePriceLabel = new JLabel("");
	private final JLabel outNameYearLabel = new JLabel("");
	private final JLabel draggableBar = new JLabel("");
	JPanel panel = new JPanel();
	JButton btnOverview = new JButton("Overview");
	JButton btnAddFilm = new JButton("Add Film");
	JButton btnRemove = new JButton("Remove");
	JButton btnFind = new JButton("Find");
	JButton btnViewAll = new JButton("View All");
	JLabel lblWelcome = new JLabel("Welcome");
	JPanel panel_1 = new JPanel();
	JLabel lblFilmAdder = new JLabel("Film Adder");
	JButton PowerButton = new JButton("");
	JButton btnEdit = new JButton("Edit");
	JButton btnRef = new JButton("Ref");
	JButton btnName = new JButton("Name");
	JLabel lblEnterTheReference = new JLabel("Enter the reference of the film:");
	JLabel lblWelcome_1 = new JLabel("Welcome");
	JLabel label = new JLabel("release, their rating, and even their price.  ");
	JLabel label_1 = new JLabel("You can add films, remove films, search for films, and  ");
	JLabel label_2 = new JLabel("you can even view all the films you have added before. ");
	JLabel lblNewLabel = new JLabel("Name:");
	JLabel lblRating = new JLabel("Rating:");
	JLabel lblPrice = new JLabel("Price:");
	JLabel lblYearOfRelease = new JLabel("Year:");
	JLabel lblAllTheFilms = new JLabel("All the films that have been added to Film Adder");
	JLabel lblNewLabel_1 = new JLabel("Click a header to sort, click again to toggle ascending/descending");
	JLabel label_3 = new JLabel("Name:");
	JLabel label_4 = new JLabel("Reference:");
	JLabel label_5 = new JLabel("Rating:");
	JLabel label_6 = new JLabel("Price:");
	JLabel lblNewLabel_2 = new JLabel("Film to edit (name):");
	JLabel lblYear = new JLabel("Year:");
	JButton removeFilmButton = new JButton("Remove");
	JLabel lblChooseTheFilm = new JLabel("Choose the film that you want to remove form the drop down menu");
	JLabel lblReference = new JLabel("Reference:");
	JLabel lblEnterTheName = new JLabel("Enter the name of the film:");
	JButton btnIntructions = new JButton("Instructions");
	JPanel panel_highlight = new JPanel();
	JLabel firstlineOverview = new JLabel("Below is an overview of all the films you have");
	JLabel lblWithThisApp = new JLabel("With this app you will be able to store films, their year of  ");

	JScrollPane scrollPane = new JScrollPane();

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmFilmAdderMade.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// prompt user that they can load data before the program starts
		JOptionPane.showMessageDialog(null, "Previous data can be loaded from the view all tab", "Welcome",
				JOptionPane.DEFAULT_OPTION);
		// initialise components
		initializeComponents();

		// set up the rest of the components
		setUpComopnents();

		// disable all the buttons at start up
		disableAllMainPanelButtons();
		
		//limit text box user input using regular expressions
		txtYear.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				enterValidYear(e, txtYear);
			}
		});
		loadYearTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				enterValidYear(e, loadYearTxt);
			}
		});
		txtRating.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				enterValidPriceOrRating(e, txtRating);
				}

		});
		loadRatingTxt.addKeyListener(new KeyAdapter() {
			@Override
				public void keyTyped(KeyEvent e) {
				enterValidPriceOrRating(e, loadRatingTxt);
				}
		});
		
		txtPrice.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				enterValidPriceOrRating(e, txtPrice);
			}
		});
		loadPriceTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				enterValidPriceOrRating(e, loadPriceTxt);
			}
		});
		

//*****************BUTTON CONTROLS***************************************************

		// when the user clicks the instruction navigation button
		btnIntructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadInstructions();
			}
		});

		// when the user clicks the overview navigation button
		btnOverview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadOverview();
			}
		});

		// when the user clicks the add film navigation button
		btnAddFilm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadAddFilm();
			}
		});

		// when the user clicks the remove navigation button
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadRemove();
			}
		});

		// when the user clicks the find navigation button
		btnFind.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				loadFind();
			}
		});

		// when the user clicks the view all navigation button
		btnViewAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadViewAll();
			}
		});

		// when the user clicks the edit navigation button
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadEdit();
			}
		});

		// when the user clicks power button
		PowerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// enables the user to drag the application around without the standard top bar
		draggableBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				mouseDrag(e);
			}
		});
		draggableBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mousePress(e);
			}
		});

		// load the find by reference sub panel within the find menu
		btnRef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadSubPanelRef();
			}
		});

		// load the find by name sub panel within the find menu
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadSubPanelName();
			}
		});

		// when the user clicks the button to check by reference
		refCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findByRef();
			}
		});

		// when the user clicks the button to check by name
		nameCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findByName();
			}
		});

		// when the user clicks the button to add the film
		addFilmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addFilm();
			}

		});

		// when the user clicks the save file button
		btnSaveFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveFile();
			}
		});

		// when the user clicks the load file button
		btnLoadFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadFile();
			}
		});

		// click this button to load a film from the edit menu
		loadBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadFilm();
			}
		});

		// after editing click this to save
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveFilm();
			}
		});

		// click this button to remove the film
		removeFilmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeFilm();
			}
		});

		// when the user clicks the sort by rating button
		btnSortByRating.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortRating();
			}
		});

		// when the user clicks the sort by reference button\
		btnSortByReference.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortReference();
			}

		});

		// when the user clicks the sort by name button
		btnSortByName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortName();
			}
		});

		// when the user clicks the sort by year button
		btnSortByYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortYear();
			}
		});

		// when the user clicks the sort by price button
		btnSortByPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortPrice();
			}

		});

	}

	private void layeredPane2() {
		layeredPane2.setBounds(0, 67, 657, 461);
		panelFind.add(layeredPane2);
	}

	private void comboBox() {
		comboBoxRemove.setBounds(78, 105, 280, 50);
		layeredPane.setLayer(panelRemove, 0);
		panelRemove.add(comboBoxRemove);
	}

	private void filmtoload() {
		layeredPane.setLayer(panelEdit, 0);
		panelEdit.add(filmtoload);
		filmtoload.setColumns(10);
	}

	private void panelEdit() {
		panelEdit.setBounds(0, 0, 657, 508);
		layeredPane.add(panelEdit);
		panelEdit.setLayout(null);
	}

	private void panel_2() {
		panel_2.setBackground(SystemColor.activeCaption);
		panel_2.setBounds(0, 56, 186, 10);
		panelFind.add(panel_2);
	}

	private void setUpComopnents() {
		setNameAndTitleAndIcon();
		frame();
		// below removes the top bar and minimize button etc.
		removeTopBar();
		// the buttons on the side (navigation menu)
		sidePanel(panel);
		// the panel which shows which panel is the active tab/screen
		highlightPanel(panel, panel_highlight);
		// side buttons
		drawSideButtons();
		labelWelcome(panel, lblWelcome);
		labelFilmAdder(panel_1, lblFilmAdder);
		buttonPower(panel, PowerButton);
		topNoOfFilms();
		layeredPane();
		panelFind();
		panel_1(panel_1);
		panelEdit();
		addButton();
		buttonLoad();
		filmtoload();
		draggableBar.setBounds(0, 0, 852, 75);
		frmFilmAdderMade.getContentPane().add(draggableBar);
		lblEnterTheReference();
		lblPrice_1();
		lblRating_1();
		lblReference_1();
		lblName();
		lblYear_1();
		outYear();
		frmFilmAdderMade.getContentPane().add(panel_1);
		outNameLabel();
		outRefLabel();
		outRatingLabel();
		outPriceLabel();
		outYearLabel();
		comboBox();
		findName();
		enterName();
		lblEnterTheName(lblEnterTheName);
		appearPrice();
		appearRating();
		appearRef();
		appearName();
		panelOverview();
		txtLowestRatedFilm();
		txtCheapest();
		txtNumberOfFilms();
		txtMostExpensive();
		txtHighestRatedFilm();
		firstlineOverview(firstlineOverview);
		latestFilm.setEditable(false);
		latestFilm();
		oldestFilm.setEditable(false);
		oldestFilm();
		panelIntro();
		lblWelcome_1(lblWelcome_1);
		lblWithThisApp(lblWithThisApp);
		label(label);
		label_1(label_1);
		label_2(label_2);
		panelAddFilm();
		lblNewLabel(lblNewLabel);
		setUpTable();
		label_3(label_3);
		loadNemeTxt();
		label_4(label_4);
		loadRatingTxt();
		label_5(label_5);
		loadPriceTxt();
		label_6(label_6);
		lblYearOfRelease(lblYearOfRelease);
		lblNewLabel_1(lblNewLabel_1);
		btnSaveFile();
		btnLoadFile();
		btnSave();
		btnSave();
		btnPrice();
		loadRefTxt();
		lblYear(lblYear);
		loadYear();
		panelRemove();
		btnNewButton_2(removeFilmButton);
		lblChooseTheFilm(lblChooseTheFilm);
		layeredPane2();
		buttonRating();
		buttonReference();
		btnName_1();
		buttonYear();
		lblNewLabel_2(lblNewLabel_2);
		txtName();
		txtRef();
		lblReference(lblReference);
		txtRating();
		lblRating(lblRating);
		txtPrice();
		lblPrice(lblPrice);
		txtYear();
		buttonRefCheck();
		panel_2();
		buttonRef(btnRef);
		buttonNameCheck();
		buttonName(btnName);
		findRef();
		enterRef();
		panelViewAll();
		lblAllTheFilms(lblAllTheFilms);
		exitApplication(panel);
		setUpComboBoxEdit();
		scrollPaneSetUp();
		textField();
	}

	private void drawSideButtons() {
		navButton(btnIntructions, 10, 74, 186, 66);
		navButton(btnOverview, 10, 139, 186, 66);
		navButton(btnAddFilm, 10, 204, 186, 66);
		navButton(btnRemove, 10, 269, 186, 66);
		navButton(btnFind, 10, 334, 186, 66);
		navButton(btnViewAll, 10, 399, 186, 66);
		navButton(btnEdit, 10, 463, 186, 66);
	}

	private void scrollPaneSetUp() {
		// table needs to be in a JScrollPane to make the cells visible and this allows
		// an infinite amount of entries
		// if there are more entries that can fit on the screen, this enables scrolling
		scrollPane.setBounds(23, 116, 610, 341);
		// adding the panel to the scrollpane
		panelViewAll.add(scrollPane);
		scrollPane.setViewportView(table);
	}

	private void panelFind() {
		// panelFind.setBackground(new Color(147, 112, 219));
		panelFind.setBackground(new Color(119, 103, 153));
		// panelFind.setBackground(new Color(102, 102, 153));
		panelFind.setBounds(0, 0, 657, 508);
		layeredPane.add(panelFind);
		panelFind.setLayout(null);
	}

	private void layeredPane() {
		layeredPane.setBounds(194, 75, 657, 531);
		frmFilmAdderMade.getContentPane().add(layeredPane);
		layeredPane.setLayer(panelFind, 0);
	}

	private void outYear() {
		outYear = new JTextField();
		outYear.setOpaque(false);
		outYear.setColumns(10);
		outYear.setBorder(null);
		outYear.setBounds(311, 270, 204, 20);
		findRef.add(outYear);
	}

	private void lblYear_1() {
		lblYear_1.setBounds(114, 271, 46, 14);
		lblYear_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblYear_1.setVisible(false);
		findRef.add(lblYear_1);
	}

	private void lblName() {
		lblName.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblName.setVisible(false);
		lblName.setBounds(114, 246, 46, 14);
		findRef.add(lblName);
	}

	private void lblReference_1() {
		lblReference_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblReference_1.setVisible(false);
		lblReference_1.setBounds(114, 218, 96, 17);
		findRef.add(lblReference_1);
	}

	private void lblRating_1() {
		lblRating_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblRating_1.setVisible(false);
		lblRating_1.setBounds(114, 194, 77, 14);
		findRef.add(lblRating_1);
	}

	private void lblPrice_1() {
		lblPrice_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblPrice_1.setVisible(false);
		lblPrice_1.setBounds(114, 166, 46, 14);
		findRef.add(lblPrice_1);
	}

	private void lblEnterTheReference() {
		lblEnterTheReference.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblEnterTheReference.setBounds(40, 16, 258, 55);
		findRef.add(lblEnterTheReference);
	}

	private void setUpComboBoxEdit() {
		comboBoxEdit.setBounds(252, 31, 179, 36);
		panelEdit.add(comboBoxEdit);
	}

	private void initializeComponents() throws HeadlessException {
		frmFilmAdderMade = new JFrame();
		txtExitApplication = new JTextField();
		txtCheapest = new JTextField();
		txtLowestRatedFilm = new JTextField();
		txtHighestRatedFilm = new JTextField();
		latestFilm = new JTextField();
		oldestFilm = new JTextField();
		txtName = new JTextField();
		txtRef = new JTextField();
		txtRating = new JTextField();
		
		txtPrice = new JTextField();
		txtYear = new JTextField();
	
		loadNameTxt = new JTextField();
		loadRatingTxt = new JTextField();
	
		loadPriceTxt = new JTextField();
	
		filmtoload = new JTextField();
		loadYearTxt = new JTextField();
	
		txtNumberOfFilms = new JTextField();
		txtMostExpensive = new JTextField();
		table = new JTable();
	}

	public boolean checkIfNumber(char ch){
		//if it is a number return true, if not return false
        return ch >= '0' && ch <= '9';
	}



	public boolean fixOrAllowDecimalPoint(char c, JTextField textField) {
		// if it isn't a decimal point return false
		if (c != '.') {
			return false;
		}
		// if it is a decimal point and it is empty then set the text to have 0 in front of the decimal point, return false
		if (textField.getText() == null || "".equals(textField.getText().trim())) {
			textField.setText("0.");
			return false;
		//if it already contains a decimal point, return false
		} else if (textField.getText().contains(".")) {
			return false;
		}
		return true;
	}

	private void hightlightWhenHoverOver(JButton button) {
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// when the mouse is in the button
				buttonLight(button);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// when the mouse is not in the button
				buttonLeave(button);
			}
		});
	}

	public void setNameAndTitleAndIcon() {
		frmFilmAdderMade.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(GUI.class.getResource("/Assignment2/images/filmiconsmaller.png")));
		frmFilmAdderMade.setTitle("Film Adder made by Salman Muin Kayser Chishti");
		frmFilmAdderMade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void removeTopBar() {
		// size of the window
		frmFilmAdderMade.setSize(850, 575);
		// terminates the process when the user closes the program
		frmFilmAdderMade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// gets rid of the top bar
		frmFilmAdderMade.setUndecorated(true);
		// frmFilmAdderMade.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		// stops the user from being able to resize the window
		frmFilmAdderMade.setResizable(false);
		// frmFilmAdderMade.setVisible (true); bugs because I call it before
	}

	private void enterName() {
		enterName = new JTextField();
		enterName.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		enterName.setColumns(10);
		enterName.setBounds(311, 36, 151, 20);
		findName.add(enterName);
	}

	private void findName() {
		findName.setBounds(0, 0, 657, 461);
		findName.setLayout(null);
		layeredPane2.add(findName);
	}

	private void outYearLabel() {
		outYearLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		outYearLabel.setBounds(317, 273, 185, 14);
		findRef.add(outYearLabel);
	}

	private void outPriceLabel() {
		outPriceLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		outPriceLabel.setBounds(317, 248, 185, 14);
		findRef.add(outPriceLabel);
	}

	private void outRatingLabel() {
		outRatingLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		outRatingLabel.setBounds(317, 220, 185, 14);
		findRef.add(outRatingLabel);
	}

	private void outRefLabel() {
		outRefLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		outRefLabel.setBounds(317, 194, 185, 20);
		findRef.add(outRefLabel);
	}

	private void outNameLabel() {
		outNameLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		outNameLabel.setBounds(317, 166, 185, 20);
		findRef.add(outNameLabel);
	}

	private void findRef() {
		findRef.setLayout(null);
		findRef.setBounds(0, 0, 657, 461);
		layeredPane2.add(findRef);
	}

	private void frame() {
		frmFilmAdderMade.setResizable(false);
		frmFilmAdderMade.setBounds(100, 100, 854, 613);
		frmFilmAdderMade.setLocationRelativeTo(null);
	}

	private void lblChooseTheFilm(JLabel lblChooseTheFilm) {
		lblChooseTheFilm.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblChooseTheFilm.setBounds(55, 40, 531, 39);
		panelRemove.add(lblChooseTheFilm);
	}

	private void panelRemove() {
		panelRemove.setBounds(0, 0, 657, 508);
		layeredPane.add(panelRemove);
		panelRemove.setLayout(null);
	}

	private void loadYear() {
		loadYearTxt.setColumns(10);
		loadYearTxt.setBounds(264, 326, 179, 34);
		panelEdit.add(loadYearTxt);
	}

	private void lblYear(JLabel lblYear) {
		lblYear.setFont(new Font("Century Gothic", Font.PLAIN, 27));
		lblYear.setBounds(66, 323, 161, 34);
		panelEdit.add(lblYear);
	}

	private void lblNewLabel_2(JLabel lblNewLabel_2) {
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(10, 31, 232, 38);
		panelEdit.add(lblNewLabel_2);
	}

	private void loadRefTxt() {
		loadRefTxt = new JTextField();
		loadRefTxt.setColumns(10);
		loadRefTxt.setBounds(264, 191, 179, 34);
		panelEdit.add(loadRefTxt);
	}

	private void btnSave() {
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		flattenButton(btnSave);
		btnSave.setBackground(new Color(102, 102, 153));
		btnSave.setBounds(264, 402, 186, 66);
		hightlightWhenHoverOver(btnSave);
		panelEdit.add(btnSave);
	}

	private void textField() {
		textField = new JTextField();
		textField.setBorder(null);
		textField.setBounds(85, 369, 171, 20);
		textField.setOpaque(false);
		textField.setColumns(10);
	}

	private void lblAllTheFilms(JLabel lblAllTheFilms) {
		lblAllTheFilms.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblAllTheFilms.setBounds(150, 11, 370, 29);
		panelViewAll.add(lblAllTheFilms);
	}

	private void panelViewAll() {
		panelViewAll.setBounds(0, 0, 657, 508);
		layeredPane.add(panelViewAll);
		panelViewAll.setLayout(null);
	}

	private void lblYearOfRelease(JLabel lblYearOfRelease) {
		lblYearOfRelease.setFont(new Font("Century Gothic", Font.PLAIN, 27));
		lblYearOfRelease.setBounds(54, 296, 211, 34);
		layeredPane.setLayer(panelAddFilm, 0);
		panelAddFilm.add(lblYearOfRelease);
	}

	private void txtYear() {
		txtYear.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtYear.setColumns(10);
		txtYear.setBounds(255, 296, 233, 34);
		panelAddFilm.add(txtYear);
	}

	private void lblPrice(JLabel lblPrice) {
		lblPrice.setFont(new Font("Century Gothic", Font.PLAIN, 27));
		lblPrice.setBounds(54, 240, 211, 34);
		panelAddFilm.add(lblPrice);
	}

	private void txtPrice() {
		txtPrice.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtPrice.setColumns(10);
		txtPrice.setBounds(255, 240, 233, 34);
		panelAddFilm.add(txtPrice);
	}

	private void lblRating(JLabel lblRating) {
		lblRating.setFont(new Font("Century Gothic", Font.PLAIN, 27));
		lblRating.setBounds(54, 184, 211, 34);
		panelAddFilm.add(lblRating);
	}

	private void txtRating() {
		txtRating.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtRating.setColumns(10);
		txtRating.setBounds(255, 184, 233, 34);
		panelAddFilm.add(txtRating);
	}

	private void lblReference(JLabel lblReference) {
		lblReference.setFont(new Font("Century Gothic", Font.PLAIN, 27));
		lblReference.setBounds(54, 128, 211, 34);
		panelAddFilm.add(lblReference);
	}

	private void txtRef() {
		txtRef.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtRef.setColumns(10);
		txtRef.setBounds(255, 128, 233, 34);
		panelAddFilm.add(txtRef);
	}

	private void txtName() {
		txtName.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtName.setBounds(255, 74, 233, 34);
		panelAddFilm.add(txtName);
		txtName.setColumns(10);
	}

	private void lblNewLabel(JLabel lblNewLabel) {
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 27));
		lblNewLabel.setBounds(54, 74, 211, 34);
		panelAddFilm.add(lblNewLabel);
	}

	private void panelAddFilm() {
		panelAddFilm.setBounds(0, 0, 657, 508);
		layeredPane.add(panelAddFilm);
		panelAddFilm.setLayout(null);
	}

	private void label_2(JLabel label_2) {
		label_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		label_2.setBounds(38, 191, 609, 26);
		panelIntro.add(label_2);
	}

	private void label_1(JLabel label_1) {
		label_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		label_1.setBounds(38, 160, 609, 26);
		panelIntro.add(label_1);
	}

	private void label(JLabel label) {
		label.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		label.setBounds(38, 103, 609, 26);
		panelIntro.add(label);
	}

	private void lblWithThisApp(JLabel lblWithThisApp) {
		lblWithThisApp.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblWithThisApp.setBounds(38, 77, 609, 26);
		panelIntro.add(lblWithThisApp);
	}

	private void lblWelcome_1(JLabel lblWelcome_1) {
		lblWelcome_1.setFont(new Font("Century Gothic", Font.PLAIN, 32));
		lblWelcome_1.setBounds(233, 5, 226, 61);
		panelIntro.add(lblWelcome_1);
	}

	private void panelIntro() {
		layeredPane.add(panelIntro);
		panelIntro.setLayout(null);
		panelIntro.setBounds(0, 0, 657, 508);
	}

	private void oldestFilm() {
		oldestFilm.setText("Lowest Rated Film");
		oldestFilm.setFont(new Font("Century Gothic", Font.PLAIN, 21));
		oldestFilm.setColumns(10);
		oldestFilm.setBackground(new Color(205, 133, 63));
		oldestFilm.setBounds(55, 422, 532, 47);
		panelOverview.add(oldestFilm);
		layeredPane.setLayer(panelIntro, 1);
	}

	private void latestFilm() {
		latestFilm.setText("Lowest Rated Film");
		latestFilm.setFont(new Font("Century Gothic", Font.PLAIN, 21));
		latestFilm.setColumns(10);
		latestFilm.setBackground(new Color(255, 102, 102));
		latestFilm.setBounds(55, 364, 532, 47);
		panelOverview.add(latestFilm);
	}

	private void firstlineOverview(JLabel firstlineOverview) {
		firstlineOverview.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		firstlineOverview.setBounds(29, 29, 593, 47);
		panelOverview.add(firstlineOverview);
	}

	private void txtLowestRatedFilm() {
		txtLowestRatedFilm.setBackground(new Color(0, 204, 153));
		txtLowestRatedFilm.setText("Lowest Rated Film");
		txtLowestRatedFilm.setFont(new Font("Century Gothic", Font.PLAIN, 21));
		txtLowestRatedFilm.setColumns(10);
		txtLowestRatedFilm.setBounds(55, 309, 532, 47);
		panelOverview.add(txtLowestRatedFilm);
		txtLowestRatedFilm.setEditable(false);

	}

	private void txtHighestRatedFilm() {
		txtHighestRatedFilm.setBackground(new Color(255, 182, 193));
		txtHighestRatedFilm.setText("Highest Rated Film");
		txtHighestRatedFilm.setFont(new Font("Century Gothic", Font.PLAIN, 21));
		txtHighestRatedFilm.setColumns(10);
		txtHighestRatedFilm.setBounds(55, 250, 532, 47);
		panelOverview.add(txtHighestRatedFilm);
		txtHighestRatedFilm.setEditable(false);
	}

	private void txtCheapest() {
		txtCheapest.setBackground(new Color(173, 216, 230));
		txtCheapest.setText("Cheapest Film");
		txtCheapest.setFont(new Font("Century Gothic", Font.PLAIN, 21));
		txtCheapest.setColumns(10);
		txtCheapest.setBounds(55, 192, 532, 47);
		panelOverview.add(txtCheapest);
		txtCheapest.setEditable(false);
	}

	private void txtMostExpensive() {
		txtMostExpensive.setBackground(new Color(255, 160, 122));
		txtMostExpensive.setText("Most Expensive Film");
		txtMostExpensive.setFont(new Font("Century Gothic", Font.PLAIN, 21));
		txtMostExpensive.setColumns(10);
		txtMostExpensive.setBounds(55, 134, 532, 47);
		panelOverview.add(txtMostExpensive);
		txtMostExpensive.setEditable(false);
	}

	private void txtNumberOfFilms() {
		txtNumberOfFilms.setBackground(new Color(204, 153, 255));
		txtNumberOfFilms.setFont(new Font("Century Gothic", Font.PLAIN, 21));
		txtNumberOfFilms.setText("Number of films: " + films.getSize());
		txtNumberOfFilms.setBounds(55, 72, 532, 47);
		panelOverview.add(txtNumberOfFilms);
		txtNumberOfFilms.setColumns(10);
		txtNumberOfFilms.setEditable(false);
	}

	private void panelOverview() {
		panelOverview.setBounds(0, 0, 657, 508);
		layeredPane.add(panelOverview);
		panelOverview.setLayout(null);
	}

	private void appearName() {
		appearName.setVisible(false);
		appearName.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		appearName.setBounds(115, 164, 52, 20);
		findName.add(appearName);

		appearYear.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		appearYear.setBounds(115, 273, 67, 17);
		appearYear.setVisible(false);
		findName.add(appearYear);
		outNameNameLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		outNameNameLabel.setBounds(311, 169, 151, 20);

		findName.add(outNameNameLabel);
		outNameReferenceLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		outNameReferenceLabel.setBounds(311, 196, 151, 20);

		findName.add(outNameReferenceLabel);
		outNameRatingLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		outNameRatingLabel.setBounds(311, 220, 151, 14);

		findName.add(outNameRatingLabel);
		outNamePriceLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		outNamePriceLabel.setBounds(311, 247, 151, 14);

		findName.add(outNamePriceLabel);
		outNameYearLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		outNameYearLabel.setBounds(311, 276, 151, 14);

		findName.add(outNameYearLabel);
	}

	private void appearRef() {
		appearRef.setVisible(false);
		appearRef.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		appearRef.setBounds(115, 191, 92, 20);
		findName.add(appearRef);
	}

	private void appearRating() {
		appearRating.setVisible(false);
		appearRating.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		appearRating.setBounds(115, 215, 52, 20);
		findName.add(appearRating);
	}

	private void appearPrice() {
		appearPrice.setVisible(false);
		appearPrice.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		appearPrice.setBounds(115, 242, 52, 20);
		findName.add(appearPrice);
	}

	private void lblEnterTheName(JLabel lblEnterTheName) {
		lblEnterTheName.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblEnterTheName.setBounds(40, 16, 258, 55);
		findName.add(lblEnterTheName);
	}


	private void label_6(JLabel label_6) {
		label_6.setFont(new Font("Century Gothic", Font.PLAIN, 27));
		label_6.setBounds(66, 281, 161, 34);
		panelEdit.add(label_6);
	}

	private void loadPriceTxt() {
		loadPriceTxt.setColumns(10);
		loadPriceTxt.setBounds(264, 281, 179, 34);
		panelEdit.add(loadPriceTxt);
	}

	private void label_5(JLabel label_5) {
		label_5.setFont(new Font("Century Gothic", Font.PLAIN, 27));
		label_5.setBounds(66, 236, 161, 34);
		panelEdit.add(label_5);
	}

	private void loadRatingTxt() {
		loadRatingTxt.setColumns(10);
		loadRatingTxt.setBounds(264, 236, 179, 34);
		panelEdit.add(loadRatingTxt);
	}

	private void label_4(JLabel label_4) {
		label_4.setFont(new Font("Century Gothic", Font.PLAIN, 27));
		label_4.setBounds(66, 191, 161, 34);
		panelEdit.add(label_4);
	}

	private void loadNemeTxt() {
		loadNameTxt.setColumns(10);
		loadNameTxt.setBounds(264, 146, 179, 34);
		panelEdit.add(loadNameTxt);
	}

	private void label_3(JLabel label_3) {
		label_3.setFont(new Font("Century Gothic", Font.PLAIN, 27));
		label_3.setBounds(66, 146, 161, 34);
		panelEdit.add(label_3);
	}

	private void btnPrice() {
		btnSortByPrice.setForeground(Color.WHITE);
		btnSortByPrice.setFont(new Font("Century Gothic", Font.BOLD, 17));
		btnSortByPrice.setFocusPainted(false);
		btnSortByPrice.setBorderPainted(false);
		btnSortByPrice.setBackground(new Color(102, 102, 153));
		// btnNewButton.setContentAreaFilled(false);
		btnSortByPrice.setBounds(391, 73, 118, 36);
		hightlightWhenHoverOver(btnSortByPrice);
		panelViewAll.add(btnSortByPrice);
	}

	private void btnLoadFile() {
		btnLoadFile.setBounds(87, 468, 89, 23);
		btnLoadFile.setForeground(Color.WHITE);
		btnLoadFile.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnLoadFile.setFocusPainted(false);
		btnLoadFile.setBorderPainted(false);
		btnLoadFile.setBackground(new Color(102, 102, 153));
		hightlightWhenHoverOver(btnLoadFile);
		panelViewAll.add(btnLoadFile);

//		boolean clicked = false;

		btnSortByPrice.setIcon(null);
	}

	private void btnSaveFile() {
		btnSaveFile.setBounds(308, 468, 89, 23);
		btnSaveFile.setForeground(Color.WHITE);
		btnSaveFile.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnSaveFile.setFocusPainted(false);
		btnSaveFile.setBorderPainted(false);
		btnSaveFile.setBackground(new Color(102, 102, 153));
		panelViewAll.add(btnSaveFile);
		hightlightWhenHoverOver(btnSaveFile);
	}

	private void lblNewLabel_1(JLabel lblNewLabel_1) {
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(100, 26, 462, 36);
		panelViewAll.add(lblNewLabel_1);
	}

	public void setUpTable() {
		// define column headers
		Object[] columns = { "Name", "Reference", "Rating", "Price", "Year" };
		// sets the column headers
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		// sets the cell background colour
		table.setBackground(Color.white);
		// sets the cell text colour
		table.setForeground(Color.black);
		// this line allows sorting for each column
		table.setAutoCreateRowSorter(true);
		// this sets the row height
		table.setRowHeight(30);
		// setting the font in the cells
		table.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		// this stops the user being able to drag each column around
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		table.setRowSorter(null);
		table.setEnabled(false);
	}

	private void btnNewButton_2(JButton btnNewButton_2) {
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBorderPainted(false);
		buttonLeave(btnNewButton_2);
		// btnAdd_1.setBounds(302, 296, 186, 66);
		btnNewButton_2.setBounds(375, 105, 125, 50);
		hightlightWhenHoverOver(btnNewButton_2);
		panelRemove.add(btnNewButton_2);

	}

	private void buttonYear() {
		btnSortByYear.setForeground(Color.WHITE);
		btnSortByYear.setFont(new Font("Century Gothic", Font.BOLD, 17));
		btnSortByYear.setFocusPainted(false);
		btnSortByYear.setEnabled(false);
		btnSortByYear.setBorderPainted(false);
		btnSortByYear.setBackground(new Color(102, 102, 153));
		btnSortByYear.setBounds(515, 73, 118, 36);
		hightlightWhenHoverOver(btnSortByYear);
		panelViewAll.add(btnSortByYear);
	}

	private void btnName_1() {
		btnSortByName.setForeground(Color.WHITE);
		btnSortByName.setFont(new Font("Century Gothic", Font.BOLD, 17));
		flattenButton(btnSortByName);
		btnSortByName.setBackground(new Color(102, 102, 153));
		btnSortByName.setBounds(23, 73, 103, 36);
		hightlightWhenHoverOver(btnSortByName);
		panelViewAll.add(btnSortByName);
	}

	private void buttonReference() {
		btnSortByReference.setForeground(Color.WHITE);
		btnSortByReference.setFont(new Font("Century Gothic", Font.BOLD, 16));
		flattenButton(btnSortByReference);
		btnSortByReference.setBackground(new Color(102, 102, 153));
		btnSortByReference.setBounds(136, 73, 117, 36);
		hightlightWhenHoverOver(btnSortByReference);
		panelViewAll.add(btnSortByReference);
	}

	private void buttonRating() {
		btnSortByRating.setForeground(Color.WHITE);
		btnSortByRating.setFont(new Font("Century Gothic", Font.BOLD, 17));
		flattenButton(btnSortByReference);
		btnSortByRating.setBackground(new Color(102, 102, 153));
		btnSortByRating.setBounds(263, 73, 118, 36);
		hightlightWhenHoverOver(btnSortByRating);
		panelViewAll.add(btnSortByRating);

	}

	private void enterRef() {
		enterRef = new JTextField();
		enterRef.setFont(new Font("Century", Font.PLAIN, 11));
		enterRef.setColumns(10);
		enterRef.setBounds(311, 36, 151, 20);
		findRef.add(enterRef);
	}

	private void buttonName(JButton btnName) {
		btnName.setBounds(186, 0, 186, 55);
		btnName.setForeground(Color.WHITE);
		btnName.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		flattenButton(btnName);
		buttonLeave(btnName);
		panelFind.add(btnName);
		hightlightWhenHoverOver(btnName);
	}

	private void buttonNameCheck() {
		nameCheck.setForeground(Color.WHITE);
		nameCheck.setFont(new Font("Century Gothic", Font.PLAIN, 21));
		flattenButton(nameCheck);
		nameCheck.setBackground(new Color(102, 102, 153));
		nameCheck.setBounds(40, 82, 185, 55);
		findName.add(nameCheck);
		hightlightWhenHoverOver(nameCheck);
	}

	private void buttonRef(JButton btnRef) {
		btnRef.setForeground(Color.WHITE);
		buttonLeave(btnRef);
		btnRef.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		flattenButton(btnRef);
		panelFind.add(btnRef);
		hightlightWhenHoverOver(btnRef);
		btnRef.setBounds(0, 0, 186, 55);
	}

	private void buttonRefCheck() {
		refCheck.setForeground(Color.WHITE);
		refCheck.setFont(new Font("Century Gothic", Font.PLAIN, 21));
		flattenButton(refCheck);
		refCheck.setBackground(new Color(102, 102, 153));
		refCheck.setBounds(40, 82, 185, 55);
		hightlightWhenHoverOver(refCheck);
		findRef.add(refCheck);
	}

	private void topNoOfFilms() {
		topNoOfFilms.setForeground(Color.WHITE);
		topNoOfFilms.setHorizontalAlignment(SwingConstants.TRAILING);
		topNoOfFilms.setFont(new Font("Century Gothic", Font.PLAIN, 21));
		topNoOfFilms.setBounds(416, 50, 231, 25);
		panel_1.add(topNoOfFilms);
	}

	private void exitApplication(JPanel panel) {
		txtExitApplication.setBorder(null);
		txtExitApplication.setEditable(false);
		txtExitApplication.setHighlighter(null);
		txtExitApplication.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		txtExitApplication.setText("Exit Application");
		txtExitApplication.setBounds(56, 541, 140, 20);
		txtExitApplication.setOpaque(false);
		panel.add(txtExitApplication);
		txtExitApplication.setColumns(10);
	}

	private void buttonPower(JPanel panel, JButton PowerButton) {
		flattenButton(PowerButton);
		PowerButton.setContentAreaFilled(false);
		PowerButton.setIcon(new ImageIcon(GUI.class.getResource("/Assignment2/images/powericonSmaller.png")));
		PowerButton.setBounds(10, 531, 54, 41);
		panel.add(PowerButton);
	}

	private void labelFilmAdder(JPanel panel_1, JLabel lblFilmAdder) {
		lblFilmAdder.setForeground(Color.WHITE);
		lblFilmAdder.setBounds(222, 5, 212, 51);
		lblFilmAdder.setFont(new Font("Century Gothic", Font.PLAIN, 41));
		panel_1.add(lblFilmAdder);
	}

	private void panel_1(JPanel panel_1) {
		panel_1.setBounds(194, 0, 657, 75);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(119, 103, 153));
		panel_1.setLayout(null);
	}

	private void labelWelcome(JPanel panel, JLabel lblWelcome) {
		lblWelcome.setForeground(Color.WHITE);
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Century Gothic", Font.PLAIN, 33));
		lblWelcome.setBounds(22, 11, 151, 52);
		panel.add(lblWelcome);
	}

	private void buttonLoad() {
		loadBtn.setBounds(452, 31, 89, 36);
		loadBtn.setForeground(Color.WHITE);
		loadBtn.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		loadBtn.setFocusPainted(false);
		loadBtn.setBorderPainted(false);
		loadBtn.setBackground(new Color(102, 102, 153));
		hightlightWhenHoverOver(loadBtn);
		panelEdit.add(loadBtn);
	}

	private void addButton() {
		addFilmButton.setForeground(Color.WHITE);
		addFilmButton.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		flattenButton(addFilmButton);
		addFilmButton.setBackground(new Color(102, 102, 153));
		addFilmButton.setBounds(302, 366, 186, 66);
		hightlightWhenHoverOver(addFilmButton);
		panelAddFilm.add(addFilmButton);

	}

	public void sidePanelButton(JButton button) {
		// make text black
		button.setForeground(SystemColor.text);
		// make button look flat/modern
		flattenButton(button);
		// set colour to dark purple
		buttonLeave(button);
		// highlight when enter and restore to buttonLeave colour when exit
		hightlightWhenHoverOver(button);
		// set font and size
		button.setFont(new Font("Century Gothic", Font.PLAIN, 15));
	}

	public void navButton(JButton button, int x, int y, int width, int height) {
		// properties of all my side panel buttons
		sidePanelButton(button);
		// button position
		button.setBounds(x, y, width, height);
		// put the button in the side panel
		panel.add(button);
	}

	private void flattenButton(JButton button) {
		button.setBorderPainted(false);
		button.setFocusPainted(false);
	}

	private void highlightPanel(JPanel panel, JPanel panel_highlight) {
		panel_highlight.setBackground(Color.PINK);
		panel_highlight.setBounds(0, 74, 10, 66);
		panel.add(panel_highlight);
	}

	private void sidePanel(JPanel panel) {
		panel.setBounds(0, 0, 196, 640);
		panel.setBackground(new Color(119, 103, 153));
		panel.setLayout(null);
		frmFilmAdderMade.getContentPane().setLayout(null);
		frmFilmAdderMade.getContentPane().add(panel);
	}

	public void disableAllMainPanelButtons() {
		loadBtn.setEnabled(false);
		addFilmButton.setEnabled(false);
		refCheck.setEnabled(false);
		nameCheck.setEnabled(false);
		btnLoadFile.setEnabled(false);
		btnSaveFile.setEnabled(false);
		btnSortByName.setEnabled(false);
		btnSortByReference.setEnabled(false);
		btnSortByRating.setEnabled(false);
		btnSortByPrice.setEnabled(false);
		btnSave.setEnabled(false);
		btnSortByYear.setEnabled(false);
		removeFilmButton.setEnabled(false);
	}

	public void getHighestOrLowset() { // fetch data to fill in text boxes
		//use literal strings, highest/newest/oldest
		txtMostExpensive.setText(Films.highOrLowPrice("Highest"));
		txtCheapest.setText(Films.highOrLowPrice("Lowest"));
		// pass 1 to highOrLowRating for high, 0 for low
		txtHighestRatedFilm.setText(Films.highOrLowRating("Highest"));
		txtLowestRatedFilm.setText(Films.highOrLowRating("Lowest"));
		// pass 1 to oldOrNew for new, 0 for old
		latestFilm.setText(Films.oldOrNew("Newest"));
		oldestFilm.setText(Films.oldOrNew("Oldest"));
	}

	private void panelOverviewToTop() {
		layeredPane.setLayer(panelFind, 0);
		layeredPane.setLayer(panelAddFilm, 0);
		layeredPane.setLayer(panelIntro, 0);
		layeredPane.setLayer(panelOverview, 1);
		layeredPane.setLayer(panelViewAll, 0);
		layeredPane.setLayer(panelEdit, 0);
		layeredPane.setLayer(panelRemove, 0);
	}

	private void buttonsAddFilm() {
		addFilmButton.setEnabled(true);
		loadBtn.setEnabled(false);
		refCheck.setEnabled(false);
		nameCheck.setEnabled(false);
		btnLoadFile.setEnabled(false);
		btnSaveFile.setEnabled(false);
		btnSortByName.setEnabled(false);
		btnSortByReference.setEnabled(false);
		btnSortByRating.setEnabled(false);
		btnSortByPrice.setEnabled(false);
		btnSave.setEnabled(false);
		btnSortByYear.setEnabled(false);
		lblPrice_1.setVisible(false);
		lblName.setVisible(false);
		lblRating_1.setVisible(false);
		lblReference_1.setVisible(false);
		lblYear_1.setVisible(false);
		outRefLabel.setVisible(false);
		outNameLabel.setVisible(false);
		outYearLabel.setVisible(false);
		outPriceLabel.setVisible(false);
		outRatingLabel.setVisible(false);
	}

	private void panelAddFilmToTop() {
		layeredPane.setLayer(panelAddFilm, 1);
		layeredPane.setLayer(panelIntro, 0);
		layeredPane.setLayer(panelFind, 0);
		layeredPane.setLayer(panelOverview, 0);
		layeredPane.setLayer(panelViewAll, 0);
		layeredPane.setLayer(panelEdit, 0);
		layeredPane.setLayer(panelRemove, 0);
	}

	private void panelRemoveToTop() {
		layeredPane.setLayer(panelFind, 0);
		layeredPane.setLayer(panelAddFilm, 0);
		layeredPane.setLayer(panelIntro, 0);
		layeredPane.setLayer(panelOverview, 0);
		layeredPane.setLayer(panelViewAll, 0);
		layeredPane.setLayer(panelEdit, 0);
		layeredPane.setLayer(panelRemove, 1);
	}

	private void buttonsFind() {
		loadBtn.setEnabled(false);
		addFilmButton.setEnabled(false);
		refCheckEnabled();
		btnLoadFile.setEnabled(false);
		btnSaveFile.setEnabled(false);
		btnSortByName.setEnabled(false);
		btnSortByReference.setEnabled(false);
		btnSortByRating.setEnabled(false);
		btnSortByPrice.setEnabled(false);
		btnSave.setEnabled(false);
		btnSortByYear.setEnabled(false);
		if (refFound == true) {
			enableOutRefLabels();
		} else {
			disableOutRefLabels();
		}
		// outRef.setVisible(true);
	}

	private void panelFindToTop() {
		layeredPane.setLayer(panelFind, 1);
		layeredPane.setLayer(panelAddFilm, 0);
		layeredPane.setLayer(panelIntro, 0);
		layeredPane.setLayer(panelOverview, 0);
		layeredPane.setLayer(panelViewAll, 0);
		layeredPane.setLayer(panelEdit, 0);
		layeredPane.setLayer(panelRemove, 0);
		refSubPanelToTop();
	}

	private void buttonViewAll() {
		loadBtn.setEnabled(false);
		addFilmButton.setEnabled(false);
		refCheck.setEnabled(false);
		nameCheck.setEnabled(false);
		btnLoadFile.setEnabled(true);
		btnSaveFile.setEnabled(true);
		btnSortByName.setEnabled(true);
		btnSortByReference.setEnabled(true);
		btnSortByRating.setEnabled(true);
		btnSortByPrice.setEnabled(true);
		btnSave.setEnabled(true);
		btnSortByYear.setEnabled(true);
		removeFilmButton.setEnabled(false);
	}

	private void panelViewAllToTop() {
		layeredPane.setLayer(panelAddFilm, 0);
		layeredPane.setLayer(panelIntro, 0);
		layeredPane.setLayer(panelFind, 0);
		layeredPane.setLayer(panelOverview, 0);
		layeredPane.setLayer(panelViewAll, 1);
		layeredPane.setLayer(panelEdit, 0);
		layeredPane.setLayer(panelRemove, 0);
	}

	private void buttonLight(JButton button) {
		button.setBackground(new Color(102, 123, 153));
	}

	private void buttonEdit() {
		refCheck.setEnabled(false);
		nameCheck.setEnabled(false);
		loadBtn.setEnabled(true);
		addFilmButton.setEnabled(false);
		btnLoadFile.setEnabled(false);
		btnSaveFile.setEnabled(false);
		btnSortByName.setEnabled(false);
		btnSortByReference.setEnabled(false);
		btnSortByRating.setEnabled(false);
		btnSortByPrice.setEnabled(false);
		btnSave.setEnabled(true);
		btnSortByYear.setEnabled(false);
		removeFilmButton.setEnabled(false);
	}

	private void editPanelToTop() {
		layeredPane.setLayer(panelFind, 0);
		layeredPane.setLayer(panelAddFilm, 0);
		layeredPane.setLayer(panelIntro, 0);
		layeredPane.setLayer(panelOverview, 0);
		layeredPane.setLayer(panelViewAll, 0);
		layeredPane.setLayer(panelEdit, 1);
		layeredPane.setLayer(panelRemove, 0);
	}

	private void buttonLeave(JButton button) {
		button.setBackground(new Color(102, 102, 153));
	}

	private void buttonsFindRef() {
		lblPrice_1.setVisible(true);
		lblName.setVisible(true);
		lblRating_1.setVisible(true);
		lblReference_1.setVisible(true);
		lblYear_1.setVisible(true);
		appearYear.setVisible(false);
		appearName.setVisible(false);
		appearPrice.setVisible(false);
		appearRef.setVisible(false);
		appearRating.setVisible(false);
	}

	public void findRefSet() {
		outNameLabel.setText(Films.getFoundName());
		outPriceLabel.setText("£" + String.valueOf(formatter.format(Films.getFoundPrice())));
		outRatingLabel.setText(String.valueOf(Films.getFoundRating()));
		outRefLabel.setText(Films.getFoundRef());
		outYearLabel.setText(String.valueOf(Films.getFoundYear()));
	}

	private void findRefClear() {
		outNameLabel.setText("");
		outPriceLabel.setText("");
		outRatingLabel.setText("");
		outRefLabel.setText("");
		outYearLabel.setText("");
		lblName.setVisible(false);
		lblRating_1.setVisible(false);
		lblReference_1.setVisible(false);
		lblYear_1.setVisible(false);
		lblPrice_1.setVisible(false);
	}

	public void drawFilmTable() {
		// clears the table
		model.setRowCount(0);
		// columns per row
		Object dataForRow[] = new Object[5];
		// for every film in the filmlist arraylist
		for (int i = 0; i < films.getSize(); i++) {
			// column for name
			dataForRow[0] = Films.filmlist.get(i).getName();
			// column for reference
			dataForRow[1] = Films.filmlist.get(i).getRef();
			// column for rating
			dataForRow[2] = Films.filmlist.get(i).getRating();
			// column for price
			dataForRow[3] = "£" + formatter.format(Films.filmlist.get(i).getPrice());
			// column for year
			dataForRow[4] = Films.filmlist.get(i).getYear();
			// add the row to the table
			model.addRow(dataForRow);
		}
	}

	private void clearLoadText() {
		loadNameTxt.setText("");
		loadRefTxt.setText("");
		loadPriceTxt.setText("");
		loadRatingTxt.setText("");
		loadYearTxt.setText("");
	}

	private void clearAddTxt() {
		txtName.setText("");
		txtRef.setText("");
		txtPrice.setText("");
		txtRating.setText("");
		txtYear.setText("");
	}

	private void panelIntroToTop() {
		layeredPane.setLayer(panelAddFilm, 0);
		layeredPane.setLayer(panelFind, 0);
		layeredPane.setLayer(panelOverview, 0);
		layeredPane.setLayer(panelViewAll, 0);
		layeredPane.setLayer(panelEdit, 0);
		layeredPane.setLayer(panelRemove, 0);
		// introduction panel is on top of all the other layers
		// therefore it is the only one visible
		layeredPane.setLayer(panelIntro, 1);
	}

	private void disableOutRefLabels() {
		lblPrice_1.setVisible(false);
		lblName.setVisible(false);
		lblRating_1.setVisible(false);
		lblReference_1.setVisible(false);
		lblYear_1.setVisible(false);
		outRefLabel.setVisible(false);
		outNameLabel.setVisible(false);
		outYearLabel.setVisible(false);
		outPriceLabel.setVisible(false);
		outRatingLabel.setVisible(false);
	}

	private void enableOutRefLabels() {
		lblPrice_1.setVisible(true);
		lblName.setVisible(true);
		lblRating_1.setVisible(true);
		lblReference_1.setVisible(true);
		lblYear_1.setVisible(true);
		outRefLabel.setVisible(true);
		outNameLabel.setVisible(true);
		outYearLabel.setVisible(true);
		outPriceLabel.setVisible(true);
		outRatingLabel.setVisible(true);
	}

	private void disableOutNameLabels() {
		appearName.setVisible(false);
		appearRating.setVisible(false);
		appearPrice.setVisible(false);
		appearRef.setVisible(false);
		appearYear.setVisible(false);
		outNameNameLabel.setVisible(false);
		outNameReferenceLabel.setVisible(false);
		outNameYearLabel.setVisible(false);
		outNameRatingLabel.setVisible(false);
		outNamePriceLabel.setVisible(false);
	}

	private void enableOutNameLabels() {
		appearName.setVisible(true);
		appearRating.setVisible(true);
		appearPrice.setVisible(true);
		appearRef.setVisible(true);
		appearYear.setVisible(true);
		outNameNameLabel.setVisible(true);
		outNameReferenceLabel.setVisible(true);
		outNameYearLabel.setVisible(true);
		outNameRatingLabel.setVisible(true);
		outNamePriceLabel.setVisible(true);
	}

	public boolean checkAddBoxesEmpty() {
		if (txtName.getText().isEmpty() || txtRef.getText().toString().isEmpty() || txtRating.getText().isEmpty()
				|| txtPrice.getText().isEmpty() || txtYear.getText().isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkEditBoxesEmpty() {
		if (loadNameTxt.getText().toString().isEmpty() || loadRefTxt.getText().toString().isEmpty()
				|| loadRatingTxt.getText().isEmpty() || loadPriceTxt.getText().isEmpty()
				|| loadYearTxt.getText().isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	private void findNameClear() {
		refNameFound = false;
		appearName.setVisible(false);
		appearPrice.setVisible(false);
		appearRef.setVisible(false);
		appearRating.setVisible(false);
		appearYear.setVisible(false);
		outNameNameLabel.setText("");
		outNamePriceLabel.setText("");
		outNameRatingLabel.setText("");
		outNameReferenceLabel.setText("");
		outNameYearLabel.setText("");
	}

	public void findNameSet() {
		outNameNameLabel.setText(Films.getFoundName());
		outNamePriceLabel.setText("£" + String.valueOf(formatter.format(Films.getFoundPrice())));
		outNameRatingLabel.setText(String.valueOf(Films.getFoundRating()));
		outNameReferenceLabel.setText(Films.getFoundRef());
		outNameYearLabel.setText(String.valueOf(Films.getFoundYear()));
	}

	public void loadSetText() { 
		// set film text box
		loadNameTxt.setText(Films.getFoundName());
		// set film text box
		loadRefTxt.setText(Films.getFoundRef());
		// set rating text box
		loadRatingTxt.setText(String.valueOf(Films.getFoundRating()));
		// set price text box
		loadPriceTxt.setText(String.valueOf(Films.getFoundPrice()));
		// set year text box
		loadYearTxt.setText(String.valueOf(Films.getFoundYear()));
	}

	public void loadRemove() {
		// if filmlist array is empty give an error and do not load the screen
		if (Films.filmlist.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Please add a film or load previous films, Use the Add or View All Tabs", "Add a film to use this",
					JOptionPane.ERROR_MESSAGE);
		} else {
			// set up the combo box with films to remove
			setUpComboBox(comboBoxRemove, panelRemove);
			// buttons need for remove film
			removeFilmButtons();
			// move highlight panel
			panel_highlight.setBounds(0, 269, 10, 66);
			// remove panel to top
			panelRemoveToTop();
		}
	}

	public void setUpComboBox(JComboBox combobox, JPanel panel) {
		// create temporary array for comobo box
		ArrayList<String> temp = new ArrayList<String>();
		// remove everything from combo box before adding anything to it
		combobox.removeAll();
		// add names of films from filmlist to array list
		for (int i = 0; i < films.getSize(); i++) {
			temp.add(Films.filmlist.get(i).getName());
			}
		// set combo box to have the options be the names of the films
		combobox.setModel(new DefaultComboBoxModel(temp.toArray()));
		// add combobox to the remove panel
		panel.add(combobox);
	}

	private void removeFilmButtons() {
		disableAllMainPanelButtons();
		removeFilmButton.setEnabled(true);
	}

	public void loadEdit() {
		// if empty give error and tell them to add or load films
		if (Films.filmlist.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Please add a film or load previous films, Use the Add or View All Tabs", "Add a film to use this",
					JOptionPane.ERROR_MESSAGE);
		} else {
			// set up the combo box with film names to edit
			setUpComboBox(comboBoxEdit, panelEdit);
			// load buttons for edit screen
			buttonEdit();
			//clear textboxes
			clearTextBoxesLoad();
			// move highlight panel
			panel_highlight.setBounds(0, 463, 10, 66);
			// set highlight panel to the top
			editPanelToTop();
		}
	}

	private void clearTextBoxesLoad() {
		loadNameTxt.setText("");
		loadRefTxt.setText("");
		loadPriceTxt.setText("");
		loadRefTxt.setText("");
		loadYearTxt.setText("");
	}

	public void findByName() {
		if (enterName.getText().toString().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please enter a film name", "Fail", JOptionPane.ERROR_MESSAGE);
		} else {
			// get the text box text and set to name
			String name = enterName.getText();
			// if not null
			if (Films.findFilmByName(name) == true) {
				// enable labels
				enableOutNameLabels();
				// set text of labels
				findNameSet();
				// tell user that film was found
				JOptionPane.showMessageDialog(null, "Found " + Films.getFoundName() + ", all the details are below", "Success",
						JOptionPane.PLAIN_MESSAGE);
				// set ref found to true
				refNameFound = true;
			}
			// if null was returned
			else {
				//set refNameFound to false
				refNameFound = false;
				//clear labels
				findNameClear();
				//tell user that the film was not found
				JOptionPane.showMessageDialog(null, "Failed to find film " + name + ". Please try again.", "Fail",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public void addFilm() {
		// boolean for whether or film with reference exists or not
		boolean existed = false;
		boolean complete = false;
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		// if any of the text boxes are empty
		while (complete == false) {
			if (checkAddBoxesEmpty()) {
				JOptionPane.showMessageDialog(null, "Please fill in all the textboxes", "Failed",
						JOptionPane.ERROR_MESSAGE);
				//set complete to true to exit while loop
				complete = true;

			} else {
				// get the reference and set to variable w
				String w = txtRef.getText().toString();
				// check another film with the reference the user entered already exists
				existed = refExists(existed, w);
				// existed is false
				if (existed == false) {
					// set v to name entered
					String v = txtName.getText().toString();
					// create var x, y, z
					double x = 0;
					double y = 0;
					int z = 0;
					// first we try to convert their rating to a double, if not (i.e. if it contains
					// letters/illegal then exception thrown)
					try {
						//try parse to doouble
						x = Double.parseDouble(txtRating.getText());
						//check if the rating is in the range of 0-5
						if(x>5 || x < 0) {
							//if it is show them an error
							JOptionPane.showMessageDialog(null, "Rating can only be between 0 and 5", "Rating out of bounds",
									JOptionPane.PLAIN_MESSAGE);
							//break from the while loop the rest of the process does not continue
							break;
						}
						try {
							//try parse to double
							y = Double.parseDouble(txtPrice.getText());
							//check if price is negative
							if(y < 0) {
								//if it is show them an error
								JOptionPane.showMessageDialog(null, "Price cannot be negative", "Invalid price",
										JOptionPane.PLAIN_MESSAGE);
								//break from while loop
								break;
							}
							// same with year
							try {
								//try parse to integer
								z = Integer.parseInt(txtYear.getText());
								//check if the year is more than 5 years ahead of the current year or before 1700
								if(z > currentYear + 5 || z < 1700) {
									//if it is give them an error
									JOptionPane.showMessageDialog(null, "No time traveling allowed, 5 years ahead is the max allowed, "
											+ "no negative years either", "Invalid Year",
											JOptionPane.PLAIN_MESSAGE);
									//break from while loop
									break;
								}
								// if it passes all that means all the variables are the correct type
								setFilm(w, v, x, y, z);
								// set number of films to size of filmlist
								topNoOfFilms.setText("Number of films: " + films.getSize());
								// tell user that the film was added successfully
								JOptionPane.showMessageDialog(null, film.getName() + " was added successfully",
										"Success", JOptionPane.PLAIN_MESSAGE);
								// clear all the text boxes so that the user can enter another film easily
								clearAddTxt();
								//set complete to true to exit the while loop
								complete = true;
							}
							// if year is not int type
							catch (NumberFormatException e3) {
								JOptionPane.showMessageDialog(null, "Year can only have a number value",
										"Year input error", JOptionPane.ERROR_MESSAGE);
								//set complete to true to exit the while loop
								complete = true;
							}
						}
						// if price is not double type
						catch (NumberFormatException e2) {
							JOptionPane.showMessageDialog(null, "Price can only have a number value",
									"Price input error", JOptionPane.ERROR_MESSAGE);
							//set complete to true to exit the while loop
							complete = true;
						}
					}
					// if rating is not int type
					catch (NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, "Rating can only have a number value", "Rating input error",
								JOptionPane.ERROR_MESSAGE);
						//set complete to true to exit the while loop
						complete = true;
					}
				}
				else { // this is if a film with the reference exists
					//set complete to true to exit the while loop
					complete = true;
				}
			}
		}
	}

	public boolean refExists(boolean existed, String w) {
		//for every film in filmlist
		for (int i = 0; i < films.getSize(); i++) {
			//see if the film has a reference equal to the w (entered by user)
			if (Films.filmlist.get(i).getRef().toLowerCase().equals(w.toLowerCase())) {
				//if it does set existed to true
				existed = true;
				//tell the user that a film with that reference already exists
				JOptionPane.showMessageDialog(null, "Film with this reference already exists", "Already Exists",
						JOptionPane.ERROR_MESSAGE);
				//break from for look
				break;
			}
		}
		return existed;
	}

	public void setFilm(String w, String v, double x, double y, int z) {
		//instantiate film using the constructor which takes in variables
		film = new Film(v, w, x, y, z);
		//add film to filmlist
		films.add(film);
	}

	private void nameCheckenabled() {
		nameCheck.setEnabled(true);
		refCheck.setEnabled(false);
	}

	private void refCheckEnabled() {
		refCheck.setEnabled(true);
		nameCheck.setEnabled(false);
	}

	private void refSubPanelToTop() {
		layeredPane2.setLayer(findRef, 1);
		layeredPane2.setLayer(findName, 0);
	}

	private void nameSubLayerToTop() {
		layeredPane2.setLayer(findName, 1);
		layeredPane2.setLayer(findRef, 0);
	}

	public void loadInstructions() {
		// disables all buttons from the other panels
		disableAllMainPanelButtons();
		// move the pink panel to show which panel is active
		panel_highlight.setBounds(0, 74, 10, 66);
		// make all the other panels below and panelIntro on top
		panelIntroToTop();
	}

	public void loadOverview() {
		try {
			// fill in highest or lowest text boxes
			getHighestOrLowset();
			// set the number of films box
			txtNumberOfFilms.setText("Number of films: " + films.getSize());
			// disable buttons
			disableAllMainPanelButtons();
			// move pink highlight panel
			panel_highlight.setBounds(0, 139, 10, 66);
			// move the overview panel to the top, making it visible
			panelOverviewToTop();
			// if array list is empty then give them this error
		} catch (ArrayIndexOutOfBoundsException e1) {
			JOptionPane.showMessageDialog(null,
					"Please add a film or load previous films, Use the Add or View All Tabs", "Add a film to use this",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public void loadAddFilm() {
		// enable/disable buttons for the add film panel
		buttonsAddFilm();
		// moves highlight panel
		panel_highlight.setBounds(0, 204, 10, 66);
		// add film panel to top
		panelAddFilmToTop();
	}

	public void loadFind() {
		if (Films.filmlist.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Please add a film or load previous films, Use the Add or View All Tabs", "Add a film to use this",
					JOptionPane.ERROR_MESSAGE);
		} else {
		// enable buttons for find panel
		buttonsFind();
		// move highlight panel to show find is active
		panel_highlight.setBounds(0, 334, 10, 66);
		// show find by ref is active
		panel_2.setBounds(0, 56, 186, 10);
		// make find panel layer 1, the rest 0
		panelFindToTop();
		}
	}

	public void loadViewAll() {
		// buttons for view all panel
		buttonViewAll();
		// move highlight panel
		panel_highlight.setBounds(0, 399, 10, 66);
		// panel view all to top
		panelViewAllToTop();
		// draw the film table
		drawFilmTable();
	}

	public void mouseDrag(MouseEvent e) {
		// I set the position of the window to be the location of where their mouse is
		// minus the initial position
		// If I do not subtract the initial position the top left of the window will
		// move to wherever the cursor goes
		// absolute x position
		int x = e.getXOnScreen();
		// absolute y position
		int y = e.getYOnScreen();
		// set the location (position) of the window to the position of the mouse minus
		// the relative positions
		frmFilmAdderMade.setLocation(x - initialX, y - initialY);
	}

	public void mousePress(MouseEvent e) {
		// I get the position of their cursor when they click the mouse
		// x position RELATIVE to source component
		initialX = e.getX();
		// y position RELATIVE to source component
		initialY = e.getY();
	}

	public void loadSubPanelRef() {
		// enables the button to search by reference
		refCheckEnabled();
		// puts the find by reference panel above find by name
		refSubPanelToTop();
		//move the blue highlight panel
		panel_2.setBounds(0, 56, 186, 10);

		// if a film has already been found by reference enable the labels
		if (refFound == true) {
			enableOutRefLabels();
			// if film has not been found then disable the labels
		} else {
			disableOutRefLabels();
		}
	}

	public void loadSubPanelName() {
		// find by name button enabled
		nameCheckenabled();
		// name panel to top
		nameSubLayerToTop();
		//move the blue highlight panel
		panel_2.setBounds(186, 57, 186, 10);
		// enable if found before
		if (refNameFound == true) {
			enableOutNameLabels();
			// if not then disable
		} else {
			disableOutNameLabels();
		}
	}

	public void findByRef() {
		// if it is empty get tell the user
		if (enterRef.getText().toString().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please enter a reference number", "Fail", JOptionPane.ERROR_MESSAGE);
		}
		// if it is not empty
		else {
			// get what the user entered
			String ref = enterRef.getText();
			// makes call to films.find passing ref, gets null or the name of the found film
			if (Films.findFilmByRef(ref) == true) {
				// enable the labels
				enableOutRefLabels();
				// set the labels text
				findRefSet();
				// tell user that the film was found, using the name
				JOptionPane.showMessageDialog(null, "Found " + Films.getFoundName() + ", all the details are below", "Success",
						JOptionPane.PLAIN_MESSAGE);
				refFound = true;
				// if not found then null is returned
			} else {
				// clear labels and hide the labels
				findRefClear();
				// tell the user that the film at reference ref was not found
				JOptionPane.showMessageDialog(null, "Failed to find film at reference " + ref + ". Please try again.",
						"Fail", JOptionPane.ERROR_MESSAGE);
				// set refFound to false
				refFound = false;
			}
		}
	}



	public void sortPrice() {
		if (clicked == true) {
			Films.sortPrice(0);
			clicked = !clicked;
		} else {
			Films.sortPrice(1);
			clicked = !clicked;
		}
		drawFilmTable();
	}
	
	public void saveFilm() {
		boolean existed = false;
		boolean complete = false;
		//get current year and assign it to a variable
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		// get the name of the selected film to edit
		String name = comboBoxEdit.getSelectedItem().toString();
		// match combo box film to the index of the film in filmlist by using loadNames
		int valueOfEdit = Films.getEditIndexAndFindReference(name);
		// create boolean existed and make false
		// check if any boxes are empty with method
		while (complete == false) {
			if (checkEditBoxesEmpty()) {
				// if empty then tell the user to fill in all the text boxes
				JOptionPane.showMessageDialog(null, "Please fill in all the textboxes", "Failed",
						JOptionPane.ERROR_MESSAGE);
				//set complete to true to exit while loop
				complete = true;
			} else {
				// if not then set w to be the reference
				String w = loadRefTxt.getText().toString();
				// check if the reference already exists by passing it into my method
				existed = checkIfExistsEdit(existed, w);
				// set X ,Y, Z variables up for use
				if (existed == false) {
					// set v to be the text in the name box
					String v = loadNameTxt.getText().toString();
					double x = 0;
					double y = 0;
					int z = 0;
					// try to convert rating to double
					try {
						// try parse to double
						x = Double.parseDouble(loadRatingTxt.getText());
						// check if the rating is in the range of 0-5
						if (x > 5 || x < 0) {
							// if it is show them an error
							JOptionPane.showMessageDialog(null, "Rating can only be between 0 and 5",
									"Rating out of bounds", JOptionPane.PLAIN_MESSAGE);
							// break from the while loop the rest of the process does not continue
							break;
						}
						try {
							// try parse to double
							y = Double.parseDouble(loadPriceTxt.getText());
							// check if price is negative
							if (y < 0) {
								// if it is show them an error
								JOptionPane.showMessageDialog(null, "Price cannot be negative", "Invalid price",
										JOptionPane.PLAIN_MESSAGE);
								// break from while loop
								break;
							}
							try {
								// try parse to integer
								z = Integer.parseInt(loadYearTxt.getText());
								// check if the year is more than 5 years ahead of the current year or before
								// 1700
								if (z > currentYear + 5 || z < 1700) {
									// if it is give them an error
									JOptionPane.showMessageDialog(null,
											"No time traveling allowed, 5 years ahead is the max allowed, "
													+ "no negative years either",
											"Invalid Year", JOptionPane.PLAIN_MESSAGE);
									// break from while loop
									break;
								}
								// if successful save film by calling saveEdit method and passing variables
								saveEdit(valueOfEdit, w, v, x, y, z);
								// tell the user that the film was edited successfully
								JOptionPane.showMessageDialog(null,
										name + " was edited successfully, check in view all", "Success",
										JOptionPane.PLAIN_MESSAGE);
								// set up the combo box again, since a film was edited and the name could have
								// changed
								setUpComboBox(comboBoxEdit, panelEdit);
								// remove all the text in the edit boxes
								clearLoadText();
								//set complete to true to exit the while loop
								complete = true;
								// if the year was not an int value
							} catch (NumberFormatException e3) {
								JOptionPane.showMessageDialog(null, "Year can only have a number value",
										"Year input error", JOptionPane.ERROR_MESSAGE);
								//set complete to true to exit the while loop
								complete = true;
							}
							// if the price was not a double value
						} catch (NumberFormatException e2) {
							JOptionPane.showMessageDialog(null, "Price can only have a number value",
									"Price input error", JOptionPane.ERROR_MESSAGE);
							//set complete to true to exit the while loop
							complete = true;
						}
						// if the rating was not a number value
					} catch (NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, "Rating can only have a number value", "Rating input error",
								JOptionPane.ERROR_MESSAGE);
						//set complete to true to exit the while loop
						complete = true;
					}
				}
				else{ // this is if a film with the reference exists
					//set complete to true to exit the while loop
					complete = true;
				}
			}
		}
	}

	public void saveEdit(int valueOfEdit, String w, String v, double x, double y, int z) {
		//use static film new film
		film = new Film();
		//set set variables of film
		film.set(v, w, x, y, z);
		//set the object at index valueOfEdit to be object film
		Films.filmlist.set(valueOfEdit, film);
	}

	public boolean checkIfExistsEdit(boolean existed, String w) {
		//create temporary array list
		ArrayList<String> temp = new ArrayList<String>();
		//for every film in filmlist
		for (int i = 0; i < films.getSize(); i++) {
			//add each film's reference (with the get method) to the temp array list
			temp.add(Films.filmlist.get(i).getRef());
		}
		//remove reference found from getEditIndexAndFindReference from temp array
		temp.remove(Films.getFoundRef());
		//for every reference in temp
		for (int j = 0; j < temp.size(); j++) {
			//if reference matches any of the other film refernces
			if (temp.get(j).toString().toLowerCase().contains(w.toLowerCase())) {
				//set existed to true
				existed = true;
				//tell user that film with the reference already exists
				JOptionPane.showMessageDialog(null, "Film with this reference already axists", "Already Exists",
						JOptionPane.ERROR_MESSAGE);
				//break for for loop
				break;
			}
		}
		//return existed boolean
		return existed;
	}

	public void loadFilm() {
		//get the name of the film that has been selected in the combobox
		String name = comboBoxEdit.getSelectedItem().toString();
		//find the film details
		Films.findFilmByName(name);
		//load film details
		loadSetText();
		//tell user that film has been found and that they can edit and then save
		JOptionPane.showMessageDialog(null, "Found " + name + ", now edit and click save", "Success",
				JOptionPane.PLAIN_MESSAGE);
	}

	public void removeFilm() {
		// get the string of the film that has been selected in the combo box
		String selected = comboBoxRemove.getSelectedItem().toString();
		// get the index of the film that has been selected in the combo box
		int index = comboBoxRemove.getSelectedIndex();
		// remove film by calling removeName from Films class
		Films.removeName(index);
		// remove the film from the combo box
		comboBoxRemove.removeItemAt(index);
		// tell the user that the film was removed successfully
		JOptionPane.showMessageDialog(null, selected + " was removed successfully", "Success",
				JOptionPane.PLAIN_MESSAGE);
		// set the number of films in the top right
		topNoOfFilms.setText("Number of films: " + films.getSize());
	}

	public void sortRating() {
		// if clicked true then sort high to low
		if (clicked1 == true) {
			Films.sortRating("HighToLow");
			clicked1 = !clicked1;
		} 
		//if false sort low to high
		else {
			Films.sortRating("LowToHigh");;
			clicked1 = !clicked1;
		}
		//redraw the film table
		drawFilmTable();
	}

	public void sortReference() {
		// if clicked true then sort high to low
		if (clicked2 == true) {
			Films.sortRef("HighToLow");
			clicked2 = !clicked2;
		} 
		//  if false sort low to high
		else {
			Films.sortRef("LowToHigh");
			clicked2 = !clicked2;
		}
		// redraw film table
		drawFilmTable();
	}

	public void sortName() {
		// if clicked true then sort high to low
		if (clicked3 == true) {
			Films.sortName("HighToLow");
			clicked3 = !clicked3;
		} 
		//  if false sort low to high
		else {
			Films.sortName("LowToHigh");
			clicked3 = !clicked3;
		}
		// redraw film table
		drawFilmTable();
	}

	public void sortYear() {
		// if clicked true then sort high to low
		if (clicked4 == true) {
			Films.sortYear("HighToLow");
			clicked4 = !clicked4;
		} 
		//  if false sort low to high
		else {
			Films.sortYear("LowToHigh");
			clicked4 = !clicked4;
		}
		// redraw film table
		drawFilmTable();
	}
	
	public void saveFile() {
		JFileChooser fileChooser = chooseFileJarDirectoryOnly("Save");
		//File variable is the file that the user has chosen
		File file = fileChooser.getSelectedFile();
		//pass variable to Films.writetofile
		Films.writeToFile(file);
	}

	public void loadFile() {
		JFileChooser fileChooser = chooseFileJarDirectoryOnly("Select File");
		//File variable is the file that the user has chosen
		File file = fileChooser.getSelectedFile();
		//pass variable to Films.readFile
		Films.readFile(file);
		//redraw the table of films
		drawFilmTable();
		//update text in top right
		topNoOfFilms.setText("Number of films: " + films.getSize());
	}

	public JFileChooser chooseFileJarDirectoryOnly(String buttonText) {
		// folder that the jar file is in
		File root = new File(".");
		// limit user to only find files in folder jar file is in
		FileSystemView fsv = new SingleRootFileSystemView(root);
		// create fileChooser using the limit
		JFileChooser fileChooser = new JFileChooser(fsv);
		//make visible
		fileChooser.setVisible(true);
		//text on button to click
		fileChooser.showDialog(null, buttonText);
		return fileChooser;
	}

	public void enterValidYear(KeyEvent e, JTextField txtbox) {
		// gets the character that they typed from the event property
		char ch = e.getKeyChar();
		// checks if it is a number and if the length in the textbox is 4
		if (!checkIfNumber(ch) || txtbox.getText().length() == 4) {
			// if either is then it does not let the user type it
			e.consume();
		}
	}

	public void enterValidPriceOrRating(KeyEvent e, JTextField txtbox) {
		// gets the character that they typed from the event property
		char c = e.getKeyChar();
		// checks if it is a number and if it is a decimal point
		if (!checkIfNumber(c) && !fixOrAllowDecimalPoint(c, txtbox)) {
			// if either is not a number and is not a decimal point it does not allow it
			e.consume();
		}
	}

	
	

}
