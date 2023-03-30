package project_1;

public class MDArray {

	public static void main(String[] args) {
		/*
		 * int a[][] = { { 1, 2, 3, 4 }, { 4, 5, 6, 3 }, { 7, 8, 9, 4 } };
		 * 
		 * int row = a.length;
		 * 
		 * System.out.println("row-" + row); int column = a[0].length;
		 * System.out.println("column-" + column); for (int i = 0; i < row; i++) { for
		 * (int j = 0; j < column; j++) { System.out.print(a[i][j] + " "); }
		 * System.out.println(" "); }
		 */

		Object y[][] = {{1,2,3},{'a','b','c'},{2.5, "pen",4}};
		
		objectMatrix(y);
	}
	
	// matrix for object class
	public static void objectMatrix(Object x[][]) {
		
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[0].length;j++) {
				System.out.print(x[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}
