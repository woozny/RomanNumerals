package main.romannumerals;

public class RomanNumeralsConverter {
	RomanNumeralsRepresentation romanNumeralsRepresentation = new RomanNumeralsRepresentation();
	RomanNumeralsRules rules = new RomanNumeralsRules();

	public int convert(String symbol) {
		int numericValue = 0;
		char[] characters = symbol.toCharArray();

		for (int n = 0; n < characters.length; n++) {
			char currentSymbol = characters[n];
			int currentValue = romanNumeralsRepresentation.getNumericValue(currentSymbol);
			int nextValue = 0;

			rules.repetationCheck(currentSymbol, symbol);
			if (n + 1 < characters.length) {
				char nextSymbol = characters[n + 1];
				nextValue = romanNumeralsRepresentation.getNumericValue(nextSymbol);

				if (currentValue < nextValue) {
					rules.subtractionCheck(currentSymbol, nextSymbol);
					numericValue += nextValue - currentValue - nextValue;
					continue;
				}
			}

			numericValue += currentValue;
		}
		return numericValue;
	}
}
