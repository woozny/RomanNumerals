package test.romannumerals;

import main.romannumerals.RomanNumeralsConverter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumeralsConverterTest {

	RomanNumeralsConverter converter = new RomanNumeralsConverter();


	@Test
	public void shouldReturnValueForI() {
		assertEquals(1, converter.convert("I"));
	}

	@Test
	public void shouldReturnValueForVI() {
		assertEquals(6, converter.convert("VI"));
	}

	@Test
	public void shouldReturnValueForIV() {
		assertEquals(4, converter.convert("IV"));
	}

	@Test
	public void shouldReturnValueForMMVI() {
		assertEquals(2006, converter.convert("MMVI"));
	}

	@Test
	public void shouldReturnValueForMMIV() {
		assertEquals(2004, converter.convert("MMIV"));
	}

	@Test
	public void shouldReturnValueForCMLIV() {
		assertEquals(954, converter.convert("CMLIV"));
	}

	@Test
	public void shouldReturnValueForMCMXLIV() {
		assertEquals(1944, converter.convert("MCMXLIV"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldReturnValueForIC() {
		assertEquals(99, converter.convert("IC"));
	}
}
