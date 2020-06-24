package com.redfern.cat_project;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class week3cattest {
	
	private static Cat felix;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	felix = new Cat("felix","male",6);
	
	}

	@Test
	//<method under test>_<givenparameters_<
	void cat_GivenThreeparametrs_shouldconstructcat() {
		assertTrue(felix instanceof Cat);
		assertEquals("felix",felix.getname());
		assertEquals("male",felix.getGender());
		assertEquals(6,felix.getAge());
	}

	
}
