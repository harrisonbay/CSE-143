/* Write a method construct that could be added to the IntTree class 
from lecture and section. The method accepts an array of integers as a 
parameter and constructs a balanced binary search tree containing those 
integers. The tree should be constructed so that for every node, either 
the left/right subtrees have the same number of nodes or the left 
subtree has one more node than the right. 

For example, if you have an IntTree variable called tree and an array 
called data storing values [1, 2, 3, 4, 5, 6, 7] and a call of 
tree.construct(data);, is made, tree should store the tree below at 
left. If the array stores [3, 8, 19, 27, 34, 42, 49, 53, 67, 74], the 
tree below at right is constructed. 

Notice that when it is not possible to have left and right subtrees of 
equal size, the extra value always ends up in the left subtree, as in 
the overallRoot of the second tree which has 5 nodes in the left subtree 
and 4 in the right. 

Your method should replace any existing tree. For full credit your 
solution is required to run in O(N) time where N is the number of 
elements in the array. You may assume that the values in the array 
appear in sorted order. 

You may define private helper methods to solve this problem, but 
otherwise you may not call any other methods of the class nor create any 
data structures such as arrays, lists, etc. You also may not alter the 
array that you are passed. 

Assume that you are adding this method to the IntTree class as defined 
below: 


public class IntTree {
    private IntTreeNode overallRoot;
    ...
} */

// This problem is really tough--took me a long time
public void construct(int[] data) {
	overallRoot = construct(data, 0, data.length - 1);
}

private IntTreeNode construct(int[] data, int lowIndex, int highIndex) {
	if (lowIndex > highIndex) {
		return null;
	} else {
		int nodeIndex = (lowIndex + highIndex + 1) / 2;
		return new IntTreeNode(data[nodeIndex], 
				construct(data, lowIndex, nodeIndex - 1), 
				construct(data, nodeIndex + 1, highIndex));
	}
}