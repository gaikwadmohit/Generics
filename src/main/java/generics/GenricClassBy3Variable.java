package generics;

public class GenricClassBy3Variable {
	

	public class TestMaximum<T extends Comparable<T>> {
		private T firstNumber;
		private T secondNumber;
		private T thirdNumber;

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

		/*
		 * generic method to find maximum of 3 integers or floats or strings
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