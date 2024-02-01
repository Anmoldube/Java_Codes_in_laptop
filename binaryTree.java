import java.util.Scanner;

public class binaryTree {
    public Scanner sc = new Scanner(System.in);

    public class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;

    public binaryTree() {
        root = createTree();
    }

    public Node createTree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.data = item;
        boolean hlc = sc.nextBoolean();
        if (hlc == true) {
            nn.left = createTree();
        }
        boolean hrc = sc.nextBoolean();
        if (hrc == true) {
            nn.right = createTree();
        }
        sc.close();
        return nn;
    }

    public void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
        public static void main(String[] args) {
            binaryTree tree = new binaryTree();
            tree.preorder(tree.root);
        }
    }