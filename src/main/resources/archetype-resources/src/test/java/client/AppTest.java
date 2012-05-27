package ${groupId}.client;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import ${groupId}.App;

public class AppTest {

	WebDriver driver;
	String baseURL = "http://localhost:9999/";

	@Before
	public void setUp() {
		driver = new HtmlUnitDriver();
	}

	@Test
	public void test() {
		String URL;
		URL = baseURL + "${artifactId}/";

		driver.get(URL);
		assertEquals("こんにちは世界!", driver.getTitle());
	}

}

