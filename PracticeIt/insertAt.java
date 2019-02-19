/* Write a method called insertAt that takes an index, an integer n, and 
a value as parameters, and that inserts n copies of the given value at 
the given index in a list of integers. For example, if a variable called 
list stores this sequence: 

        [12, 42, 8, 934]

and the following call is made:

        list.insertAt(2, 4, 98);
		
then it should store the following values after the call:

        [12, 42, 98, 98, 98, 98, 8, 934]
		
Notice that there are now four occurrences of the value 98 starting at 
index 2 and that later values are in the same order as in the original. 

You are writing a method for the ArrayIntList class discussed in lecture:

        public class ArrayIntList {
            private int[] elementData; // list of integers
            private int size;          // current # of elements in the list
            
			
        }
		
Your method should throw an IllegalArgumentException if the index is 
less than 0 or greater than the number of elements in the list or if the 
value of n is less than 0. You are not to call any other ArrayIntList 
methods to solve this problem, you are not allowed to define any 
auxiliary data structures (no array, ArrayList, etc), and your solution 
must run in O(n) time where n is the length of the list. You may assume 
that the array has sufficient capacity to store the new values. */ 

public void insertAt(int index, int n, int value) {
	if (index < 0 || index > size || n < 0) {
		throw new IllegalArgumentException();
	}
	for (int i = size - 1; i >= index; i--) {
		elementData[i + n] = elementData[i];
	}
	for (int i = index; i < index + n; i++) {
		elementData[i] = value;
	}
	size += n;
}