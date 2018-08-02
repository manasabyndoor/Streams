package com.lambda;

public class LambdaExpression {
	
	public static int checker(performOperation p, int num) {
		return p.check(num);

	}

	performOperation checkEvenOdd() {
		// lambda expression to check whether number is odd
		performOperation p = (a) -> {
			return a % 2;
		};
		return p;

	}

	performOperation checkPrime() {
		/// lambda expression to check whether number is prime
		performOperation p = (a) -> {
			if (a == 1)
				return 1;
			for (int i = 2; i < a / 2 + 1; i++) {
				if ((a % i) == 0)
					return 1;
			}
			return 0;

		};
		return p;
	}

	performOperation checkPalindrome() {
		/// lambda expression to check whether number is palindrome or not
		performOperation p = (a) -> {
			String word = "";
			boolean isPalindrome = true;
			for (int i = 0; i < (int) word.length() / 2; i++) {
				if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
					isPalindrome = false;
					break;
				}
			}
			return isPalindrome ? 0 : 1;
		};
		return p;
	}

}
