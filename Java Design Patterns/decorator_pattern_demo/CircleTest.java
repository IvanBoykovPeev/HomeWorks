package decorator_pattern_demo;

import static org.junit.Assert.*;
import org.junit.Test;

public class CircleTest {

	Shape circle = new Circle();
	
	@Test
	public void test() {
		assertNotNull(circle);
	}
}
