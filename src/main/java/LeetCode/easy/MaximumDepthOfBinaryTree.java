package LeetCode.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        System.out.println(new MaximumDepthOfBinaryTree().maxDepth(root)); // 3
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int max = 1;

        Deque<TreeNode> nodeStack = new ArrayDeque<>();
        Deque<Integer> depthStack = new ArrayDeque<>();

        nodeStack.push(root);
        depthStack.push(1);

        while (!nodeStack.isEmpty()) {
            TreeNode current = nodeStack.pop();
            int depth = depthStack.pop();
            if (current.left == null && current.right == null) {
                max = Math.max(max, depth);
            }
            if (current.left != null) {
                nodeStack.push(current.left);
                depthStack.push(depth + 1);
            }
            if (current.right != null) {
                nodeStack.push(current.right);
                depthStack.push(depth + 1);
            }
        }
        return max;
    }

    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
