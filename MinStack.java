class MinStack {
    Stack<Integer>s1; 
    public MinStack() {
       s1=new Stack<>(); 
    }
    
    public void push(int val) {
       s1.push(val); 
    }
    
    public void pop() {
        s1.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
       int min=Integer.MAX_VALUE;
       for(int e:s1)
       {
        if(e<min)
        {
            min=e;
        }
       }
       return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
