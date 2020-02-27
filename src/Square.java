import java.util.ArrayList;

public class Square {
	int value, index, rowNum, colNum, bSquareNum;
	int boxSize = 9;
	ArrayList<Integer> posNums = new ArrayList<Integer>();

	public Square(int value, int index) {
		this.value = value;
		this.index = index;
		rowNum = index / boxSize;
		colNum = index % boxSize;
		// bSquareNum = bsn;
	}

	public Square(int index) {
		this.index = index;
		rowNum = index / boxSize;
		colNum = index % boxSize;
		// bSquareNum = bsn;
		for (int i = 1; i <= boxSize; i++) {
			posNums.add(i);
		}
	}

	public void setValue(int val) {
		value = val;
	}

	public int getValue() {
		return value;
	}

	public int getIndex() {
		return index;
	}

	public int getRow() {
		return rowNum;
	}

	public int getCol() {
		return colNum;
	}

	public int getBigSquare() {
		return bSquareNum;
	}

	public ArrayList<Integer> getPosNums() {
		return posNums;
	}

	public boolean isFilled() {
		return posNums.size() == 0;
	}

	public void fill() {
		value = posNums.get(0);
		posNums.clear();
	}
}
