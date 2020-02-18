public class Sudoku {
	Box[] Boxs;
	int totalCells = 81;

	public static void main(String[] args) {

	}

	public Sudoku(int[] arr) {
		Boxs = new Box[totalCells];
		for (int i = 0; i < totalCells; i++) {
			if (arr[i] == 0) {
				Boxs[i] = new Box(i);
			} else {
				Boxs[i] = new Box(arr[i], i);
			}
		}
	}

	public int[] Solve() {
		int[] arr = new int[totalCells];
		int emptyBoxs = totalCells;
		// initialize posNums
		Box cur;
		for (int i = 0; i < totalCells; i++) {
			cur = Boxs[i];
			if (cur.isFilled()) {
				emptyBoxs--;
			}
		}
		// while remaining Boxs:
		while (emptyBoxs > 0) {
			for (int i = 0; i < totalCells; i++) {
				cur = Boxs[i];
				if (cur.getPosNums().size() == 1) {
					cur.fill();
					updateBoxs(cur.getIndex());
				}
			}
		}
		// confirm Box with posNums of length 1
		// then, update posNums of Boxs with shared row, column, bigBox

		return arr;

	}

	public void updateBoxs(int index) {
		// for all unfilled Boxs in row, col, and bigBox --> remove # of given
		// index from posnums

	}
}
