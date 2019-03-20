/* Write a method matches that could be added to the IntTree class from lecture and section. The method returns a count of the number of nodes in one tree that match nodes in another tree. A match is defined as a pair of nodes that are in the same position in the two trees relative to their [overallRoot] and that store the same data. */

// pretty much the exact same problem as countMultiples
public int matches(IntTree t2) {
	return matches(overallRoot, t2.overallRoot, 0);
}

private int matches(IntTreeNode root1, IntTreeNode root2, int count) {
	if (root1 != null && root2 != null) {
		count = matches(root1.left, root2.left, count) + matches(root1.right,
				root2.right, count);
		if (root1.data == root2.data) {
			count++;
		}
		return count;
	}
	return 0;
}