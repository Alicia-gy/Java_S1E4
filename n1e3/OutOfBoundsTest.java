package n1e3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OutOfBoundsTest {

	@Test
	void testOutOfBounds() {
		var prueba = new OutOfBounds();
		prueba.addInt(1);
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> prueba.getInt(5));
	}

}
