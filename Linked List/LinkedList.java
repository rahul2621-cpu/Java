public class LinkedList {

    static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void insertAtBegining(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void deleteNode(int data){
        if(head == null){
            System.out.println("List is Empty");
        }
        if(head.data == data){
            head = head.next;
           return;
    }
    Node temp = head;
    while(temp.next != null && temp.next.data != data){
        temp = temp.next;
    }
    if(temp.next == null){
        System.out.println("Node not found");
        return;
    }
    temp.next = temp.next.next;
    }

    public int length(){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void display(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //INSERT A NODE TO GIVEN INDEX
    public void insertAt(int idx, int val){
        Node t = new Node(val);
        Node temp = head;
        if(idx==length()){
            insertAtEnd(val);
            return;
        }
        else if(idx==0){
            insertAtBegining(val);
            return;
        }

        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
    }

    //GET A VALUE FROM ANY INDEX
    public int get(int idx){
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.data;
    }

    //DELETE A NODE TO GIVEN INDEX  
    public void delete(int idx){
        if(idx==0){
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        
    }

    //FINDING Nth NODE FROM TH END OF LINKED LIST
    public static Node nthNode(int n, Node head){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public Node getHead(){
        return head;
    }

    //REMOVING Nth NODE FROM TH END OF LINKED LIST
    public static Node deleteAtnth(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }

        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
   
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBegining(20);
        list.insertAtBegining(10);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        

        //list.display();
        //System.out.println(list.length());


        //list.deleteNode(20);
        //list.display();
       // System.out.println(list.length());

        //list.insertAt(1,20);
        //list.display();

        // int a = list.get(1);
        // System.out.println(a);

        // list.delete(0);
        // list.display();

        //  Node result =list.nthNode(2,list.getHead());
        // System.out.println(result.data);

        


        // list.deleteAtnth(list.getHead(), 4);
        // list.display();

       


    }
}
