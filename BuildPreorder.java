public class BuildPreorder {
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

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    // Count of Nodes
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftcount = count(root.left);
        int rightcount = count(root.right);
        return leftcount+rightcount+1;
    }


    //Sum of Nodes
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        return leftsum+rightsum+root.data;

    }

    //Height of Tree
    public static int height(Node root){
        if(root ==null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        int max = Math.max(left, right)+1;
        return max;
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildTree(nodes);
        // System.out.println(root.data);
        // preorder(root);
        // inorder(root);
        // postorder(root);
        // System.out.println(count(root));
        // System.out.println(sum(root));
        System.out.println(height(root));
    }
}
