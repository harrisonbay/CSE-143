Write a method called removeFront that takes an integer n as a parameter 
and that removes the first n values from a list of integers. For 
example, if a variable called list stores this sequence: 

        [8, 17, 9, 24, 42, 3, 8]
		
and the following call is made:

        list.removeFront(4);
		
then it should store the following values after the call:

        [42, 3, 8]
		
Notice that the first four values in the list have been removed and the 
other values appear in the same order as in the original list. 

You are writing a method for the ArrayIntList class discussed in lecture:

        public class ArrayIntList {
            private int[] elementData; // list of integers
            private int size;          // current # of elements in the list

            <methods>
        }
		
Your method should throw an IllegalArgumentException if the parameter n 
is less than 0 or greater than the number of elements in the list. You 
are not to call any other ArrayIntList methods to solve this problem, 
you are not allowed to define any auxiliary data structures (no array, 
ArrayList, etc), and your solution must run in O(n) time where n is the 
length of the list. 

public void removeFront(int n) {
	if (n < 0 || n > size) {
		throw new IllegalArgumentException();
	}
	for (int i = n; i < size; i++) {
		elementData[i - n] = elementData[i];
	}
	size -= n;
}
		