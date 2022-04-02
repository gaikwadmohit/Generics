package generics;

public class FindMaxUC1 {
	

	
		private int firstNumber;
		private int secondNumber;
		private int thirdNumber;

		public void TestMaximum(int firstNumber, int secondNumber, int thirdNumber) {
			this.firstNumber = firstNumber;
			this.secondNumber = secondNumber;
			this.thirdNumber = thirdNumber;
		}

		public int getFirstNumber() {
			return firstNumber;
		}

		public void setFirstNumber(int firstNumber) {
			this.firstNumber = firstNumber;
		}

		public int getSecondNumber() {
			return secondNumber;
		}

		public void setSecondNumber(int secondNumber) {
			this.secondNumber = secondNumber;
		}

		public int getThirdNumber() {
			return thirdNumber;
		}

		public void setThirdNumber(int thirdNumber) {
			this.thirdNumber = thirdNumber;
		}

		public void findMaximum() {
				if(firstNumber>secondNumber && firstNumber > thirdNumber)
					System.out.println("Maximum: "+firstNumber);
				else if(secondNumber>firstNumber && secondNumber > thirdNumber)
					System.out.println("Maximum: "+secondNumber);
				else
					System.out.println("Maximum: "+thirdNumber);
		}

	}

