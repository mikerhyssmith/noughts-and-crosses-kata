package naughtsandcrosses;

import org.junit.Test;


public class CellTest {


	@Test
	public void givenCell_whenIAddACross_CellIsOccupied() {
		Cell cell = new Cell();

		cell.putX();

		assert(cell.isOccupied());
	}

	@Test
	public void givenCell_whenIAddANought_CellIsOccupied(){
		Cell cell = new Cell();

		cell.putO();

		assert(cell.isOccupied());

	}

	@Test
	public void givenCell_whenNothingIsAddedToIt_CellIsNotOccupied(){
		Cell cell = new Cell();

		assert(!cell.isOccupied());
	}

	@Test
	public void givenCell_whenIAddACross_CellIsOccupiedWithACross() {
		Cell cell = new Cell();

		cell.putX();

		assert(cell.getOccupier()).equals(Occupier.CROSS);

	}

	@Test
	public void givenCell_whenIAddANought_CellIsOccupiedWithANought() {
		Cell cell = new Cell();

		cell.putO();

		assert(cell.getOccupier()).equals(Occupier.NOUGHT);
	}

}