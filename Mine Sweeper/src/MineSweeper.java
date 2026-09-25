
public class MineSweeper {
	static String[][] mineField = new String[8][8];
	public static void main(String[] args) 
	{
	
	generateBoard();
	randomizeMinePlacement();
	displayBoard();
	playGame();
	

	}

	private static void playGame() 
	{
		
		
	}

	private static void displayBoard() 
	{
		System.out.println("  |  A  |  B   |  C  |  D  |  E  |  F  |  H  |  I  | ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("1 | " + mineField[0][0] + "   |   " + mineField[0][1] + "  |  "+ mineField[0][2] + "  |  "+ mineField[0][3] + "  |  "+ mineField[0][4] + "  |  "+ mineField[0][5] + "  |  "+ mineField[0][6] + "  |  "+ mineField[0][7] + "  |  ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("2 | " + mineField[1][0] + "   |   " + mineField[1][1] + "  |  "+ mineField[1][2] + "  |  "+ mineField[1][3] + "  |  "+ mineField[1][4] + "  |  "+ mineField[1][5] + "  |  "+ mineField[1][6] + "  |  "+ mineField[1][7] + "  |  ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("3 | " + mineField[2][0] + "   |   " + mineField[2][1] + "  |  "+ mineField[2][2] + "  |  "+ mineField[2][3] + "  |  "+ mineField[2][4] + "  |  "+ mineField[2][5] + "  |  "+ mineField[2][6] + "  |  "+ mineField[2][7] + "  |  ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("4 | " + mineField[3][0] + "   |   " + mineField[3][1] + "  |  "+ mineField[3][2] + "  |  "+ mineField[3][3] + "  |  "+ mineField[3][4] + "  |  "+ mineField[3][5] + "  |  "+ mineField[3][6] + "  |  "+ mineField[3][7] + "  |  ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("5 | " + mineField[4][0] + "   |   " + mineField[4][1] + "  |  "+ mineField[4][2] + "  |  "+ mineField[4][3] + "  |  "+ mineField[4][4] + "  |  "+ mineField[4][5] + "  |  "+ mineField[4][6] + "  |  "+ mineField[4][7] + "  |  ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("6 | " + mineField[5][0] + "   |   " + mineField[5][1] + "  |  "+ mineField[5][2] + "  |  "+ mineField[5][3] + "  |  "+ mineField[5][4] + "  |  "+ mineField[5][5] + "  |  "+ mineField[5][6] + "  |  "+ mineField[5][7] + "  |  ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("7 | " + mineField[6][0] + "   |   " + mineField[6][1] + "  |  "+ mineField[6][2] + "  |  "+ mineField[6][3] + "  |  "+ mineField[6][4] + "  |  "+ mineField[6][5] + "  |  "+ mineField[6][6] + "  |  "+ mineField[6][7] + "  |  ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("8 | " + mineField[7][0] + "   |   " + mineField[7][1] + "  |  "+ mineField[7][2] + "  |  "+ mineField[7][3] + "  |  "+ mineField[7][4] + "  |  "+ mineField[7][5] + "  |  "+ mineField[7][6] + "  |  "+ mineField[7][7] + "  |  ");
		System.out.println("  |------------------------------------------------|");
		
	}

	private static void randomizeMinePlacement() 
	{
		
		
	}

	private static void generateBoard() 
	{
		for(int row = 0; row < mineField.length; row++)
			{
			for(int col = 0; col < mineField[0].length; col++)
				{
				mineField[row][col] = " ";
				}
			}
		
		
		
	}

}
