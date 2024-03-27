public class ArithmeticSeriesCalculator {
	
	public static void main(String[] args){
		int n = 5;
		long expected = (n * (n + 1)) / 2;
		long result = calculateArithmeticSeries(n);

		System.out.println("Expected result: " + expected);
		System.out.println("Arithmetic Series up to n = " + n + ": " + result);

		if (result == expected){
			System.out.println("Calculation is correct!");
		} else {
			System.out.println("Calculation is incorrect.");
		}
	}

	public static int calculateArithmeticSeries(int n){
		if (n <= 0){ // base case
			return 0;
		} else {
			return n + calculateArithmeticSeries(n - 1);
		}
	}
}