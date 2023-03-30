package project_1;



public class Static4_calling_nonstatic_without_object {

	// calling a non-static method without object through constructor
	
	int age;
	String name;

	Static4_calling_nonstatic_without_object() {
		non_static_meth();
		static_meth();
	}

	public static void main(String[] args) {

		Static4_calling_nonstatic_without_object t1 = new Static4_calling_nonstatic_without_object();

	}

	public void non_static_meth() {
		System.out.print("NM ");
	}

	public static void static_meth() {
		System.out.println("SM");

	}
}
