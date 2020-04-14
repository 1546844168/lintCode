package solution;

import base.TreeNode;

/**
 * @author 潇潇暮雨
 * @create 2018-09-05   18:05
 * <p>
 * 632. 二叉树的最大节点
 * 在二叉树中寻找值最大的节点并返回。
 * <p>
 * 样例
 * 给出如下一棵二叉树：
 * <p>
 * 1
 * /   \
 * -5     2
 * / \   /  \
 * 0   3 -4  -5
 * 返回值为 3 的节点。
 */
public class Solution632 {
    /*
     * @param root: the root of tree
     * @return: the max node
     */
    public TreeNode maxNode(TreeNode root) {
        // Write your code here
        if (root != null) {
            TreeNode left = maxNode(root.left);
            TreeNode right = maxNode(root.right);
            return max(root, max(left, right));
        }
        return null;
    }

    public TreeNode max(TreeNode left, TreeNode right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        if (left.val > right.val) {
            return left;
        }
        return right;
    }

    /**
     * 1
     * /   \
     * -5     2
     * / \   /  \
     * 0   3 -4  -5
     * 返回值为 3 的节点。
     */
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(-5);
        TreeNode node2 = new TreeNode(2);
//        base.TreeNode node3 = new base.TreeNode(0);
//        base.TreeNode node4 = new base.TreeNode(3);
//        base.TreeNode node5 = new base.TreeNode(-4);
//        base.TreeNode node6 = new base.TreeNode(-5);
//        base.TreeNode node7 = new base.TreeNode(-3);
//        base.TreeNode node8 = new base.TreeNode(5);
//        base.TreeNode node9 = new base.TreeNode(8);
        node.left = node1;
        node.right = node2;
//        node1.right = node3;
//        node1.left = node4;
//        node2.left = node5;
//        node2.right = node6;
        TreeNode treeNode = new Solution632().maxNode(node);
        System.out.println(treeNode.val);
    }
}
