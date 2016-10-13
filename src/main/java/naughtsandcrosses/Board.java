package naughtsandcrosses;


public class Board {

	Cell[] firstRow = {new Cell(), new Cell(), new Cell()};
	Cell[] secondRow = {new Cell(), new Cell(), new Cell()};
	Cell[] thirdRow = {new Cell(), new Cell(), new Cell()};

	Cell[][] board = {firstRow, secondRow, thirdRow};

	private boolean winState;

	public Board() {
	}

	public boolean placeX(int x, int y) {
		if(!board[x][y].isOccupied()){
			board[x][y].putX();
			printBoard();
			return true;
		}
		return false;
	}

	public boolean placeO(int x, int y) {
		if(!board[x][y].isOccupied()) {
			board[x][y].putO();
			printBoard();
			return true;
		}
		return false;
	}

	public boolean getWinState() {
		return (checkHorizontalWinState(board) || checkVerticalWinState(board) || checkDiagonalWinState(board));
	}

	private boolean checkHorizontalWinState(Cell[][] cells) {
		boolean winState = false;

		for(Cell[] c : cells) {
			if(checkWinState(c[0], c[1], c[2])){
				winState = true;
			}
		}
		return winState;
	}

	private boolean checkVerticalWinState(Cell [][] cells) {
		boolean winState = false;
		for(int i = 0; i < cells.length; i++) {
			if(checkWinState(cells[0][i], cells[1][i], cells[2][i])) {
				winState = true;
			}
		}
		return winState;
	}

	private boolean checkDiagonalWinState(Cell[][] cells) {
		return (checkWinState(cells[0][0], cells[1][1], cells[2][2]) || checkWinState(cells[2][0], cells[1][1], cells[0][2]));
	}

	private boolean checkWinState(Cell cellOne, Cell cellTwo, Cell cellThree) {
		if(cellOne.isOccupied() && cellTwo.isOccupied() && cellThree.isOccupied()) {
			return(cellOne.getOccupier().getValue() == cellTwo.getOccupier().getValue() && cellTwo.getOccupier().getValue() == cellThree.getOccupier().getValue());
		}
		return false;
	}

	private void printBoard() {
		for(Cell[] cells : board) {
			System.out.println(cells[0].getOccupier().toString() + "|" + cells[1].getOccupier().toString() + "|" + cells[2].getOccupier().toString() );
		}
	}





}
