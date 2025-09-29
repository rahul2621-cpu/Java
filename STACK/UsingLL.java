

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class ll{
    private Node top = null;

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next=top;
        top = newNode;
    }

    public int pop(){
        if(isempty()){
            System.out.println("Stack Underflow");
            return -1;
        }

        int popedvalue = top.data;
        top = top.next;
        return popedvalue;
    }

    public int peek(){
        if(isempty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return top.data;
    }

    public boolean isempty(){
        return top == null;
    }

    public void display(){
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
    }
    System.out.println();
}
}
public class UsingLL {
    public static void main(String[] args) {
        ll st = new ll();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();

        st.pop();
        System.out.println(st.peek());
        st.display();
    }
}
