package leetCode;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;


    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class FBmockInterviewTreeDiameter {
    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }

    public int depth(TreeNode root) {
        if (root == null) return 0;
            int l = diameterOfBinaryTree(root.left);
            int r = diameterOfBinaryTree(root.right);
            ans = Math.max(ans, l + r + 1);
            return Math.max(l, r);
    }
}

