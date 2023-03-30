package project_1;

public class Operator {

	public static void main(String[] args) {
		
		//unary
		
		int i=3;
			
		  System.out.println(i ++); 
		  System.out.println(++ i); 
		  System.out.println(++i);
		 
		
		//arithmatic
		
		System.out.println(4 + 6 * 2 / 3);
		
		//logical operator
		int a=3,b=6,c=8;
		System.out.println(a<b && b>c );
		System.out.println(a>b && b<c );
		System.out.println(a<b && b<c );
		System.out.println(a>b && b++ <c );
		System.out.println(b);		// b value wont increase since control exit from 1st(false) condition only
		
		//bitwise operator
		
		System.out.println(a<b & b>c );
		System.out.println(a>b & b<c );
		System.out.println(a<b & b<c );
		
		System.out.println(a>b & b++ <c );
		System.out.println(b);		// b value will increase since control wont exit and check both whether 1st false
		
		//assignment operator
		
		System.out.println(a +=3); // will print 6
		System.out.println(a*=2);
		
		
		//relational
		
		if(a<b)
		{
			System.out.println("condition is false");
		}
		else
		{
			System.out.println("true");
		}
		
		
	//conditional
		
		int x = 10, y=15;
		
		if(x>y) {
			System.out.println("x is greater");
		}else if(x<y){
			System.out.println("x is lesser");
		}else if(x==y) {
			System.out.println("both are equal");
		}
	}

}
