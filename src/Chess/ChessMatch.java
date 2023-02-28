package Chess;

import Chess.Pieces.King;
import Chess.Pieces.Knight;
import Chess.Pieces.Rook;
import boardGame.Board;
import boardGame.Position;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public Board getBoard() {
		return board;
	}

	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.PlacePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		
		board.PlacePiece(new Rook(board, Color.WHITE), new Position(3,1));
		board.PlacePiece(new Rook(board, Color.BLACK), new Position(1,1));
		placeNewPiece('b', 6,new Rook(board, Color.BLACK));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
//		placeNewPiece('e', 1, new King(board, Color.WHITE));
	}
	
}
