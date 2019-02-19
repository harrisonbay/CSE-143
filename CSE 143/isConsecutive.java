/* Write a method called isConsecutive that takes a stack of integers as 
a parameter and that returns whether or not the stack contains a 
sequence of consecutive integers starting from the bottom of the stack 
(returning true if it does, returning false if it does not). 

Consecutive integers are integers that come one after the other, as in 
5, 6, 7, 8, 9, etc. So if a stack s stores the following values: 

        bottom [3, 4, 5, 6, 7, 8, 9, 10] top
		
then the call:
       isConsecutive(s)
	   
should return true. If the stack had instead contained this sequence:

        bottom [3, 4, 5, 6, 7, 8, 9, 10, 12] top
		
then the call should return false because the numbers 10 and 12 are not 
consecutive. Notice that we look at the numbers starting at the bottom 
of the stack. The following sequence of values would be consecutive 
except for the fact that it appears in reverse order, so the method 
would return false: 

        bottom [3, 2, 1] top
		
Your method must restore the stack so that it stores the same sequence 
of values after the call as it did before. Any stack with fewer than two 
values should be considered to be a list of consecutive integers. 

You are to use one queue as auxiliary storage to solve this problem. You 
may not use any other auxiliary data structures to solve this problem, 
although you can have as many simple variables as you like. You also may 
not solve the problem recursively. Your solution must run in O(n) time 
where n is the size of the stack. Use the Stack and Queue structures 
described in the cheat sheet and obey the restrictions described there. 
*/ 

public boolean isConsecutive(Stack<Integer> s) {
	Queue<Integer> q = new LinkedList<Integer>();
	while (!s.isEmpty()) {
		q.add(s.pop());
	}
	while(!q.isEmpty()) {
		s.push(q.remove());
	}
	while (!s.isEmpty()) {
		q.add(s.pop());
	}
	boolean result = true;
	s.push(q.remove());
	while (!q.isEmpty()) {
		if (s.peek() + 1 != q.peek()) {
			result = false;
		}
		s.push(q.remove());
	}
	return result;
}
		