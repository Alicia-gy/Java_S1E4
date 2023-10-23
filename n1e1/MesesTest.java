package n1e1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MesesTest {

	@Test
	void test12Posicions() {
		var Meses = new Meses();
		assertEquals(12, Meses.getMeses().size());
	}
	
	@Test
	void testNotNull() {
		var Meses = new Meses();
		assertNotNull(Meses.getMeses());
	}
	
	@Test
	void testAgosto() {
		var Meses = new Meses();
		assertEquals("Agosto", Meses.getMeses().get(7));
	}

}
