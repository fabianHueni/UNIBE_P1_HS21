// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie05.task01;
/* ************************************************************************* *\
*                Programmierung 1 HS 2020 - Serie 5-1                         *
\* ************************************************************************* */

import java.util.Arrays;
import java.util.Scanner;


public class VierGewinnt
{

	public static final int COLS = 7;
	public static final int ROWS = 6;

	private Token[][] board = new Token[ COLS ][ ROWS ]; // 7 columns with 6 fields each
	private IPlayer[] players = new IPlayer[ 2 ]; // two players

	/** initialize board and players and start the game */
	public void play()
	{
		// initialize the board
		for ( Token[] column : this.board ) {
			Arrays.fill( column, Token.empty );
		}

		/* initialize players */
		players[ 0 ] = new HumanPlayer();
		System.out.print( "Play against a human opponent? (y / n) " );
		String opponent = new Scanner( System.in ).nextLine().toLowerCase();
		while ( ( 1 != opponent.length() ) || ( -1 == ( "yn".indexOf ( opponent ) ) ) ) {
			System.out.print( "Can't understand your answer. Play against a human opponent? (y / n) " );
			opponent = new Scanner( System.in ).nextLine().toLowerCase();
		}
		if ( opponent.equals( "y" ) ) {
			players[ 1 ] = new HumanPlayer();
		} else {
			players[ 1 ] = new ComputerPlayer();
		}
		players[ 0 ].setToken( Token.player1 );
		players[ 1 ].setToken( Token.player2 );

		/* play... */
		boolean solved = false;
		int currentPlayer = ( new java.util.Random() ).nextInt( 2 );  //choose randomly who begins
		System.out.println( "current player: " + currentPlayer );
		int insertCol, insertRow; // starting from 0
		while ( !solved && !this.isBoardFull() ) {
			// get player's next "move"
			// note that we pass only a copy of the board as an argument,
			// otherwise the player would be able to manipulate the board and cheat!
			insertCol = players[ currentPlayer ].getNextColumn( getCopyOfBoard() );
			// insert the token and get the row where it landed
			insertRow = this.insertToken( insertCol, players[ currentPlayer ].getToken() );
			// check if the game is over
			solved = this.checkVierGewinnt( insertCol, insertRow );
			//switch to other player
			if ( !solved )
				currentPlayer = ( currentPlayer + 1 ) % 2;
		}
		System.out.println( displayBoard( this.board ) );
		if ( solved )
			System.out.println( "Player " + players[ currentPlayer ].getToken() + " wins!" );
		else
			System.out.println( "Draw! Game over." );
	}


	/**
	 * Inserts the token at the specified column (if possible)
	 * @param column the column to insert the token
	 * @param tok the players token
	 * @return the row where the token landed 
	 */
	private int insertToken( int column, Token tok )
	{
		// exit the program if
		//  * for the selected column index no column exists or
		//  * the selected column is already full
		if(column >= board.length || column < 0 || board[column][board[0].length - 1] != Token.empty) {
			System.exit(1);
		}

		int addedRow = -1;
		for(int i = 0; i < board[column].length; i++){
			if(board[column][i] == Token.empty && addedRow == -1) {
				board[column][i] = tok;
				addedRow = i;
			}
		}

		return addedRow;
	}


	/**
	 * Checks if every position is occupied 
	 * @returns true, if the board is full.
	 */
	private boolean isBoardFull()
	{
		for (Token[] column: board) {
			for (Token token : column) {
				if (token == Token.empty) {
					return false;
				}
			}
		}
		return true;
	}


	/**
	 * Checks for at least four equal tokens next to each other in
	 * either direction, starting from the given position.
	 *
	 * we do following to check vertical, horizontal and diagonal directions.
	 * we start with -3 and end up on 3. if in this interval are more than
	 * three same tokens next to each other one the game is won.
	 * if there is already one check variable ge than 4, then wo don't need to continue.
	 */
	private boolean checkVierGewinnt( int col, int row )
	{
		// token of the field to check from
		Token tokenToCheck = this.board[col][row];

		// check variable for vertical, horizontal and diagonal directions
		// we will increment them, if next to the tested field is another field with the same token
		int fourInCol = 0, fourInRow = 0, diagonalLeftRight = 0, diagonalRightLeft = 0;

		/* for each direction we do:
		 *   - check that the index is not outside the array.
		 *   - check if the actual field is equals to the comparison field
		 *   - if true, then increment the corresponding check variable
		 *   - if false, the reset the corresponding check variable to zero
		 */
		for (int i = -3;
			 i < 4 && fourInCol < 4 && fourInRow < 4 && diagonalLeftRight < 4 && diagonalRightLeft < 4;
			 i++) {

			// check up and down directions
			fourInCol = ((row + i) < board[col].length && (row + i) >= 0
					&& tokenToCheck == this.board[col][row + i])
					? ++fourInCol: 0;

			// check right and left directions
			fourInRow = ((col + i) < board.length && (col + i) >= 0
					&& tokenToCheck == this.board[col + i][row])
					? ++fourInRow: 0;

			// checks the diagonal directions from down left to right up
			diagonalLeftRight = ((col + i) >= 0 && (row + i) >= 0
					&& (col + i) < board.length && (row + i) < board[col].length
					&& tokenToCheck == this.board[col + i][row + i])
					? ++diagonalLeftRight: 0;

			// checks the diagonal directions from down right to left up
			diagonalRightLeft = ((col - i) >= 0 && (row + i) >= 0
					&& (col - i) < board.length && (row + i) < board[col].length
					&& tokenToCheck == this.board[col - i][row + i])
					? ++diagonalRightLeft: 0;
		}

		// if one of the tested direction has four next to each other, then the game is won.
		return fourInCol == 4|| fourInRow == 4
				|| diagonalRightLeft == 4 || diagonalLeftRight == 4;
	}


	/** Returns a (deep) copy of the board array */
	private Token[][] getCopyOfBoard()
	{
		Token[][] copiedBoard = new Token[ COLS ][ ROWS ];
		for ( int i = 0; i < copiedBoard.length; i++ ) {
			for ( int j = 0; j < copiedBoard[ i ].length; j++ ) {
				copiedBoard[ i ][ j ] = this.board[ i ][ j ];
			}
		}
		return copiedBoard;
	}


	/** returns a graphical representation of the board */
	public static String displayBoard( Token[][] myBoard )
	{
		String rowDelimiter = "+";
		String rowNumbering = " ";
		for ( int col = 0; col < myBoard.length; col++ ) {
			rowDelimiter += "---+";
			rowNumbering += " " + ( col + 1 ) + "  ";
		}
		rowDelimiter += "\n";

		String rowStr;
		String presentation = rowDelimiter;
		for ( int row = myBoard[ 0 ].length - 1; row >= 0; row-- ) {
			rowStr = "| ";
			for ( int col = 0; col < myBoard.length; col++ ) {
				rowStr += myBoard[ col ][ row ].toString() + " | ";
			}
			presentation += rowStr + "\n" + rowDelimiter;
		}
		presentation += rowNumbering;
		return presentation;
	}



	/** main method, starts the program */
	public static void main(String[] args)
	{
		VierGewinnt game = new VierGewinnt();
		game.play();
	}
}
