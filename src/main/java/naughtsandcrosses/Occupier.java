package naughtsandcrosses;

public enum Occupier {
	EMPTY(0),
	NOUGHT(1),
	CROSS(2);

	int value;

	Occupier(int value) {
		this.value = value;
	}

	int getValue() {
		return value;
	}


}
