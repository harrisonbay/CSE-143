/* Write a recursive method called writeNumbers that takes an integer n 
as a parameter and that writes the first n numbers separated by commas 
with the odd numbers in descending order followed by the even numbers in 
ascending order. For example, the call: 


    writeNumbers(5);
	
should produce the following output:

    5, 3, 1, 2, 4
	
The odd numbers (5, 3, and 1) appear first in descending order followed 
by the even numbers (2 and 4) in ascending order. Notice that commas are 
used to separate consecutive values in the list. Your method should send 
its output to System.out and should not call println. For example, the 
following calls: 



    writeNumbers(5);
    System.out.println();  // to complete the line of output
    writeNumbers(1);
    System.out.println();  // to complete the line of output
    writeNumbers(8);
    System.out.println();  // to complete the line of output
	
should produce exactly three lines of output:

    5, 3, 1, 2, 4
    1
    7, 5, 3, 1, 2, 4, 6, 8
	
You must exactly reproduce the format of these examples. Your method 
should throw an IllegalArgumentException if passed a value less than 1. 
You are not allowed to construct any structured objects (no array, 
ArrayList, String, StringBuilder, etc) and you may not use a while loop, 
for loop, or do/while loop to solve this problem; you must use 
recursion. */ 

// This one took much longer than I wanted it to take (I spent 15 mins on this)
public void writeNumbers(int n) {
	if (n < 1) {
		throw new IllegalArgumentException();
	}
	if (n == 1) {
		System.out.print(n);
	} else if (n % 2 == 1) {
		System.out.print(n + ", ");
		writeNumbers(n - 2);
		System.out.print(", " + (n - 1));
	} else {
		writeNumbers(n - 1);
		System.out.print(", " + n);
	}
}