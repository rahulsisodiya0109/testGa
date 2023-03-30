package project_1;

public class Pallindrom {

	public static void main(String[] args) {
		
		int num=454,d;
		int rev=0;
		int temp=num;
		while(num>0)
		{
			 d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println(temp+" is pallindrom");
		}
		else
		{
			System.out.println(temp+" not pallindrom");
		}
	}

}
