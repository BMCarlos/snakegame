package snakeGame;

public class GameBoard {
	private int[][] board;
	private int snakeX, snakeY;
	
	public GameBoard(int width, int height) {
		board = new int[width][height];
		snakeX = width/2;
		snakeY = height/2;
		board[snakeX][snakeY] = 1; //initalize the snake position
		
	}
	
	public void printBoard() {
		for(int[] row : board) {
			for(int cell : row) {
				System.out.print(cell + " ");
			}
			System.out.println();
		}
		
	}
	
	
	

}
