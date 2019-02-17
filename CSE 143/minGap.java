/* Write a method called minGap that returns the minimum gap between 
adjacent values in a list of integers. The gap between two adjacent 
values in a list is defined as the second value minus the first value. 
For example, suppose a variable called list stores these values: 

        [1, 3, 6, 7, 12]

The first gap is 2 (3 - 1), the second gap is 3 (6 - 3), the third gap 
is 1 (7 - 6), and the fourth gap is 5 (12 - 7). Thus, the call: 

        list.minGap()

should return 1 because that is the smallest gap. Notice that the 
minimum gap could be a negative number. For example, if list stores the 
following: 

        [3, 5, 11, 4, 8]

The gaps are 2 (5 - 3), 6 (11 - 5), -7 (4 - 11), and 4 (8 - 4). Of 
these values, -7 is the smallest, so it would be returned. 

Your method should return 0 if the list has fewer than 2 elements. You 
are writing a method for the LinkedIntList class: 

        public class ListNode {
            public int data;       // data stored in this node
            public ListNode next;  // link to next node in the list

            <constructors>
        }
 
        public class LinkedIntList {
            private ListNode front;

            <methods>
        }

Your method should not modify the list contents and is required to run 
in O(n) time where n is the length of the list. You may not call any 
other methods of the LinkedIntList class and you may not construct any 
structured objects to solve this problem. */

public int minGap() {
	ListNode curr = front;
	if (curr == null || curr.next == null) {
		return 0;
	}
	int gap = curr.next.data - curr.data;
	while (curr.next.next != null) {
		curr = curr.next;
		int temp = curr.next.data - curr.data;
		if (temp < gap) {
			gap = temp;
		}
	}
	return gap;
}
