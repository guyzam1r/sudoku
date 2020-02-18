import java.util.ArrayList;

public class Box {
	int value, index, rowNum, colNum, boxNum;
	ArrayList<Integer> posNums = new ArrayList<Integer>();
	int boxSize = 9;

	public Box(int value, int index) {
		this.value = value;
		this.index = index;
		rowNum = index / boxSize;
		colNum = index % boxSize;
		// boxNum = bsn;
	}

	public Box(int index) {
		this.index = index;
		rowNum = index / boxSize;
		colNum = index % boxSize;
		// boxNum = bsn;
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

	public int getBoxNum() {
		return boxNum;
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
