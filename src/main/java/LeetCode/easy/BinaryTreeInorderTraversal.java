package LeetCode.easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {
        // Input: root = [1,null,2,3]
        // Output: [1,3,2]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(new BinaryTreeInorderTraversal().inorderTraversal(root));
    }

    // In-order -> <left> <root> <right>
    // iterativeInorder(node)
    //  s ← empty stack
    //  while (not s.isEmpty() or node ≠ null)
    //    if (node ≠ null)
    //      s.push(node)
    //      node ← node.left
    //    else
    //      node ← s.pop()
    //      visit(node) <---- Do something
    //      node ← node.right
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.addLast(root);
                root = root.left;
            } else {
                root = stack.pollLast();
                ans.add(root.val);
                root = root.right;
            }
        }
        return ans;
    }

    public static class TreeNode {
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
