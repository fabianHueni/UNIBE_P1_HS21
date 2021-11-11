// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie05.task01;
/* ************************************************************************* *\
*                Programmierung 1 HS 2020 - Serie 5-1                         * 
\* ************************************************************************* */


/** A very stupid computer player */
public class ComputerPlayer implements IPlayer
{
	private Token token;

	/**
	 * Strategy is to chose a random column and select 
	 * the next valid column to the right (the chosen included)
	 *
	 * Extended (more intelligent, but not enough intelligent at all):
	 * We perform the following operations in the given order and priority:
	 *  - check if there is a col with which the opponent will finish the game. If yes, then choose this one.
	 *  - check if there is a col with which the computer can finish the game. If yes, choose this col.
	 *  - else we choose a random col which isn't already full
	 */
	public int getNextColumn( Token[][] board )
	{
		Token opponentsToken = (this.token == Token.player1)? Token.player2: Token.player1;
		int opponentColToFinish = checkNextColumn(board, opponentsToken);
		int myColToFinish = checkNextColumn(board, this.token);

		if(opponentColToFinish != -1 && false) {
			return opponentColToFinish;
		} else if(myColToFinish != -1) {
			return myColToFinish;
		} else {
			java.util.Random generator = new java.util.Random();
			int col = generator.nextInt( board.length );
			int step = 0;
			while ( isColFull( col, board ) ) {
				col = ( col + 1 ) % board.length;
			}
			return col;
		}
	}


	/**
	 * checks if there is any field with which we can finish the game.
	 * Not covered cases:
	 * 	- detect only the first option. if there are several, they won't get detected.
	 * 	- if there are right and left of the field few tokens, then it won't get detected by this method.
	 *
	 * @param board board to check
	 * @param tokenToCheck the token to check with
	 * @return if a column is found it will return the column number. Otherwise, it will return -1.
	 */
	private int checkNextColumn(Token[][] board, Token tokenToCheck) {
		// check variable for up, down, left and right
		int colToChoose = -1;

		// Loop over all fields. if the field is empty, check if we can finish the game, if we put there a token.
		for (int col = 0; col < board.length; col++) {
			for (int row = 0; row < board[col].length; row++) {
				if(board[col][row] == Token.empty) {
					// check variable for down, left and right
					boolean fourInColDown = true, fourInRowRight = true, fourInRowLeft = true;

					// check variable downwards diagonal directions
					boolean diagonalDownLeft = true, diagonalDownRight = true, diagonalUpRight = true, diagonalUpLeft = true;

					for (int i = 1; i < 4; i++) {
						// check down, right and left (-/+ are switched because origin is down left)
						fourInRowRight = ((col + i) < board.length && fourInRowRight && tokenToCheck == board[col + i][row] );
						fourInRowLeft = ((col - i) >= 0 && fourInRowLeft && tokenToCheck == board[col - i][row] );
						fourInColDown = ((row - i) >= 0  && fourInColDown && tokenToCheck == board[col][row - i]);

						// checks both downwards diagonal directions (-/+ are switched because origin is down left)
						diagonalDownLeft = ((col + i) < board.length && (row - i) >= 0 && diagonalDownLeft
								&& tokenToCheck == board[col + i][row - i]);
						diagonalDownRight = ((col - i) >= 0 && (row - i) >= 0 && diagonalDownRight
								&& tokenToCheck == board[col - i][row - i] );
						diagonalUpRight = ((col + i) < board.length && (row + i) < board[0].length && diagonalDownRight
								&& tokenToCheck == board[col + i][row + i] );
						diagonalUpLeft = ((col - i) >= 0 && (row + i) < board[0].length && diagonalDownRight
								&& tokenToCheck == board[col - i][row + i] );
					}

					// if the checked field can finish the game in one direction, choose this row and finish check
					if (fourInColDown || fourInRowLeft || fourInRowRight
							|| diagonalDownLeft || diagonalDownRight || diagonalUpLeft || diagonalUpRight)
						return col;
				}
			}
		}
		return colToChoose;
	}


	/**
	 * @return true if the column col is already full and false otherwise. 
	 */
	private boolean isColFull( int col, Token[][] board )
	{
		int topRow = board[ col ].length - 1;
		return ( board[ col ][ topRow ] != Token.empty );
	}


	public void setToken( Token token )
	{
		this.token = token;
	}

	public Token getToken()
	{
		return this.token;
	}

	public String getPlayersName()
	{
		return "Random Player";
	}
}
