/* Write a method writeSquares that accepts an integer parameter n and 
prints the first n squares separated by commas, with the odd squares in 
descending order followed by the even squares in ascending order. The 
following table shows several calls to the method and their expected 
output: 

Your method should throw an IllegalArgumentException if passed a value 
less than 1. Note that the output does not advance onto the next line. */
public void writeSquares(int n) {
	if (n < 1) {
		throw new IllegalArgumentException();
	}
	if (n == 1) {
		System.out.print(1);
	} else if (n % 2 == 1) {
		System.out.print(n * n + ", ");
		writeSquares(n - 2);
		System.out.print(", " + (n - 1) * (n - 1));
	} else {
		writeSquares(n - 1);
		System.out.print(", " + n * n);
	}
}