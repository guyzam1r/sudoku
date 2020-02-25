import java.util.Arrays;

public class Sudoku {

	Square[] squares;
    
    public Sudoku(int[] arr) {
    	squares = new Square[81];
    	for (int i = 0; i < 81; i++) {
    		if (arr[i] == 0) {
    			squares[i] = new Square(i);
    		} else {
    			squares[i] = new Square(arr[i], i);
    		}
    	}
    }
    
    public int[] Solve() {
    	int[] arr = new int[81];
    	int emptySquares = 81;
    	//initialize posNums
    	Square cur;
    	for (int i = 0; i < 81; i++) {
    		cur = squares[i];
    		if (cur.isFilled()) {
    			arr[i] = cur.getValue();
    			updateSquares(i);
    			emptySquares--;
    		}
    	}
    	//while remaining squares:
    	int pes = emptySquares;
    	while (emptySquares > 0) {
    		
    		for (int i = 0; i < 81; i++) {
    			cur = squares[i];
    			if (!cur.isFilled() && cur.getPosNums().size() == 1) {
    				cur.fill();
    				arr[i] = cur.getValue();
    				updateSquares(i);
    				emptySquares--;
    			}
    		}
    		
    	}
		return arr;
    	
    }
    
    public void updateSquares(int index) {
    	//for all unfilled squares in row, col, and bigsquare --> remove # of given index from posnums
    	//row
    	for (int i = index/9*9; i < index/9*9+9; i++) {
    		if (!squares[i].isFilled()) {
    			squares[i].getPosNums().remove(Integer.valueOf(squares[index].getValue()));
    		}
    	}
    	//col
    	for (int i = index % 9; i < 81; i += 9) {
    		if (!squares[i].isFilled()) {
    			squares[i].getPosNums().remove(Integer.valueOf(squares[index].getValue()));
    		}
    	}
    	//bsquare
    	int start = index - (((index / 9) % 3) * 9) - (index % 3);
    	int[] nums = {start, start + 1, start + 2, start + 9, start + 10, start + 11, start + 18, start + 19, start + 20};
    	for (int i : nums) {
    		if (!squares[i].isFilled()) {
    			squares[i].getPosNums().remove(Integer.valueOf(squares[index].getValue()));
    		}
    	}
    }
}
