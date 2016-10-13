package naughtsandcrosses;

public class Game {

	private static UserInput userInput = new UserInput();
	private static Board board;

	public static void main(String[] args) {
		board = new Board();

		System.out.println("Enter co-ordinates for x turn ");
		xTurn();
	}

	private  static Integer[] getInput() {
		String input = userInput.getUserInput();
		String[] inputArray = input.split(",");
		Integer xCoordinate = Integer.parseInt(inputArray[0]);
		Integer yCoordinate = Integer.parseInt(inputArray[1]);

		Integer[] coords = {xCoordinate, yCoordinate};
		return coords;
	}

	private static void xTurn() {
		Integer[] coords = getInput();

		if(board.placeX(coords[0], coords[1])) {
			if(board.getWinState()) {
				System.out.println("X WON");
			}else {
				oTurn();
			}

		}else {
			System.out.println("This position is already occupied please try again");
		}
	}

	private static void oTurn() {
		Integer[] coords = getInput();

		if(board.placeO(coords[0], coords[1])) {
			if(board.getWinState()) {
				System.out.println("O WON");
			}else {
				xTurn();
			}

		}else {
			System.out.println("This position is already occupied please try again");
		}
	}
}
