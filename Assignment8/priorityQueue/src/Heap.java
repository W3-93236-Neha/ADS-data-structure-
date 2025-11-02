public class Heap {
    private int SIZE;
    private int[] heap;
    public Heap(int size) {
        SIZE = 0;
        heap = new int[size + 1];
    }
    public void addHeap(int value) {
        SIZE++;
        heap[SIZE] = value;
        int ci=SIZE;
        int parent=ci/2;
        while(parent>=1){
            if(heap[parent]>heap[ci])
                break;

                int temp=heap[ci];
                heap[ci]=heap[parent];
                heap[parent]=temp;
                ci=parent;
                parent=ci/2;

        }

    }
    public int deleteHeap() {
        int max=heap[1];
        heap[1]=heap[SIZE];
        SIZE--;
        int parent=1;
        int ci=parent*2;
        while(ci<=SIZE){
            if((ci+1)<=SIZE && heap[ci+1]>heap[ci])
                ci=ci+1;
            if(heap[parent]>heap[ci])
                break;
            int temp=heap[ci];
            heap[ci]=heap[parent];
            heap[parent]=temp;

            parent=ci;
            ci=parent*2;

        }
        return max ;
    }
    public boolean isEmpty() {
        return SIZE==0;
    }
    public boolean isFull() {
        return SIZE==heap.length-1;
    }
    public int getRoot() {
        return heap[1];
    }
    public int getSize() {
        return SIZE;
    }


}
