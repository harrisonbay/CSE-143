/* Write a method called removeMin that takes a stack of integers as a parameter 
and that removes and returns the smallest value from the stack. For example, if 
a variable called s stores the following sequence of values: 

        bottom [2, 8, 3, 19, 7, 3, 2, 42, 9, 3, 2, 7, 12, -8, 4] top
		
and you make the following call:

        int n = removeMin(s);
		
the method removes and returns the value -8 from the stack, so that the variable 
n will be -8 after the call and s will store the following values: 

        bottom [2, 8, 3, 19, 7, 3, 2, 42, 9, 3, 2, 7, 12, 4] top
		
If the minimum value appears more than once, all occurrences of the minimum 
should be removed from the stack. For example, given the ending value of the 
stack above, if we again call removeMin(s), the method would return 2 and would 
leave the stack in the following state: 

        bottom [8, 3, 19, 7, 3, 42, 9, 3, 7, 12, 4] top
		
You are to use one queue as auxiliary storage to solve this problem. You may not 
use any other auxiliary data structures to solve this problem, although you can 
have as many simple variables as you like. You also may not solve the problem 
recursively. Your solution must run in O(n) time where n is the size of the 
stack. Use the Stack and Queue structures described in the cheat sheet and obey 
the restrictions described there. */ 

public int removeMin(Stack<Integer> s) {
    int smallest = s.peek();
    Queue<Integer> q = new LinkedList<Integer>();
    while (!s.isEmpty()) {
        if (s.peek() < smallest) {
            smallest = s.peek();
        }
        q.add(s.pop());
    }
    while (!q.isEmpty()) {
        int temp = q.remove();
        if (temp != smallest) {
            s.push(temp);
        }
    }
    while (!s.isEmpty()) {
        q.add(s.pop());
    }
    while (!q.isEmpty()) {
        s.push(q.remove());
    }
    return smallest;
}
