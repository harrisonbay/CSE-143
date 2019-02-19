/* Write a method evens that accepts an integer parameter n and that 
returns the integer formed by removing the odd digits from n. 

If a negative number with even digits other than 0 is passed to the 
method, the result should also be negative, as shown above when -34512 
is passed. Leading zeros in the result should be ignored and if there 
are no even digits other than 0 in the number, the method should return 
0, as shown in the last three outputs. */
public int evens(int n) {
	if (n == 0) {
		return 0;
	}
	if (n < 0) {
		return -1 * evens(-n);
	}
	int digit = n % 10;
	if (digit % 2 == 1) {
		return evens(n / 10);
	} else {
		return 10 * evens(n / 10) + digit;
	}
}