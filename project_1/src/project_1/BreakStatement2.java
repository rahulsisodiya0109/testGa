package project_1;

public class BreakStatement2 {

	public static void main(String[] args) {
		
		for(int i=1;i<4;i++) {
			
			for(int j=1;j<4;j++) {
				
				if(i==2 && j==2) {
					break;
				}
				
				System.out.println(i+" "+j);
			}
			
			System.out.println("outer loop body");
		}

	}

}
