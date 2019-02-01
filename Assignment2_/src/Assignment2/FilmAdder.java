package Assignment2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JLayeredPane;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import javax.swing.UIManager;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTable;

public class FilmAdder {

	private JFrame frame;
	private JTextField txtNumberOfFilms;
	private JTextField txtHighestrated;
	private JTextField txtname;
	private JTextField txtref;
	private JTextField txtrating;
	private JTextField txtprice;
	private JTextField textField_4;
	
	
	static Film film;
	static Films films = new Films();
	static boolean finished = false;
	private JLayeredPane layeredPane;
	private JTextField txtViewall;
	
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FilmAdder window = new FilmAdder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FilmAdder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame();
		
		layeredPane = new JLayeredPane();
		layeredPane(layeredPane);
		
		JPanel addPanel = new JPanel();
		addPanel(layeredPane, addPanel);
		txtname = new JTextField();
		textField(addPanel);
		JLabel lblFilmName = new JLabel("Film name");
		lblFilmName(addPanel, lblFilmName);

		JLabel lblReference = new JLabel("Reference");
		lblReference(addPanel, lblReference);
		
		txtref = new JTextField();
		textField1(addPanel);
		
		JLabel lblRating = new JLabel("Rating");
		lblRating(addPanel, lblRating);
		
		txtrating = new JTextField();
		textfield2(addPanel);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice(addPanel, lblPrice);
		
		txtprice = new JTextField();
		textfield3(addPanel);
		
		JLabel lblReleaseYear = new JLabel("Release Year");
		lblReleaseYear(addPanel, lblReleaseYear);
		
		textField_4 = new JTextField();
		textfield4(addPanel);
		
		JButton btnAddFilm = new JButton("Add Film");
		buttonAddFilm(addPanel, lblFilmName, lblReference, lblRating, lblPrice, lblReleaseYear, btnAddFilm);
		
		//JPanel viewAllPanel = new JPanel();
		//addPanel(layeredPane, viewAllPanel);
		


		JPanel overviewPanel = new JPanel();
		SpringLayout sl_overviewPanel = overviewPanel(layeredPane, overviewPanel);
		
		txtNumberOfFilms = new JTextField();
		txtNumberOfFlims(overviewPanel, sl_overviewPanel);
		
		txtHighestrated = new JTextField();
		txtHighestRated(overviewPanel, sl_overviewPanel);
		
		JLabel lblHighestRatedFilm = new JLabel("Highest Rated Film");
		lblHighestRatedFilm(overviewPanel, sl_overviewPanel, lblHighestRatedFilm);
		
		//highlight panel details
		JPanel highlightPanel = new JPanel();
		highlightPanel(highlightPanel);
		
		JPanel panel = new JPanel();
		panel(panel);
		JPanel viewallpanel = new JPanel();
		viewallpanel(addPanel, viewallpanel);
		JButton powerButtonLight = new JButton("");
		powerbuttonLigth(panel, powerButtonLight);
		
		JButton OverviewButton = new JButton("Overview");
		overviewButton(layeredPane, addPanel,  viewallpanel, overviewPanel, highlightPanel, panel, OverviewButton);
		
		JButton TutorialButton = new JButton("Tutorial");
		tutorialButton(highlightPanel, panel, TutorialButton);
		
		JButton AddButton = new JButton("Add");
		addButton(layeredPane, addPanel, viewallpanel, overviewPanel, highlightPanel, panel, AddButton);
		
		JButton RemoveButton = new JButton("Remove");
		removeButton(highlightPanel, panel, RemoveButton);
		
		JButton ViewAllButton = new JButton("View All");
		viewallButton(layeredPane, addPanel, viewallpanel, overviewPanel, highlightPanel, panel, ViewAllButton);
		
		JButton PowerButton = new JButton("");
		powerButton(panel, powerButtonLight, PowerButton);
		
		JLabel lblExitApplication = new JLabel("Exit application");
		JPanel topPanel = lblExit(panel, lblExitApplication);
		
		JLabel lblSalmanMuinKayser = new JLabel("Salman Muin Kayser Chishti, Student Number: 21391217, 21391217@student.uwl.ac.uk");
		lblSalman(topPanel, lblSalmanMuinKayser);
		
		JLabel lblFilmAdderMade = new JLabel("Entitled Films");
		lblFilmAdderMade(topPanel, lblFilmAdderMade);
		
		
	}

	private void viewallpanel(JPanel addPanel, JPanel viewallPanel) {
		viewallPanel.setBounds(0, 0, 855, 426);
		layeredPane.add(viewallPanel);
		viewallPanel.setLayout(null);
		
		txtViewall = new JTextField();
		txtViewall.setBounds(61, 5, 732, 398);
		viewallPanel.add(txtViewall);
		txtViewall.setColumns(10);
		addPanel.setBounds(0, 0, 855, 426);
		layeredPane.add(addPanel);
		addPanel.setLayout(null);
	}


	private void addPanel(JLayeredPane layeredPane, JPanel addPanel) {
		
		
		
	}
	private void lblFilmAdderMade(JPanel topPanel, JLabel lblFilmAdderMade) {
		lblFilmAdderMade.setBounds(331, 0, 187, 39);
		lblFilmAdderMade.setFont(new Font("Century Gothic", Font.PLAIN, 31));
		topPanel.add(lblFilmAdderMade);
	}

	private void lblSalman(JPanel topPanel, JLabel lblSalmanMuinKayser) {
		lblSalmanMuinKayser.setBounds(162, 45, 669, 14);
		lblSalmanMuinKayser.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		topPanel.add(lblSalmanMuinKayser);
	}

	private JPanel lblExit(JPanel panel, JLabel lblExitApplication) {
		lblExitApplication.setBounds(43, 450, 158, 26);
		lblExitApplication.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		panel.add(lblExitApplication);
		
		JButton button = new JButton("");
		button.setVisible(false);
		button.setIcon(new ImageIcon(FilmAdder.class.getResource("/Assignment2/images/powericonlight.png")));
		button.setIconTextGap(0);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(0, 433, 48, 54);
		panel.add(button);
		
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(SystemColor.windowBorder);
		topPanel.setBounds(224, 0, 855, 61);
		frame.getContentPane().add(topPanel);
		topPanel.setLayout(null);
		return topPanel;
	}

	private void powerButton(JPanel panel, JButton powerButtonLight, JButton PowerButton) {
		PowerButton.setIconTextGap(0);
		PowerButton.setBounds(0, 433, 48, 54);
		
		/*PowerButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	 powerButtonLight.setVisible(true);
            	 PowerButton.setVisible(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	 powerButtonLight.setVisible(false);
            	 PowerButton.setVisible(true);
            }
        });*/
		PowerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		powerButtonLight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		PowerButton.setIcon(new ImageIcon(FilmAdder.class.getResource("/Assignment2/images/powericonSmaller.png")));
		panel.add(PowerButton);
		PowerButton.setBorderPainted(false);
		PowerButton.setFocusPainted(false);
		PowerButton.setContentAreaFilled(false);
	}

	private void viewallButton(JLayeredPane layeredPane, JPanel addPanel, JPanel viewallpanel, JPanel overviewPanel,
			JPanel highlightPanel, JPanel panel, JButton ViewAllButton) {
		ViewAllButton.setBounds(10, 322, 216, 68);
		ViewAllButton.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		ViewAllButton.setForeground(SystemColor.text);
		ViewAllButton.setBackground(new Color(102, 102, 153));
		//ViewAllButton.setBorder( new LineBorder(Color.BLACK) );
		ViewAllButton.setBorderPainted(false);
		ViewAllButton.setFocusPainted(false);
		//ViewAllButton.setContentAreaFilled(false);
		ViewAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				highlightPanel.setBounds(0, 324, 10, 65);
				layeredPane.setLayer(overviewPanel, 0);
				layeredPane.setLayer(addPanel, 0);		
				layeredPane.setLayer(viewallpanel, 1);
				txtViewall.setText(film.output());
				
				
				
				
			}
		});
		ViewAllButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                
            	ViewAllButton.setBackground(new Color(102, 123, 153));
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	ViewAllButton.setBackground(new Color(102, 102, 153));
            }
        });
		panel.add(ViewAllButton);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setBounds(43, -15, 197, 86);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 29));
		panel.add(lblNewLabel);
	}

	private void removeButton(JPanel highlightPanel, JPanel panel, JButton RemoveButton) {
		RemoveButton.setBounds(10, 258, 216, 68);
		RemoveButton.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		RemoveButton.setForeground(SystemColor.text);
		RemoveButton.setBackground(new Color(102, 102, 153));
		//RemoveButton.setBorder( new LineBorder(Color.BLACK) );
		RemoveButton.setBorderPainted(false);
		RemoveButton.setFocusPainted(false);
		//RemoveButton.setContentAreaFilled(false);
		RemoveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				highlightPanel.setBounds(0, 259, 10, 65);			}
		});
		RemoveButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                
            	RemoveButton.setBackground(new Color(102, 123, 153));
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	RemoveButton.setBackground(new Color(102, 102, 153));
            }
        });
		panel.add(RemoveButton);
	}

	private void addButton(JLayeredPane layeredPane, JPanel addPanel, JPanel viewallpanel,JPanel overviewPanel,
			JPanel highlightPanel, JPanel panel, JButton AddButton) {
		AddButton.setBounds(10, 191, 216, 68);
		AddButton.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		AddButton.setForeground(SystemColor.text);
		AddButton.setBackground(new Color(102, 102, 153));
		//RemoveButton.setBorder( new LineBorder(Color.BLACK) );
		AddButton.setBorderPainted(false);
		AddButton.setFocusPainted(false);
		//RemoveButton.setContentAreaFilled(false);
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				highlightPanel.setBounds(0, 192, 10, 65);
				layeredPane.setLayer(overviewPanel, 0);
				layeredPane.setLayer(addPanel, 1);
				layeredPane.setLayer(viewallpanel, 0);
			}
		});
		AddButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                
            	AddButton.setBackground(new Color(102, 123, 153));
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	AddButton.setBackground(new Color(102, 102, 153));
            }
        });
		panel.add(AddButton);
	}

	private void tutorialButton(JPanel highlightPanel, JPanel panel, JButton TutorialButton) {
		TutorialButton.setBounds(10, 126, 216, 68);
		TutorialButton.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		TutorialButton.setForeground(SystemColor.text);
		TutorialButton.setBackground(new Color(102, 102, 153));
		//TutorialButton.setBorder( new LineBorder(Color.BLACK) );
		TutorialButton.setBorderPainted(false);
		TutorialButton.setFocusPainted(false);
		//TutorialButton.setContentAreaFilled(false);
		TutorialButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				highlightPanel.setBounds(0, 127, 10, 65);
			}
		});
		TutorialButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                
                TutorialButton.setBackground(new Color(102, 123, 153));
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	TutorialButton.setBackground(new Color(102, 102, 153));
            }
        });
		panel.add(TutorialButton);
	}

	private void overviewButton(JLayeredPane layeredPane, JPanel addPanel,JPanel viewallpanel, JPanel overviewPanel,
			JPanel highlightPanel, JPanel panel, JButton OverviewButton) {
			OverviewButton.addMouseListener(new MouseAdapter() {
		            @Override
		            public void mouseEntered(MouseEvent e) {
		                
		                OverviewButton.setBackground(new Color(102, 123, 153));
		            }
	
		            @Override
		            public void mouseExited(MouseEvent e) {
		            	OverviewButton.setBackground(new Color(102, 102, 153));
		            }
		        });
			OverviewButton.setBounds(10, 60, 216, 68);
			OverviewButton.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			OverviewButton.setForeground(SystemColor.text);
			OverviewButton.setBackground(new Color(102, 102, 153));
			//OverviewButton.setBorder( new LineBorder(Color.BLACK) );
			OverviewButton.setBorderPainted(false);
			OverviewButton.setFocusPainted(false);
			//OverviewButton.setContentAreaFilled(false);
			OverviewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					highlightPanel.setBounds(0, 61, 10, 65);
					layeredPane.setLayer(overviewPanel, 1);
					layeredPane.setLayer(addPanel, 0);		
					layeredPane.setLayer(viewallpanel, 0);
				}
			});
			panel.setLayout(null);
			panel.add(OverviewButton);
	}

	private void powerbuttonLigth(JPanel panel, JButton powerButtonLight) {
		powerButtonLight.setVisible(false);
		powerButtonLight.setIcon(new ImageIcon(FilmAdder.class.getResource("/Assignment2/images/powericonlight.png")));
		powerButtonLight.setFocusPainted(false);
		powerButtonLight.setContentAreaFilled(false);
		powerButtonLight.setBorderPainted(false);
		powerButtonLight.setBounds(0, 433, 48, 54);
		panel.add(powerButtonLight);
	}

	private void panel(JPanel panel) {
		//panel.setBackground(SystemColor.activeCaptionBorder);
		panel.setBackground(new Color(119, 103, 153));
		panel.setForeground(SystemColor.windowBorder);
		panel.setBounds(0, 0, 226, 487);
		frame.getContentPane().add(panel);
	}

	private void highlightPanel(JPanel highlightPanel) {
		highlightPanel.setBackground(new Color(153, 153, 103));
		highlightPanel.setBounds(0, 61, 10, 65);
		frame.getContentPane().add(highlightPanel);
	}

	private void lblHighestRatedFilm(JPanel overviewPanel, SpringLayout sl_overviewPanel, JLabel lblHighestRatedFilm) {
		sl_overviewPanel.putConstraint(SpringLayout.SOUTH, lblHighestRatedFilm, -6, SpringLayout.NORTH, txtHighestrated);
		sl_overviewPanel.putConstraint(SpringLayout.EAST, lblHighestRatedFilm, -314, SpringLayout.EAST, overviewPanel);
		overviewPanel.add(lblHighestRatedFilm);
	}

	private void txtHighestRated(JPanel overviewPanel, SpringLayout sl_overviewPanel) {
		txtHighestrated.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		txtHighestrated.setBackground(new Color(0, 128, 128));
		txtHighestrated.setForeground(Color.GREEN);
		txtHighestrated.setText("highestRated");
		sl_overviewPanel.putConstraint(SpringLayout.NORTH, txtHighestrated, 0, SpringLayout.NORTH, txtNumberOfFilms);
		sl_overviewPanel.putConstraint(SpringLayout.WEST, txtHighestrated, 93, SpringLayout.EAST, txtNumberOfFilms);
		sl_overviewPanel.putConstraint(SpringLayout.SOUTH, txtHighestrated, 0, SpringLayout.SOUTH, txtNumberOfFilms);
		sl_overviewPanel.putConstraint(SpringLayout.EAST, txtHighestrated, 259, SpringLayout.EAST, txtNumberOfFilms);
		overviewPanel.add(txtHighestrated);
		txtHighestrated.setColumns(10);
	}

	private void txtNumberOfFlims(JPanel overviewPanel, SpringLayout sl_overviewPanel) {
		sl_overviewPanel.putConstraint(SpringLayout.NORTH, txtNumberOfFilms, 101, SpringLayout.NORTH, overviewPanel);
		sl_overviewPanel.putConstraint(SpringLayout.WEST, txtNumberOfFilms, 152, SpringLayout.WEST, overviewPanel);
		sl_overviewPanel.putConstraint(SpringLayout.SOUTH, txtNumberOfFilms, -270, SpringLayout.SOUTH, overviewPanel);
		sl_overviewPanel.putConstraint(SpringLayout.EAST, txtNumberOfFilms, -527, SpringLayout.EAST, overviewPanel);
		txtNumberOfFilms.setBackground(UIManager.getColor("RadioButtonMenuItem.selectionBackground"));
		txtNumberOfFilms.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		//txtNumberOfFilms.setText("Total: "+Films.getSize());
		txtNumberOfFilms.setText("Total films.");
		overviewPanel.add(txtNumberOfFilms);
		txtNumberOfFilms.setColumns(10);
	}

	private SpringLayout overviewPanel(JLayeredPane layeredPane, JPanel overviewPanel) {
		layeredPane.setLayer(overviewPanel, 0);
		
		overviewPanel.setBounds(0, 0, 855, 426);
		layeredPane.add(overviewPanel);
		SpringLayout sl_overviewPanel = new SpringLayout();
		overviewPanel.setLayout(sl_overviewPanel);
		return sl_overviewPanel;
	}



	private void buttonAddFilm(JPanel addPanel, JLabel lblFilmName, JLabel lblReference, JLabel lblRating,
			JLabel lblPrice, JLabel lblReleaseYear, JButton btnAddFilm) {
		btnAddFilm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				film = new Film();
				String a = txtname.getText().toString();
				String b = txtref.getText().toString();
				int c = Integer.parseInt(txtrating.getText());
				double d = Double.parseDouble(txtprice.getText());
				film.set(a ,b,c,d);
				films.add(film);
				txtViewall.setText(film.printName());
				
			}
		});
		btnAddFilm.setForeground(Color.WHITE);
		btnAddFilm.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		btnAddFilm.setFocusPainted(false);
		btnAddFilm.setBorderPainted(false);
		btnAddFilm.setBackground(new Color(102, 102, 153));
		btnAddFilm.setBounds(498, 318, 216, 68);
		addPanel.add(btnAddFilm);
	}

	private void textfield4(JPanel addPanel) {
		textField_4.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(324, 272, 390, 32);
		addPanel.add(textField_4);
	}

	private void lblReleaseYear(JPanel addPanel, JLabel lblReleaseYear) {
		lblReleaseYear.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblReleaseYear.setBounds(147, 272, 167, 32);
		addPanel.add(lblReleaseYear);
	}

	private void textfield3(JPanel addPanel) {
		txtprice.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		txtprice.setColumns(10);
		txtprice.setBounds(324, 226, 390, 32);
		addPanel.add(txtprice);
	}

	private void lblPrice(JPanel addPanel, JLabel lblPrice) {
		lblPrice.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblPrice.setBounds(147, 227, 151, 32);
		addPanel.add(lblPrice);
	}

	private void textfield2(JPanel addPanel) {
		txtrating.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		txtrating.setColumns(10);
		txtrating.setBounds(324, 184, 390, 32);
		addPanel.add(txtrating);
	}

	private void lblRating(JPanel addPanel, JLabel lblRating) {
		lblRating.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblRating.setBounds(147, 184, 151, 32);
		addPanel.add(lblRating);
	}

	private void textField1(JPanel addPanel) {
		txtref.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		txtref.setColumns(10);
		txtref.setBounds(324, 141, 390, 32);
		addPanel.add(txtref);
	}

	private void lblReference(JPanel addPanel, JLabel lblReference) {
		lblReference.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblReference.setBounds(147, 142, 151, 32);
		addPanel.add(lblReference);
	}

	private void lblFilmName(JPanel addPanel, JLabel lblFilmName) {
		lblFilmName.setBounds(147, 99, 151, 32);
		lblFilmName.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		addPanel.add(lblFilmName);
	}

	private void textField(JPanel addPanel) {
		txtname.setBounds(324, 99, 390, 32);
		txtname.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		addPanel.add(txtname);
		txtname.setColumns(10);
	}


	private void layeredPane(JLayeredPane layeredPane) {
		layeredPane.setBounds(224, 61, 855, 426);
		frame.getContentPane().add(layeredPane);
	}

	private void frame() {
		frame.setBounds(100, 100, 1095, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}
}
