package n1e2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculoDniTest {
	

	@ParameterizedTest
	@ValueSource(ints = {12345678, 47548903, 23560984, 23549642, 78125690, 87654321, 78901234, 99998765, 67391427, 58914324})
	void testCalculoDni(int num) {
		var dniList = new CalculoDni(num);
		
		char[] dniArray = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		String expectedResult = ("" + num + dniArray[num % 23]);
		
		assertEquals(expectedResult, dniList.getDni());


	}
	


}
