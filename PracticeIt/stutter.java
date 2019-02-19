/* Write a method stutter that accepts a Stack of integers as a parameter 
and replaces every value in the stack with two occurrences of that 
value. For example, suppose a stack stores these values: 

bottom [3, 7, 1, 14, 9] top

Then the stack should store the following values after the method terminates:

bottom [3, 3, 7, 7, 1, 1, 14, 14, 9, 9] top

Notice that you must preserve the original order. In the original stack 
the 9 was at the top and would have been popped first. In the new stack 
the two 9s would be the first values popped from the stack. Also, you 
must not use any auxillary data structures to solve this problem. If the 
original stack is empty, the result should be empty as well. */
public void stutter(Stack<Integer> s) {
	if (!s.isEmpty()) {
		int temp = s.pop();
		stutter(s);
		s.push(temp);
		s.push(temp);
	}
}