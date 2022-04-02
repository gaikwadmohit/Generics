package generics;

public class Extend3Parameters {
	package com.maximum;

	public class TestMaximum<T extends Comparable<T>> {
		private T firstNumber;
		private T secondNumber;
		private T thirdNumber;
		private T fourthNumber;
		private T fifthNumber;

		public TestMaximum(T firstNumber, T secondNumber, T thirdNumber) {
			this.firstNumber = firstNumber;
			this.secondNumber = secondNumber;
			this.thirdNumber = thirdNumber;
		}
		
		public TestMaximum(T firstNumber, T secondNumber, T thirdNumber,T fourthNumber) {
			this.firstNumber = firstNumber;
			this.secondNumber = secondNumber;
			this.thirdNumber = thirdNumber;
			this.fourthNumber = fourthNumber;
		}
	    
		public TestMaximum(T firstNumber, T secondNumber, T thirdNumber,T fourthNumber,T fifthNumber) {
			this.firstNumber = firstNumber;
			this.secondNumber = secondNumber;
			this.thirdNumber = thirdNumber;
			this.fourthNumber = fourthNumber;
			this.fifthNumber = fifthNumber;
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
		

		public T getFourthNumber() {
			return fourthNumber;
		}

		public void setFourthNumber(T fourthNumber) {
			this.fourthNumber = fourthNumber;
		}
		
		

		public T getFifthNumber() {
			return fifthNumber;
		}

		public void setFifthNumber(T fifthNumber) {
			this.fifthNumber = fifthNumber;
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
		
		/*
		 * generic method to find maximum of 4 integers or floats or strings
		 */
		public void findMaximum(T firstNumber, T secondNumber, T thirdNumber,T fourthNumber) {
			if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0
					&& firstNumber.compareTo(fourthNumber) > 0)
				System.out.println("Maximum: " + firstNumber);
			else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0 &&
					secondNumber.compareTo(fourthNumber) > 0)
				System.out.println("Maximum: " + secondNumber);
			else if(thirdNumber.compareTo(firstNumber) > 0 && thirdNumber.compareTo(secondNumber) > 0 && 
					thirdNumber.compareTo(fourthNumber) > 0)
				System.out.println("Maximum: "+thirdNumber);
			else
				System.out.println("Maximum: " + fourthNumber);
		}
		
		/*
		 * generic method to find maximum of 5 integers or floats or strings
		 */
		public void findMaximum(T firstNumber, T secondNumber, T thirdNumber,T fourthNumber, T fifthNumber) {
			if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0
					&& firstNumber.compareTo(fourthNumber) > 0 && firstNumber.compareTo(fifthNumber)> 0)
				System.out.println("Maximum: " + firstNumber);
			else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0 &&
					secondNumber.compareTo(fourthNumber) > 0 && secondNumber.compareTo(fifthNumber) > 0)
				System.out.println("Maximum: " + secondNumber);
			else if(thirdNumber.compareTo(firstNumber) >0 && thirdNumber.compareTo(secondNumber)>0 && 
					thirdNumber.compareTo(fourthNumber)>0 && thirdNumber.compareTo(fifthNumber) >0)
				System.out.println("Maximum: "+thirdNumber);
			else if(fourthNumber.compareTo(firstNumber) > 0 && fourthNumber.compareTo(secondNumber) >0 &&
					fourthNumber.compareTo(thirdNumber) >0 && fourthNumber.compareTo(fifthNumber) >0)
				System.out.println("Maximum: "+fourthNumber);
			else
				System.out.println("Maximum: " + fifthNumber);
		}
	}
	package com.maximum;

	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			System.out.println("welcome to maximum problem");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter no of paramaters range 3-5");
			int option = scanner.nextInt();
			switch (option) {
			case 3:
				TestMaximum testmaximum = new TestMaximum(2, 1, 3);
				testmaximum.findMaximum(2, 1, 3);

				TestMaximum testmaximum2 = new TestMaximum(3.8f, 1.7f, 2.8f);
				testmaximum2.findMaximum(3.8f, 1.7f, 2.8f);

				TestMaximum testmaximum3 = new TestMaximum("Apple", "Peach", "Banana");
				testmaximum3.findMaximum("Apple", "Peach", "Banana");
				break;

			case 4:
				TestMaximum testmaximum4 = new TestMaximum(2, 1, 3,4);
				testmaximum4.findMaximum(2, 1, 3, 4);

				TestMaximum testmaximum5 = new TestMaximum(3.8f, 1.7f, 2.8f,5.6f);
				testmaximum5.findMaximum(3.8f, 1.7f, 2.8f,5.6f);

				TestMaximum testmaximum6 = new TestMaximum("Apple", "Peach", "Banana","orange");
				testmaximum6.findMaximum("Apple", "Peach", "Banana","orange");
				break;
				
			case 5:
				TestMaximum testmaximum7 = new TestMaximum(2, 1, 3,4,9);
				testmaximum7.findMaximum(2, 1, 3, 4,9);

				TestMaximum testmaximum8 = new TestMaximum(3.8f, 1.7f, 2.8f,5.6f,9.0f);
				testmaximum8.findMaximum(3.8f, 1.7f, 2.8f,5.6f,9.0f);

				TestMaximum testmaximum9 = new TestMaximum("Apple", "Peach", "Banana","orange","pineapple");
				testmaximum9.findMaximum("Apple", "Peach", "Banana","orange","pineapple");
				break;
				
				

			}

		}

	}
}
