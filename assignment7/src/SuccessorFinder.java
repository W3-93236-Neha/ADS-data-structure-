class TreeNode {
    int val;
    TreeNode left, right, parent;

    TreeNode(int val) {
        this.val = val;
    }
}
public class SuccessorFinder {

    public TreeNode findSuccessor(TreeNode node) {
        if (node == null) return null;

        // Case 1: Node has right child → successor is leftmost of right subtree
        if (node.right != null) {
            return getLeftmost(node.right);
        }

        // Case 2: No right child → go up until we find a node that is a left child
        TreeNode current = node;
        TreeNode parent = current.parent;

        while (parent != null && parent.right == current) {
            current = parent;
            parent = parent.parent;
        }

        // Case 3: Leaf node with no successor
        return parent; // May be null if no successor
    }

    private TreeNode getLeftmost(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
