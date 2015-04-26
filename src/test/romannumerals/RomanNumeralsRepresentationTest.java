package test.romannumerals;

import main.romannumerals.RomanNumeralsRepresentation;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumeralsRepresentationTest {

	private final static char SYMBOL_I = 'I';
	private final static char SYMBOL_V = 'V';
	private final static char SYMBOL_X = 'X';
	private final static char SYMBOL_L = 'L';
	private final static char SYMBOL_C = 'C';
	private final static char SYMBOL_D = 'D';
	private final static char SYMBOL_M = 'M';

	RomanNumeralsRepresentation romanNumeralsRepresentation = new RomanNumeralsRepresentation();

	@Test
	public void shouldReturnValueOne() {
		assertEquals(1, romanNumeralsRepresentation.getNumericValue(SYMBOL_I));
	}

	@Test
	public void shouldReturnValueFive() {
		assertEquals(5, romanNumeralsRepresentation.getNumericValue(SYMBOL_V));
	}

	@Test
	public void shouldReturnValueTen() {
		assertEquals(10, romanNumeralsRepresentation.getNumericValue(SYMBOL_X));
	}

	@Test
	public void shouldReturnValueFifty() {
		assertEquals(50, romanNumeralsRepresentation.getNumericValue(SYMBOL_L));
	}

	@Test
	public void shouldReturnValueHundred() {
		assertEquals(100, romanNumeralsRepresentation.getNumericValue(SYMBOL_C));
	}

	@Test
	public void shouldReturnValueFiveHundred() {
		assertEquals(500, romanNumeralsRepresentation.getNumericValue(SYMBOL_D));
	}

	@Test
	public void shouldReturnValueThousand() {
		assertEquals(1000, romanNumeralsRepresentation.getNumericValue(SYMBOL_M));
	}

}
