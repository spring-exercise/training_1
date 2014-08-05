package ex.spring.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class IndexControllerTest {

	@Test
	public void testIndex() {
		IndexController i = new IndexController();
		assertEquals(i.index(), "index");
	}

}
