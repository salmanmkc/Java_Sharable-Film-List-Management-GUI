package Assignment2;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Rectangle;

public class viewall extends JPanel {

	/**
	 * Create the panel.
	 */
	public viewall() {
		setBounds(new Rectangle(0, 0, 855, 426));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBackground(Color.PINK);
		add(btnNewButton);

	}

}
