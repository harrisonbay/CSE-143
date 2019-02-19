// problem 5
ListNode temp = new ListNode(3);
list.next.next = temp;

// problem 6
ListNode temp = new ListNode(3, list);
list = temp;

// problem 7
temp.next = list.next;
list.next = temp;

// problem 8
temp.next.next = list.next;
list.next = temp;

// problem 9
list.next.next = temp.next;
temp.next = list.next;
list.next = temp;

// problem 10
ListNode list2 = list;
list = list2.next;
list2.next = list.next;
list.next = null;

// problem 11
list.next.next.next = list;
list = list.next;
list.next.next.next = null;

// problem 12
ListNode temp = list.next;
list.next = temp.next;
temp.next = list;
list = temp;

// problem 13
ListNode temp = list.next.next;
temp.next = list.next;
list.next = null;
temp.next.next = list;
list = temp;

// problem 14
ListNode list2 = list.next;
list2.next.next = list;
list2.next.next.next = null;
list = list2.next;

// problem 15
ListNode curr = list;
curr.data = 42;
while (curr.next != null) {
	curr = curr.next;
	curr.data = 42;
}

// problem 16
ListNode curr = list;
while (curr.next != null) {
	curr = curr.next;
}
curr.data = 42;

// problem 18
ListNode curr = list;
while (curr.next != null) {
	curr = curr.next;
}
curr.next = new ListNode(42);

