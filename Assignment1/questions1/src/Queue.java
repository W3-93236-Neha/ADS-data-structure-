//import static sun.util.locale.LocaleUtils.isEmpty;

//import static sun.util.locale.LocaleUtils.isEmpty;

public class Queue {
    public int front;
    public int rear;
    public int size;
    public int arr[];
    public Queue(int size){
        arr=new int[size];
        this.size=size;
        front=rear=0;
        //set front and rear at -1 index
    }
    public void push(int data){
        if(isFull())
        {
            System.out.println("Queue is full");

        }else {
            rear++;
            arr[rear]=data;
        }
    }
    public int pop(){
        int temp=0;
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        else {
            temp=arr[front+1];
            front++;
            //for proper memory utilization
            if(front==rear)

                front=rear=-1;
        }
        return  temp;
    }
    public int peek(){
        int temp=0;
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }else{
            temp=arr[front+1];

        }
        return temp;
    }

    private boolean isFull() {
        return  rear== size-1;
    }
    private boolean isEmpty() {
        return rear==0 && front==0;
    }
}
