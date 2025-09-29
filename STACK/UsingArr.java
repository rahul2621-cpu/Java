class Array{
    private int[] stack;
    private int top;
    private int capacity;

    public Array(int size){
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int element){
        if(isfull()){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = element;
    }

    public int pop(){
        if(isempty()){
            System.out.println("Stack Underflow");
            return -1;
        }
            return stack[top--];
    }

    public int peek(){
        if(isempty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isempty(){
        return top == -1;
    }
    public boolean isfull(){
        return top == capacity-1;
    }

    public void display(){
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}

public class UsingArr{
    public static void main(String[] args) {
        Array st = new Array(5);
            st.push(10);
            st.push(20);
            st.push(30);
            st.display();
            System.out.println( st.peek());

             st.pop();
             st.pop();
             st.display();
            
    }
}