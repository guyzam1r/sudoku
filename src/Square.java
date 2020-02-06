import java.util.ArrayList;

public class Square {
	
	int value;
	ArrayList<Integer> posNums;
	int rowNum;
	int colNum;
	int bSquareNum;
	
	public Square(int val, int index){
		value = val;
		rowNum = index / 9;
		colNum = index % 9;
		//bSquareNum = bsn;
	}
	
	public Square(int index) {
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
	
	public int getRow() {
		return rowNum;
	}
	
	public int getCol() {
		return colNum;
	}
	
	public int getBigSquare() {
		return bSquareNum;
	}
}