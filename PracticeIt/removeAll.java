/* Write a method removeAll that could be added to the LinkedIntList class 
from lecture and section. The method should efficiently remove from a 
sorted list of integers all values appearing in a second sorted list of 
integers. For example suppose LinkedIntList variables list1 and list2 
refer to the following lists: */

// Another pretty damn hard problem...
public void removeAll(LinkedIntList list2) {
	ListNode curr2 = list2.front;
	while (front != null && curr2 != null && front.data >= curr2.data) {
		if (front.data > curr2.data) {
			curr2 = curr2.next;
		} else {
			front = front.next;
		}
	}
	// We are certain here that curr2.data > front.data if front exists
	if (front != null) {	
		ListNode curr = front;
		while (curr.next != null && curr2 != null) {
			if (curr.next.data > curr2.data) {
				curr2 = curr2.next;
			} else if (curr.next.data == curr2.data) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}	
	}
}