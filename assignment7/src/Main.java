//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node15 = new TreeNode(15);

        root.left = node10;
        root.right = node30;
        node10.parent = root;
        node30.parent = root;

        node10.right = node15;
        node15.parent = node10;

        SuccessorFinder finder = new SuccessorFinder();

        System.out.println("Successor of 10: " + finder.findSuccessor(node10).val);
        System.out.println("Successor of 15: " + finder.findSuccessor(node15).val);
        System.out.println("Successor of 30: " + finder.findSuccessor(node30));
    }

}