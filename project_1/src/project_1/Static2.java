package project_1;

public class Static2 {
	// ststic 2 and static 3 are linked	 
	int roll;
	String name;
	static String college ="abc";
	
	//constructor class 
	Static2(int a,String b)
	{
		roll=a;
		name=b;
	}
	public void getresult()
	{
		System.out.println(roll+" "+name+" "+college);
		
	}
}
