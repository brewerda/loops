public class HW3 {
	public static void main(String[] args) {
		int[] b = {1,2,3,4,5,6};
		System.out.println(b,10,3);
		System.out.println(rectangularize(b,2,2));
	}
	public static int[][] snakeDraft(int[] a, int players, int rounds) {
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				System.out.println(a[r][c] + " ");
			}
			System.out.println();
			
		}
	}
	public static int[][] rectangularize(int[] a, int rows, int cols) {
		int[][] result = new int[rows][cols];

		int counter = 0;
		for (int i=0; i<result.length; i++) {
			for (int j=0; j<result[i].length; j++) {
				result[i][j] = a[counter];
				counter++;
			}
		}
		return result;
	}
}