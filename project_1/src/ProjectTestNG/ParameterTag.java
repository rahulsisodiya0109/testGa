package ProjectTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTag {

	//private String x;

	@Test
	@Parameters("str")
	public void abc(String str) {

		//this.x = str;
		System.out.println(str);

	}

}
