package main.romannumerals;

import java.util.HashMap;

public class RomanNumeralsRepresentation {

	private static final HashMap<Character, Integer> ROMAN_NUMERALS_VALUE_REPRESENTATION = new HashMap<Character, Integer>(){{
		put('I', 1);
		put('V', 5);
		put('X', 10);
		put('L', 50);
		put('C', 100);
		put('D', 500);
		put('M', 1000);
	}};


	public int getNumericValue(char symbol) {
		int numericRepresentation = ROMAN_NUMERALS_VALUE_REPRESENTATION.get(symbol);
		return numericRepresentation;
	}
}
