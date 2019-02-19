/* Write a method countToBy that accepts integer parameters n and m and 
that produces output indicating how to count to n in increments of m 
separated by commas. For example, to count to 10 by 1 you'd say 
countToBy(10, 1); 

Notice that the increment does not have to be 1, such as when counting 
to 25 by 4s. The count must always end at n, but notice that at will not 
always be possible to start counting at 1, as shown in the output when n 
is 30 and m is 4. But the first number should always be in the range of 
1 to m inclusive. It is possible that only one number will be printed, 
as shown in the output when n is 3 and m is 6. 

Your method should throw an IllegalArgumentException if either m or n is 
less than 1. Note that the output does not advance to the next line. */
public void countToBy(int n, int m) {
	if (n < 1 || m < 1) {
		throw new IllegalArgumentException();
	}
	if (n <= m) {
		System.out.print(n);
	} else {
		countToBy(n - m, m);
		System.out.print(", " + n);
	}
}