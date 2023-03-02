package Chess.Pieces;

import Chess.ChessPiece;
import boardGame.Board;

public class Knight extends ChessPiece{

	public Knight(Board board, Chess.Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] PossibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
	
}
