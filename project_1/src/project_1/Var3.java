package project_1;

public class Var3 {
	int a=6;
	static int b=3;

	public static void main(String[] args) {
		
		int c=8;
		Var3 v3=new Var3();
		System.out.println(v3.a);
		System.out.println(b);
		a();
		v3.b();
	}
	public static void a()
	{
		int s=12;
		System.out.println(s);
	}
	public void b()
	{
		int f=11;
		System.out.println(f);
	}
}
