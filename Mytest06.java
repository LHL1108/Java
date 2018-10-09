public class Mytest06 {
	//定义二叉树
	public static class BinaryTreeNode{
		int value;
		BinaryTreeNode left;
		BinaryTreeNode right;
	}
	//判断输入合法性
	public static BinaryTreeNode construct(int[] preorder, int[] inorder) {
		if (preorder == null || inorder == null || preorder.length != inorder.length || inorder.length < 1) {
			return null;
		}
		return construct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
	}
	//确定构成
	public static BinaryTreeNode construct(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {
		if (ps > pe) {
			return null;
		}
		int value = preorder[ps];
		int index = is;
		while (index < ie && inorder[index] != value) {
			index++;
		}
		if (index > ie) {
			throw new RuntimeException("Invalid Input");
		}
		BinaryTreeNode node = new BinaryTreeNode();
		node.value = value;
		node.left = construct(preorder, ps + 1, ps + index - is, inorder, is, index - 1);
		node.right = construct(preorder, ps + index - is + 1, pe, inorder, index + 1, ie);
		
		return node;
	}
	//打印
	public static void PrintTree(BinaryTreeNode root) {
		if(root != null) {
			PrintTree(root.left);
			System.out.print(root.value);
			PrintTree(root.right);
		}

	}
    // 普通二叉树
    //              1
    //           /     \
    //          2       3
    //         /       / \
    //        4       5   6
    //         \         /
    //          7       8
	private static void test1() {
		int[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};
		int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};
		BinaryTreeNode root = construct(preorder, inorder);
		PrintTree(root);
	}
	
	public static void main(String[] arg) {
		test1();
	}
}