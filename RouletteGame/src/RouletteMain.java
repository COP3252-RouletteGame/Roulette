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

public class RouletteMain extends JFrame {

	private JPanel contentPane;
	private JLabel lblWheelImg;
	private JLabel lblPlayerInfo;
	private JLabel lblPlayerName;
	private JLabel lblCurrentAmt;
	private JButton btnInstructions;
	private JButton btnExit;
	private JButton btnOptions;
	private JButton btnSpin;
	private JLabel lblGame;
	private JLabel lblCurrentBet;
	private JLabel lblNumSelect;
	private JLabel lblColor;
	private JLabel lblSpcBets;
	private JLabel lblWinnings;
	private JTextField Name;
	private JTextField Amt;
	private JTextField CurrentBet;
	private JTextField NumSelect;
	private JTextField Color;
	private JTextField Winnings;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblWheelImg = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/RouletteWheel.png")).getImage();
		lblWheelImg.setIcon(new ImageIcon(img));
		lblWheelImg.setBounds(10, 11, 300, 300);
		contentPane.add(lblWheelImg);
		
		lblPlayerInfo = new JLabel("Player Information");
		lblPlayerInfo.setFont(new Font("Arial", Font.BOLD, 12));
		lblPlayerInfo.setBounds(107, 327, 121, 30);
		contentPane.add(lblPlayerInfo);
		
		lblPlayerName = new JLabel("Player Name:");
		lblPlayerName.setBounds(10, 368, 93, 22);
		contentPane.add(lblPlayerName);
		
		Name = new JTextField();
		Name.setBounds(130, 368, 160, 20);
		contentPane.add(Name);
		Name.setColumns(10);
		
		lblCurrentAmt = new JLabel("Current Amount:");
		lblCurrentAmt.setBounds(10, 401, 110, 22);
		contentPane.add(lblCurrentAmt);
		
		Amt = new JTextField("1000");
		Amt.setColumns(10);
		Amt.setBounds(130, 399, 160, 20);
		contentPane.add(Amt);
		
		btnInstructions = new JButton("Instructions");
		btnInstructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Instructions instruct = new Instructions();
				instruct.setVisible(true);
			}
		});
		btnInstructions.setBounds(10, 474, 150, 36);
		contentPane.add(btnInstructions);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Exiting the Game... Thanks for Playing!");
				System.exit(0);;
			}
		});
		btnExit.setBounds(424, 474, 150, 36);
		contentPane.add(btnExit);
		
		btnOptions = new JButton("Odds Table");
		btnOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OddsTable table = new OddsTable();
				table.setVisible(true);
			}
		});
		btnOptions.setBounds(222, 474, 150, 36);
		contentPane.add(btnOptions);
		
		btnSpin = new JButton("Spin!");
		btnSpin.setBounds(350, 361, 150, 36);
		contentPane.add(btnSpin);
		
		lblGame = new JLabel("Roulette Game");
		lblGame.setFont(new Font("Arial", Font.BOLD, 12));
		lblGame.setBounds(379, 11, 121, 30);
		contentPane.add(lblGame);
		
		lblCurrentBet = new JLabel("Current Bet:");
		lblCurrentBet.setBounds(320, 52, 70, 22);
		contentPane.add(lblCurrentBet);
		
		CurrentBet = new JTextField();
		CurrentBet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		CurrentBet.setText("0");
		CurrentBet.setBounds(433, 52, 86, 20);
		contentPane.add(CurrentBet);
		CurrentBet.setColumns(10);
		
		lblNumSelect = new JLabel("Numbers Chosen:");
		lblNumSelect.setBounds(320, 85, 110, 22);
		contentPane.add(lblNumSelect);
		
		NumSelect = new JTextField();
		NumSelect.setColumns(10);
		NumSelect.setBounds(433, 86, 86, 20);
		contentPane.add(NumSelect);
		
		Color = new JTextField();
		Color.setColumns(10);
		Color.setBounds(433, 119, 86, 20);
		contentPane.add(Color);
		
		lblColor = new JLabel("Color:");
		lblColor.setBounds(320, 118, 70, 22);
		contentPane.add(lblColor);
		
		lblSpcBets = new JLabel("Special Bets");
		lblSpcBets.setBounds(392, 161, 86, 22);
		contentPane.add(lblSpcBets);
		
		lblWinnings = new JLabel("Current Winnings:");
		lblWinnings.setBounds(10, 434, 110, 22);
		contentPane.add(lblWinnings);
		
		Winnings = new JTextField("0");
		Winnings.setColumns(10);
		Winnings.setBounds(130, 435, 160, 20);
		contentPane.add(Winnings);
	}
}
