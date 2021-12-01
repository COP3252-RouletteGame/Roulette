COP3252 - Game Project - Roulette
Kobra Amirzirtol

Created by:

Andrew Stade
Tessa Hartmann
McKenzie Ozment

				RouletteGame README
================================================================================
================================================================================
				Introduction:
================================================================================

The files submitted should contain the following:

- README.txt 		- (aka this file)
- RouletteGame.jar 	- an executable jar for running the program
- RouletteGame		- the directory for the project

Inside of the RouletteGame directory there are the following:

- bin		- the "main" compilation of class and image files
- img		- a storage directory for images used (not linked to source code)
- src		- the java files and source code location

If you wish to look at the source code, please navigate to the src folder and inspect
the apporiate java files.

================================================================================
				Instructions:
================================================================================

The game can be launched in two different ways

- The .jar file (RECOMENDED)
	1. Open command or any compatabile console
	2. Navigate to the .jar location
	3. Launch via the following command:
	java -jar RouletteGame.jar
	4. Play

- Through source files (NOT RECOMENDED)
	1. Open command or any compatabile console
	2. Navigate to the bin location
	3. Launch via the following command:
	java RouletteStart
	4. Play

You will more likely be able to run the program through the jar file then through
the source code. Refer to the video demo for more details.

================================================================================
				Implementation:
================================================================================

The user enters their bet amount to a text field in our application.

Then the user can begin betting. The user does this by simply selecting or “clicking” 
the positions of the board where they would like to place their bets.

Once their bets have been placed, the user will then instruct the game to begin by 
selecting the spin button which will prompt randomization which will select the winning number! 

The user can then either end the game or continue playing!

================================================================================
				Tutorial/Rules: 
================================================================================

Navigate through the menus to play Roulette.

Before each spin of the roulette wheel, the player will decide where they would like to place their bets!

The roulette table has two parts: the inside and the outside! 
The inside bets contain the numbers 1-36. 
If you place your bet on one number and it “hits” (the roulette wheel spin lands on that number), 
it pays 35 to 1! The outside bets are even, odd, red, black, the first half of the numbers, 
and the last half of the numbers which pay even. You can also bet on the first 12, second 12, 
and last 12 which pay 3 to 1!

If you win, you can continue betting or collect your earnings!

================================================================================
				Source Code Overview:
================================================================================

Found in the following location: 
RouletteGame/src/

RouletteGame.java - Defines all buttons, sets input, gets results, and calculates winnings. 
RouletteInstructions.java - Holds the instructions for the game itself. 
RouletteMain.java - Launches the main menu of the game. 
RouletteOdds.java - Holds the roulette odds table. 
RouletteSpot.java - Sets bets on the spot of the board to determine the user’s winnings.
RouletteStart.java - Launches, creates, and initializes the frame. 
RouletteTable.java - Saves where the user places their bet(s) on the table.
RouletteWheel.java - Number from “wheel” selected using randomization. 

================================================================================
				Help
================================================================================

If you have any issues running the program or the functionality of the application,
refer to the video demo or reach out to one of the group members for assistance.

Link to github page:
https://github.com/COP3252-RouletteGame/Roulette

================================================================================
			Thank you and we hope you enjoy Roulette!







