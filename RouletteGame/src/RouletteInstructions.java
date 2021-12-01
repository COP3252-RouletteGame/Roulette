import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class RouletteInstructions extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RouletteInstructions frame = new RouletteInstructions();
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
	public RouletteInstructions() {
		super("Roulette - Tutorial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Roulette - How to Play");
		lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
		lblTitle.setBounds(134, 11, 226, 29);
		contentPane.add(lblTitle);
		
		JTextPane txtpnBeforeEachSpin = new JTextPane();
		txtpnBeforeEachSpin.setText("Before each spin of the roulette wheel, the player will decide where they would like to place their bets!");
		txtpnBeforeEachSpin.setBounds(50, 67, 358, 34);
		contentPane.add(txtpnBeforeEachSpin);
		
		JTextPane txtpnTheRouletteTable = new JTextPane();
		txtpnTheRouletteTable.setText("The roulette table has two parts: the inside and the outside! The inside bets contain the numbers 1-36. If you place your bet on one number and it \u201Chits\u201D (the roulette wheel spin lands on that number), it pays 35 to 1! The outside bets are even, odd, red, black, the first half of the numbers, and the last half of the numbers which pay even. You can also bet on the first 12, second 12, and last 12 which pay 2 to 1!");
		txtpnTheRouletteTable.setBounds(50, 125, 358, 120);
		contentPane.add(txtpnTheRouletteTable);
		
		JTextPane txtpnIfYouWin = new JTextPane();
		txtpnIfYouWin.setText("If you win, you can continue betting or collect your earnings!");
		txtpnIfYouWin.setBounds(50, 268, 358, 20);
		contentPane.add(txtpnIfYouWin);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
