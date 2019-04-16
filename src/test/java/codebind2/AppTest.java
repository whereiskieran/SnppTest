package codebind2;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		passed("Life is but a test my friend");
		System.out.println("This is from the test method");

	}

	private void passed(String string) {
		System.out.println("This is from the passed method");

	}

}
