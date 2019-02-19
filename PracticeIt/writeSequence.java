/* Write a method writeSequence that accepts an integer n as a parameter 
and prints a symmetric sequence of n numbers with descending integers 
ending in 1 followed by ascending integers beginning with 1, as in the 
table below: 

Notice that for odd numbers the sequence has a single 1 in the middle 
while for even values it has two 1s in the middle. 

Your method should throw an IllegalArgumentException if passed a value 
less than 1. A client using this method would have to call println to 
complete the line of output. */
public void writeSequence(int n) {
	if (n < 1) {
		throw new IllegalArgumentException();
	}
	if (n == 1) {
		System.out.print(1);
	} else if (n == 2) {
		System.out.print("1 1");
	} else {
		int temp = n;
		if (n % 2 == 1) {
			temp++;
		}
		System.out.print(temp / 2 + " ");
		writeSequence(n - 2);
		System.out.print(" " + temp / 2);
	}
}