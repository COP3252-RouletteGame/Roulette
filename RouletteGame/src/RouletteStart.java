import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Image;


public class RouletteStart {

	private JFrame frame;
	private JLabel lblTitle;
	private JLabel lblAuthors;
	private JLabel lblRouletteIcon;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RouletteStart window = new RouletteStart();
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
	public RouletteStart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnStartButton = new JButton("Start");
		btnStartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Launching the Game... Press OK.");
				frame.dispose();
				RouletteMain roulMain = new RouletteMain();
				roulMain.setVisible(true);
			}
		});
		btnStartButton.setBounds(161, 213, 96, 23);
		frame.getContentPane().add(btnStartButton);
		
		lblTitle = new JLabel("Welcome to Roulette!");
		lblTitle.setForeground(Color.GREEN);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 30));
		lblTitle.setBounds(65, 11, 304, 65);
		frame.getContentPane().add(lblTitle);
		
		lblAuthors = new JLabel("Created by: Andrew Stade, Tessa Hartman, and McKenzie Ozment");
		lblAuthors.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAuthors.setBounds(54, 69, 325, 38);
		frame.getContentPane().add(lblAuthors);
		
		lblRouletteIcon = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Roulette-icon.png")).getImage();
		lblRouletteIcon.setIcon(new ImageIcon(img));
		lblRouletteIcon.setBounds(161, 106, 96, 96);
		frame.getContentPane().add(lblRouletteIcon);
		
	}
}
