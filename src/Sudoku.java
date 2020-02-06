public class Sudoku {

	Square[] squares;
	
    public static void main(String[] args){
    	
    }
    
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
    			emptySquares--;
    		}
    	}
    	//while remaining squares:
    	while (emptySquares > 0) {
    		for (int i = 0; i < 81; i++) {
    			cur = squares[i];
    			if (cur.getPosNums().size() == 1) {
    				cur.fill();
    				updateSquares(cur.getIndex());
    			}
    		}
    	}
    	//confirm square with posNums of length 1
    	//then, update posNums of squares with shared row, column, bigSquare
    	
		return arr;
    	
    }
    
    public void updateSquares(int index) {
    	//for all unfilled squares in row, col, and bigsquare --> remove # of given index from posnums
    	
    }
}
