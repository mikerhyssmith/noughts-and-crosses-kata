package naughtsandcrosses;

public class Cell {

	private Occupier occupier;

	public Cell() {
		occupier = Occupier.EMPTY;
	}

	public void putX() {
		occupier =  Occupier.CROSS;
	}

	public void putO() {
		occupier = Occupier.NOUGHT;
	}

	public boolean isOccupied() {
		return occupier != Occupier.EMPTY;
	}

	public Occupier getOccupier() {
		return occupier;
	}

}
