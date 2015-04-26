package test.romannumerals;

import static org.junit.Assert.*;
import main.romannumerals.RomanNumeralsRules;
import org.junit.Test;


public class RomanNumeralRulesTest {

	RomanNumeralsRules rules = new RomanNumeralsRules();

	@Test
	public void shouldReturnTrueWhenIcanBeSubtracted() {
		assertTrue(rules.subtractionCheck('I', 'X'));
	}

	@Test
	public void shouldReturnTrueWhenXcanBeSubtracted() {
		assertTrue(rules.subtractionCheck('X', 'L'));
	}

	@Test
	public void shouldReturnTrueWhenCcanBeSubtracted() {
		assertTrue(rules.subtractionCheck('C', 'D'));
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenDcannotBeSubtracted() {
		rules.subtractionCheck('C', 'I');
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenRomanNumberDoNotMatchRules() {
		rules.subtractionCheck('D', 'I');
	}

	@Test(expected = IllegalArgumentException.class)
	public void symbolMcannotBeRepeatedMoreThanThreeTimes() {
		rules.repetationCheck('M', "MMMCM");
	}

	@Test(expected = IllegalArgumentException.class)
	public void symbolCcannotBeRepeatedMoreThanThreeTimes() {
		rules.repetationCheck('C', "CCCMC");
	}

	@Test(expected = IllegalArgumentException.class)
	public void symbolXcannotBeRepeatedMoreThanThreeTimes() {
		rules.repetationCheck('X', "XXXCX");
	}

	@Test(expected = IllegalArgumentException.class)
	public void symbolIcannotBeRepeatedMoreThanThreeTimes() {
		rules.repetationCheck('I', "IIICI");
	}
}
