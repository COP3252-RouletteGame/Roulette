import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RouletteMain extends JFrame {

	private JPanel contentPane;
	private JLabel lblWheelImg;
	private JButton btnInstructions;
	private JButton btnExit;
	private JButton btnOptions;
	private JButton btnSpin;
	private JLabel lblGame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RouletteMain frame = new RouletteMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RouletteMain() {
		super("Roulette - Main Menu");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblWheelImg = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/RouletteWheel_v2.png")).getImage();
		lblWheelImg.setIcon(new ImageIcon(img));
		lblWheelImg.setBounds(10, 11, 300, 300);
		contentPane.add(lblWheelImg);
		
		btnInstructions = new JButton("Instructions");
		btnInstructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RouletteInstructions instruct = new RouletteInstructions();
				instruct.setVisible(true);
			}
		});
		btnInstructions.setBounds(347, 122, 150, 36);
		contentPane.add(btnInstructions);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Exiting the Game... Thanks for Playing!");
				System.exit(0);;
			}
		});
		btnExit.setBounds(347, 275, 150, 36);
		contentPane.add(btnExit);
		
		btnOptions = new JButton("Odds Table");
		btnOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RouletteOdds table = new RouletteOdds();
				table.setVisible(true);
			}
		});
		btnOptions.setBounds(347, 193, 150, 36);
		contentPane.add(btnOptions);
		
		btnSpin = new JButton("Play!");
		btnSpin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RouletteGame.main(null);
			}
		});
		btnSpin.setBounds(347, 52, 150, 36);
		contentPane.add(btnSpin);
		
		lblGame = new JLabel("Roulette Game - Main Menu");
		lblGame.setFont(new Font("Arial", Font.BOLD, 12));
		lblGame.setBounds(348, 11, 159, 30);
		contentPane.add(lblGame);
		

	}
}
