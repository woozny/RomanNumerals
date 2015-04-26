package main.romannumerals;

public class RomanNumeralsRules {

	private static final Character[] SUBTRACTION_RULE_FOR_I = {'V', 'X'};
	private static final Character[] SUBTRACTION_RULE_FOR_X = {'L', 'C'};
	private static final Character[] SUBTRACTION_RULE_FOR_C = {'D', 'M'};
	private static final Character[] SUBTRACTION_RULE_FOR_D = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};


	public boolean subtractionCheck(char currentSymbol, char nextSymbol) {
		if (currentSymbol == 'I') {
			for (char i : SUBTRACTION_RULE_FOR_I) {
				if (nextSymbol == i) {
					return true;
				}
			}
		}

		if (currentSymbol == 'X') {
			for (char i : SUBTRACTION_RULE_FOR_X) {
				if (nextSymbol == i) {
					return true;
				}
			}
		}

		if (currentSymbol == 'C') {
			for (char i : SUBTRACTION_RULE_FOR_C) {
				if (nextSymbol == i) {
					return true;
				}
			}
		}

		if (currentSymbol == 'D') {
			for (char i : SUBTRACTION_RULE_FOR_D) {
				if ((nextSymbol == i)) {
					throw new IllegalArgumentException("Wrong roman number!");
				} else {
					return true;
				}
			}
		}
		throw new IllegalArgumentException("Wrong roman number!");
	}

	public void repetationCheck(char currentSymbol, String fullRomanNumber) {
		if (currentSymbol == 'M' || currentSymbol == 'C' || currentSymbol == 'X' || currentSymbol == 'I') {
			int counter = 0;
			for (char c : fullRomanNumber.toCharArray()) {
				if (c == currentSymbol) {
					counter++;
				}
			}
			if (counter > 3) {
				throw new IllegalArgumentException("M exists more than three times!");
			}
		}

		if (currentSymbol == 'D' || currentSymbol == 'L' || currentSymbol == 'V') {
			int counter = 0;
			for (char c : fullRomanNumber.toCharArray()) {
				if (c == currentSymbol) {
					counter++;
				}
			}
			if (counter > 1) {
				throw new IllegalArgumentException("M exists more than three times!");
			}
		}

	}
}
