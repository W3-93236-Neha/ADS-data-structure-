class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BSTDepthFinder {

    // Returns depth of the node with given key, or -1 if not found
    public static int findDepth(TreeNode root, int key) {
        return findDepthHelper(root, key, 0);
    }

    private static int findDepthHelper(TreeNode node, int key, int depth) {
        if (node == null) return -1; // Key not found

        if (node.val == key) return depth;

        if (key < node.val) {
            return findDepthHelper(node.left, key, depth + 1);
        } else {
            return findDepthHelper(node.right, key, depth + 1);
        }
    }

    public static void main(String[] args) {
        // Sample BST
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(15);

        int key = 15;
        int depth = findDepth(root, key);
        if (depth != -1) {
            System.out.println("Depth of node " + key + " is: " + depth);
        } else {
            System.out.println("Node " + key + " not found in BST.");
        }
    }
}
