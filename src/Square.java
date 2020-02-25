import java.util.ArrayList;

public class Square {
	
	int value;
	int index;
	ArrayList<Integer> posNums = new ArrayList<Integer>();
	int rowNum;
	int colNum;
	int bSquareNum;
	
	public Square(int value, int index){
		this.value = value;
		this.index = index;
		rowNum = index / 9;
		colNum = index % 9;
		//bSquareNum = bsn;
	}
	
	public Square(int index) {
		this.index = index;
		rowNum = index / 9;
		colNum = index % 9;
		//bSquareNum = bsn;
		for (int i = 1; i <= 9; i++) {
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
