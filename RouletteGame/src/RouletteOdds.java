import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class RouletteOdds extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RouletteOdds frame = new RouletteOdds();
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
	public RouletteOdds() {
		super("Roulette - Odds Table");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRouletteOdds = new JLabel("Roulette - Odds Table");
		lblRouletteOdds.setFont(new Font("Arial", Font.BOLD, 20));
		lblRouletteOdds.setBounds(133, 11, 226, 29);
		contentPane.add(lblRouletteOdds);
		
		JTextPane txtpnTheRouletteTable = new JTextPane();
		txtpnTheRouletteTable.setText("The roulette table has two parts: the inside and the outside! The inside bets contain the numbers 1-36. If you place your bet on one number and it \u201Chits\u201D (the roulette wheel spin lands on that number), it pays 35 to 1! The outside bets are even, odd, red, black, the first half of the numbers, and the last half of the numbers which pay even. You can also bet on the first 12, second 12, and last 12 which pay 2 to 1!");
		txtpnTheRouletteTable.setBounds(51, 51, 358, 124);
		contentPane.add(txtpnTheRouletteTable);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
