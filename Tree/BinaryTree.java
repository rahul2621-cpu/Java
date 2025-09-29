package Tree;

public class BinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTr{
    static int idx = -1;    
    public static Node buildBT(int[] node){
        idx++;
        if(node[idx] == -1){
            return null;
        }
        Node newNode = new Node(node[idx]);
        newNode.left = buildBT(node);
        newNode.right = buildBT(node);
        return newNode;
    }

    public static void preeOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preeOrder(root.left);
        preeOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left+right+1;
    }

    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int left = sum(root.left);
        int right = sum(root.right);
        return left+right+root.data;
    }
    public static int Height(Node root){
        if(root==null){
            return 0;
        }
        int left = Height(root.left);
        int right = Height(root.right);
        int myheight = Math.max(left, right)+1;
        return myheight;
    }
}

    public static void main(String[] args) {
        int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTr tree = new BinaryTr();
        Node root = tree.buildBT(arr);
        // tree.preeOrder(root);
        // System.out.println();
        // tree.inOrder(root);
        // System.out.println();
        // tree.postorder(root);
        //System.out.println(root.data);
        System.out.println(tree.countNodes(root));
        System.out.println(tree.sum(root));
        System.out.println(tree.Height(root));
    }
    
}
