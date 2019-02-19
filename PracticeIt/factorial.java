/* Write a method factorial that accepts an integer parameter n and that 
uses recursion to compute and return the value of n factorial (also 
known as n!). Your method should throw an IllegalArgumentException if n 
is negative. Several calls and their return values are shown below. */
public int factorial(int n) {
	if (n < 0 ) {
		throw new IllegalArgumentException();
	}
	if (n == 0) {
		return 1;
	} else {
		return n * factorial(n - 1);
	}
}