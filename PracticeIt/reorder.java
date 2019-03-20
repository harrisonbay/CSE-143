/* Write a method reorder that could be added to the LinkedIntList class 
from lecture and section. The method rearranges a list of integers into 
sorted order assuming already sorted by absolute value. Suppose a 
LinkedIntList variable list stores the following values: 

[0, -3, 3, -5, 7, -9, -10, 10, -11, -11, -11, 12, -15] 

Notice that the values are in sorted order ignoring the sign of each 
value. The call list.reorder(); should reorder the values into sorted, 
non-decreasing order (including sign). 

[-15, -11, -11, -11, -10, -9, -5, -3, 0, 3, 7, 10, 12] 

Because the list is sorted by absolute value, you can solve this problem 
very efficiently. Your solution is required to run in O(N) time where N 
is the length of the list. 

Assume that we are adding this method to the LinkedIntList class as seen 
in lecture and as shown below. You may not call any other methods of the 
class to solve this problem, you may not construct any new nodes, and 
you may not use any auxiliary data structures to solve this problem 
(such as an array, ArrayList, Queue, String, etc.). You also may not 
change any data fields of the nodes. You must solve this problem by 
rearranging the links of the list. 


public class LinkedIntList {
    private ListNode front;
    ...
}

public class ListNode {
    public int data;
    public ListNode next;
    ...
} */

public void reorder() {
	ListNode curr = front;
	if (curr != null) {
		while (curr.next != null) {
			if (curr.next.data >= 0) {
				curr = curr.next;
			} else {
				ListNode temp = curr.next;
				curr.next = curr.next.next;
				temp.next = front;
				front = temp;
			}
		}
	}
}