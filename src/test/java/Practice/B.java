package Practice;

import org.testng.annotations.Test;

public class B {
	@Test
	public B d() {
		System.out.println("Execute method d");
		return new B();
	}

}
