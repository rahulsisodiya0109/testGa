package project_1;

public class Array2 {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		 a[0]= 2;
		 
		//System.out.println(b[1]);
		for(int i=0;i<a.length;i++)
		{	
		System.out.println(a[i]);

		}
		
		
		Object b[]= {1,"two",5.5,"pen",0};
		
		for(int j=0;j<a.length;j++) {
			System.out.println(b[j]);
		}
		
		
		a[0]=5555;
		System.out.println(a[0]);  // modifying array through index
	}

}
