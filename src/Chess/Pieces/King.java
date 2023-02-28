package Chess.Pieces;

import Chess.ChessPiece;
import boardGame.Board;

public class King extends ChessPiece{

	public King(Board board, Chess.Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}
	
}
