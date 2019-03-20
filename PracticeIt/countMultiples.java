/* Write a method countMultiples that could be added to the IntTree class 
from lecture and section. The method returns a count of the number of 
multiples of a particular value in the binary tree. Given a number n, a 
value m is considered a multiple of n if it can be expressed as (k * n) 
for some integer k. For example, suppose that an IntTree variable tree 
stores a reference to the following tree: */

public int countMultiples(int n) {
	if (n == 0) {
		throw new IllegalArgumentException();
	}
	return countMultiples(overallRoot, n, 0);
}

private int countMultiples(IntTreeNode root, int n, int count) {
	if (root != null) {
		count = countMultiples(root.left, n, count) + countMultiples(root.right,
				n, count);
		if (root.data % n == 0) {
			count++;
		}
		return count;
	}
	return 0;
}