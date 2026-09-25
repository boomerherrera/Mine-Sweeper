
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
				
				}
			}
		
		System.out.println("  |  A  |  B   |  C  |  D  |  E  |  F  |  H  |  I  | ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("1 | " + mineField[0][0] + "| " + mineField[0][1] + "| "+ mineField[0][2] + "| "+ mineField[0][3] + "| "+ mineField[0][4] + "| "+ mineField[0][5] + "| "+ mineField[0][6] + "| "+ mineField[0][7] + " | ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("2 |");
		System.out.println("  |------------------------------------------------|");
		System.out.println("3 |");
		System.out.println("  |------------------------------------------------|");
		System.out.println("4 |");
		System.out.println("  |------------------------------------------------|");
		System.out.println("5 |");
		System.out.println("  |------------------------------------------------|");
		System.out.println("6 |");
		System.out.println("  |------------------------------------------------|");
		System.out.println("7 |");
		System.out.println("  |------------------------------------------------|");
		System.out.println("8 |");
		System.out.println("  |------------------------------------------------|");
	}

}
