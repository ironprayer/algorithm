package leetcode.BinaryTreeLevelOrderTraversal;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> binaryTreeWithLevel = new HashMap<>();

        searchTree(root, 0, binaryTreeWithLevel);

        List<Integer> targetLevel = binaryTreeWithLevel.keySet().stream().sorted().toList();

        for(int level : targetLevel) {
            result.add(binaryTreeWithLevel.get(level));
        }

        return result;
    }

    private void searchTree (TreeNode node, int level, Map<Integer, List<Integer>> binaryTreeWithLevel) {
        if (node == null) return;

        List<Integer> levelNodes = binaryTreeWithLevel.getOrDefault(level, new ArrayList<>());
        levelNodes.add(node.val);
        binaryTreeWithLevel.put(level, levelNodes);

        int nextLevel = level + 1;
        searchTree(node.left, nextLevel, binaryTreeWithLevel);
        searchTree(node.right, nextLevel, binaryTreeWithLevel);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


