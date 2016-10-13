package naughtsandcrosses;

import org.junit.Test;


public class BoardTest {

	@Test
	public void givenGameBoard_IfIPlaceAnXOnClearSquare_placeCounterShouldReturnTrue() {
		Board board = new Board();

		boolean placementSuccesful = board.placeX(0,0);

		assert(placementSuccesful);
	}

	@Test
	public void givenGameBoard_IfIPlaceAnXOnOccupiedSquare_placeCounterShouldReturnFalse() {
		Board board = new Board();

		board.placeX(0,0);
		boolean placementSuccesful = board.placeX(0,0);

		assert(!placementSuccesful);
	}

	@Test
	public void givenGameBoard_IfIPlaceAnOOnClearSquare_placeCounterShouldReturnTrue() {
		Board board = new Board();

		boolean placementSuccesful = board.placeO(0,0);

		assert(placementSuccesful);
	}

	@Test
	public void givenGameBoard_IfIPlaceAnOOnOccupiedSquare_placeCounterShouldReturnFalse() {
		Board board = new Board();

		board.placeO(0,0);
		boolean placementSuccesful = board.placeO(0,0);

		assert(!placementSuccesful);
	}

	@Test
	public void givenGameBoard_IfIPlaceThreeCountersOfSameTypeHorizontally_getWinState_shouldReturnTrue() {
		Board board = new Board();
		board.placeX(0,0);
		board.placeX(0,1);
		board.placeX(0,2);

		assert(board.getWinState());
	}

	@Test
	public void givenGameBoard_ifIPlaceThreeCountersOfSameTypeVertically_getWinState_shouldReturnTrue() {
		Board board = new Board();

		board.placeO(0,0);
		board.placeO(1,0);
		board.placeO(2,0);

		assert(board.getWinState());
	}

	@Test
	public void givenGameBoard_ifIPlaceThreeCountersOfSameTypeDiagonally_getWinState_shouldReturnTrue() {
		Board board = new Board();

		board.placeO(0,0);
		board.placeO(1,1);
		board.placeO(2,2);

		assert(board.getWinState());
	}

	@Test
	public void givenGameBoard_ifIDoNotPlaceThreeCountersInAWinningPosition_getWinState_shouldReturnFalse() {
		Board board = new Board();

		board.placeO(0,0);
		board.placeO(1,1);
		board.placeO(2,1);

		assert(!board.getWinState());
	}


}