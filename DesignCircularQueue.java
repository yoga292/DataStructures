
class MyCircularQueue {
    int[] arr;
    int f = 0,r = 0;
    int capacity;
    int size = 0;
    public MyCircularQueue(int k) {
        arr = new int[k];
        capacity = k;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        arr[r] = value;
        r = (r+1)%capacity;
        size+=1;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        f = (f+1)%capacity;
        size-=1;
        return true;
    }
    
    public int Front() {
        if(size==0) return -1;
        return arr[f];
    }
    
    public int Rear() {
        if(size==0) return -1;
        return arr[(r-1+capacity)%capacity];
    }
    
    public boolean isEmpty() {
        if(size==0) return true;
        else return false;
    }
    
    public boolean isFull() {
        if(size==capacity) return true;
        else return false;
    }
}
