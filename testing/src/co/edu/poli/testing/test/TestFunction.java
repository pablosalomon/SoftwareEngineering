package co.edu.poli.testing.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import co.edu.poli.testing.model.Function;

class TestFunction {

	Function f;
	
	@BeforeEach
	void setUp() throws Exception {
		f = new Function();
	}

	@Test
	void test1() {
		int n = 8;
		assertEquals(120, f.facto(n));
	}

	@Test
	void test2() {
		int n = 6;
		assertEquals(720, f.facto(n));
	}
	
	@Test
	void test3() {
	    Throwable exception = assertThrows(AssertionError.class, () -> f.facto(-5));
	    assertEquals("No cumple precondicion", exception.getMessage());
	}
}
