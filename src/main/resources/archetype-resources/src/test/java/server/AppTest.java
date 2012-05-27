package ${groupId}.server;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import ${groupId}.App;

public class AppTest {

	@Test
	public void test() {
		App a = new App();
		assertEquals("こんにちは世界!", a.getMessage());
	}

}

