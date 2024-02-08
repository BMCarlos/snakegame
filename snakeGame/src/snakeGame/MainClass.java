package snakeGame;
import java.util.Scanner;

public class MainClass {
		public static void main(String[] args) {
			GameBoard gameBoard = new GameBoard(10, 10);
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				gameBoard.printBoard();
				System.out.println("Enter direction (W/A/S/D): ");
				char direction = scanner.next().charAt(0);
				
				// update the snake's position based on user input
				switch (direction) {
				case 'W':
					//Move up
					break;
				case 'A':
					//Move left
					break;
				case 'S': 
					//Move down
					break;
				case 'D':
					//Move right
					break;
				default:
					System.out.println("Invalid Directions!");
					break;
				
				
				}
	            // update the game state (e.g., check for collisions)

	            // exit the game loop when needed
			}
			
		}
}
