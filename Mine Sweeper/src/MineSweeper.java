import java.util.Scanner;
public class MineSweeper {
	private static final int SIZE = 8; // final means its constant
    private static String[][] mineField = new String[SIZE][SIZE]; // this is hidden 
    private static String[][] playerBoard = new String[SIZE][SIZE]; // what the player sees (These were helped with AI)
	public static void main(String[] args) 
	{
	
	generateBoard();
	randomizeMinePlacement();
	displayBoard();
	playGame();
	

	}

	private static void playGame() 
	{
		Scanner scanner = new Scanner(System.in);
        boolean playing = true;

        while (playing) 
        		{
            	System.out.print("Enter your move (like A3 or E6)");
            	char colPick = scanner.next().toUpperCase().charAt(0);
            	int rowPick = scanner.nextInt() - 1;
            	int colTranslate = colPick - 'A'; // this converts the Letters to numbers (AI help)
            	if(mineField[rowPick][colTranslate].equals("X"))
            		{
            		System.out.println("BOOM!! You hit a mine, Game over!");
            		revealAllMines();
            		displayBoard();
            		playing = false;
            		}
            	else
            		{
            		playerBoard[rowPick][colTranslate] = "O";
            		displayBoard();
            		}
                }
	}

	private static void revealAllMines() 
		{
		for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (mineField[row][col].equals("X")) {
                    playerBoard[row][col] = "X";
                }
            }
		}
	}

	private static void displayBoard() 
	{
		System.out.println("  |  A  |  B   |  C  |  D  |  E  |  F  |  G  |  H  | ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("1 | " + playerBoard[0][0] + "   |   " + playerBoard[0][1] + "  |  "+ playerBoard[0][2] + "  |  "+ playerBoard[0][3] + "  |  "+ playerBoard[0][4] + "  |  "+ playerBoard[0][5] + "  |  "+ playerBoard[0][6] + "  |  "+ playerBoard[0][7] + "  |  ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("2 | " + playerBoard[1][0] + "   |   " + playerBoard[1][1] + "  |  "+ playerBoard[1][2] + "  |  "+ playerBoard[1][3] + "  |  "+ playerBoard[1][4] + "  |  "+ playerBoard[1][5] + "  |  "+ playerBoard[1][6] + "  |  "+ playerBoard[1][7] + "  |  ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("3 | " + playerBoard[2][0] + "   |   " + playerBoard[2][1] + "  |  "+ playerBoard[2][2] + "  |  "+ playerBoard[2][3] + "  |  "+ playerBoard[2][4] + "  |  "+ playerBoard[2][5] + "  |  "+ playerBoard[2][6] + "  |  "+ playerBoard[2][7] + "  |  ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("4 | " + playerBoard[3][0] + "   |   " + playerBoard[3][1] + "  |  "+ playerBoard[3][2] + "  |  "+ playerBoard[3][3] + "  |  "+ playerBoard[3][4] + "  |  "+ playerBoard[3][5] + "  |  "+ playerBoard[3][6] + "  |  "+ playerBoard[3][7] + "  |  ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("5 | " + playerBoard[4][0] + "   |   " + playerBoard[4][1] + "  |  "+ playerBoard[4][2] + "  |  "+ playerBoard[4][3] + "  |  "+ playerBoard[4][4] + "  |  "+ playerBoard[4][5] + "  |  "+ playerBoard[4][6] + "  |  "+ playerBoard[4][7] + "  |  ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("6 | " + playerBoard[5][0] + "   |   " + playerBoard[5][1] + "  |  "+ playerBoard[5][2] + "  |  "+ playerBoard[5][3] + "  |  "+ playerBoard[5][4] + "  |  "+ playerBoard[5][5] + "  |  "+ playerBoard[5][6] + "  |  "+ playerBoard[5][7] + "  |  ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("7 | " + playerBoard[6][0] + "   |   " + playerBoard[6][1] + "  |  "+ playerBoard[6][2] + "  |  "+ playerBoard[6][3] + "  |  "+ playerBoard[6][4] + "  |  "+ playerBoard[6][5] + "  |  "+ playerBoard[6][6] + "  |  "+ playerBoard[6][7] + "  |  ");
		System.out.println("  |------------------------------------------------|");
		System.out.println("8 | " + playerBoard[7][0] + "   |   " + playerBoard[7][1] + "  |  "+ playerBoard[7][2] + "  |  "+ playerBoard[7][3] + "  |  "+ playerBoard[7][4] + "  |  "+ playerBoard[7][5] + "  |  "+ playerBoard[7][6] + "  |  "+ playerBoard[7][7] + "  |  ");
		System.out.println("  |------------------------------------------------|");
	}

	private static void randomizeMinePlacement() 
	{
	for(int row = 0; row < SIZE; row++)
		{
		int minesPerRow = (int)(Math.random()*3);
		
		for (int i = 0; i < minesPerRow; i++)
			{
			int col = (int)(Math.random()*SIZE);
			if(mineField[row][col].equals(" "))
				{
				mineField[row][col] = "X";
				}
			else
				{
				i--;
				}
			
			}
		
		
		}
	for(int row = 0; row < mineField.length; row++)
	{
	
	for(int col = 0; col < mineField[0].length; col++)
		{
		String spot = mineField[row][col];
		if(spot.equals("X"))
				{
				spot = " "; 
				}
			}
		}
	}

	private static void generateBoard() 
	{
		for(int row = 0; row < SIZE; row++) 
			{
			for(int col = 0; col < SIZE; col++)
				{
				mineField[row][col] = " ";
				playerBoard[row][col] = " ";
				}
			} 
	
		
		
	

	}
}
