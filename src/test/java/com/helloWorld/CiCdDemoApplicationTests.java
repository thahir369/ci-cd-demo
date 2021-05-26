package com.helloWorld;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CiCdDemoApplicationTests {


	@Test
	void testcase1(){
		assertEquals(1,1);
	}

	@Test
	void testcase2(){
		assertEquals("hai","hai");
	}

}
