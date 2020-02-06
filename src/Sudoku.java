public class Sudoku {

	public static void main(String[] args){

	}

	public Sudoku(int[][] arr) {

	}

	public Sudoku[][] Solve(Sudoku[][] arr){

		return arr;

	}

	public int[] returnRow(int[][] arr, int x) {
		int[] y = new int[9];

		for (int i = 0; i < 9; i++) {
			y[i] = arr[x][i];
		}
		return y;
	}

	public int[] returnCol(int[][] arr, int x) {
		int[] y = new int[9];

		for (int i = 0; i < 9; i++) {
			y[i] = arr[i][x];
		}
		return y;
	}
}
