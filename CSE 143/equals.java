/* Write a method called equals that takes as parameters two stacks containing 
lists of integers and that returns true if the two stacks are equal and that 
returns false otherwise. Two stacks are considered equal if they store the same 
number of values and those values appear in the same order. Your method is to 
examine the two stacks but must return them to their original state before 
terminating. 

For example, if the following stack variables are defined: 

        s1           bottom [3, 18, 9, 42] top
        s2           bottom [3, 18, 9, 42] top
        s3           bottom [3, 18, 9, 42, 17] top
        s4           bottom [42, 9, 18, 3] top
		
then the call equals(s1, s2) would return true and the calls equals(s1, s3), 
equals(s1, s4), equals(s2, s3), and equals(s3, s4) would return false. Two empty 
stacks would be considered equal to each other. 

You are to use one stack as auxiliary storage to solve this problem. You may not 
use any other auxiliary data structures to solve this problem, although you can 
have as many simple variables as you like. You may not use recursion to solve 
this problem. Your method should be efficient by returning false immediately if 
the two stacks are not of the same size and by not examining more values from 
the two stacks once it has found a difference. Use the Stack interface and 
ArrayStack implementation described in the cheat sheet. */ 

public boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
	Stack<Integer> temp = new Stack<Integer>();
	if (s1.size() != s2.size()) {
		return false;
	}
	while (!s1.isEmpty()) {
		if (s1.peek() != s2.peek()) {
			while(!temp.isEmpty()) {
				s1.push(temp.pop());
				s2.push(s1.peek());
			}
			return false;
		}
		temp.push(s1.pop());
		s2.pop();
	}
	while (!temp.isEmpty()) {
		s1.push(temp.pop());
		s2.push(s1.peek());
	}
	return true;
}
	
