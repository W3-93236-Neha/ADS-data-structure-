public class Stack {
    private  int arr[];
    private int top;
    private  int SIZE;
    public Stack(int size){
        arr = new int[SIZE];
        top = SIZE;
        SIZE = size;
    }
    public boolean isEmpty(){
        return top==SIZE;//stack is empty at top==SIZE
    }
    public boolean isFull(){
        return top==0; // stack is full at top==0
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full");
        }else {
            // Decrement top before adding the element
            top--;
            arr[top] = value;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
           int popitem= arr[top];
           top++;
           return popitem;
        }
        return -1;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            int num= arr[top];
            return num;
        }
        return -1;
    }

    public  void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            for(int i=0;i<SIZE;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println( "display");

        }
    }
}

