package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {
	
	private Greeting greeting;
	
	@BeforeAll
	private static void beforeAll() {
		System.out.println("before all");
	}
	
	@AfterAll
	private static void afterAll() {
		System.out.println("after all");
	}
	
	@BeforeEach
	void setUp() {
		System.out.println("before each");
		greeting = new Greeting();
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("after each");
	}
	
	@Test
	void helloWorld() {
		System.out.println(greeting.helloWorld());
	}
	
	@Test
	void helloWorld1() {
		System.out.println(greeting.helloWorld("Username"));
	}
}