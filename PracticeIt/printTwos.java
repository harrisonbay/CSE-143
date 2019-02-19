/* Write a method printTwos that accepts an integer parameter n and that 
prints an expression composed of a single odd number multiplied by twos 
that is equal to n. The twos should surround the odd number with an 
equal number of twos on either side if possible. Several calls and their 
output are shown below. 

If the expression has an odd number of twos, then the "extra" two should 
appear at the front of the expression, as shown in the output from 
passing 96 and 32. If the number is odd to begin with, it should simply 
be printed. It is possible that the odd number to print will be 1, as 
shown in the output from passing 32, 1, and 2 above. 

Your method should throw an IllegalArgumentException if passed a value 
less than 1. Note that the output does not advance to the next line. */
public void printTwos(int n) {
	if (n < 1) {
		throw new IllegalArgumentException();
	}
	if (n % 2 == 1) {
		System.out.print(n);
	} else {
		System.out.print("2 * ");
		if (n % 4 == 0) {
			printTwos(n / 4);
			System.out.print(" * 2");
		} else {
			printTwos(n / 2);
		}
	}
}
	