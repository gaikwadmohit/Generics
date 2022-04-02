package generics;

public class FindMaxByRefractor1 {
	
	public class TestMaximum<T extends Comparable<T>> {
		private T firstNumber;
		private T secondNumber;
		private T thirdNumber;

		private T floatNumber1;
		private T floatNumber2;
		private T floatNumber3;
		
		private T firstWord;
		private T secondWord;
		private T thirdWord;
		
		

		public TestMaximum(T firstNumber, T secondNumber, T thirdNumber) {
			this.firstNumber = firstNumber;
			this.secondNumber = secondNumber;
			this.thirdNumber = thirdNumber;
		}

		public T getFirstNumber() {
			return firstNumber;
		}

		public void setFirstNumber(T firstNumber) {
			this.firstNumber = firstNumber;
		}

		public T getSecondNumber() {
			return secondNumber;
		}

		public void setSecondNumber(T secondNumber) {
			this.secondNumber = secondNumber;
		}

		public T getThirdNumber() {
			return thirdNumber;
		}

		public void setThirdNumber(T thirdNumber) {
			this.thirdNumber = thirdNumber;
		}

		public T getFloatNumber1() {
			return floatNumber1;
		}

		public void setFloatNumber1(T floatNumber1) {
			this.floatNumber1 = floatNumber1;
		}

		public T getFloatNumber2() {
			return floatNumber2;
		}

		public void setFloatNumber2(T floatNumber2) {
			this.floatNumber2 = floatNumber2;
		}

		public T getFloatNumber3() {
			return floatNumber3;
		}

		public void setFloatNumber3(T floatNumber3) {
			this.floatNumber3 = floatNumber3;
		}
		
		

		public T getFirstWord() {
			return firstWord;
		}

		public void setFirstWord(T firstWord) {
			this.firstWord = firstWord;
		}

		public T getSecondWord() {
			return secondWord;
		}

		public void setSecondWord(T secondWord) {
			this.secondWord = secondWord;
		}

		public T getThirdWord() {
			return thirdWord;
		}

		public void setThirdWord(T thirdWord) {
			this.thirdWord = thirdWord;
		}

		/*
		 * method to find maximum of 3 integers
		 */
		public void findMaximum(T firstNumber, T secondNumber, T thirdNumber) {
			if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0)
				System.out.println("Maximum: " + firstNumber);
			else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0)
				System.out.println("Maximum: " + secondNumber);
			else
				System.out.println("Maximum: " + thirdNumber);
		}
	}





	public static void main(String[] args) {
		System.out.println("welcome to maximum problem");
		TestMaximum testmaximum = new TestMaximum(2, 1, 3);
		testmaximum.findMaximum(2,1,3);

		TestMaximum testmaximum2 = new TestMaximum(3.8f, 1.7f, 2.8f);
		testmaximum2.findMaximum(3.8f,1.7f,2.8f);
		
		TestMaximum testmaximum3 = new TestMaximum("Apple","Peach","Banana");
		testmaximum3.findMaximum("Apple","Peach","Banana");

	}

}