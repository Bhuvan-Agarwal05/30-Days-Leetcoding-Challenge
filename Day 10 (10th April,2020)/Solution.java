class MinStack {

    /** initialize your data structure here. */
    Stack stack;
    Stack min;
    int minimum;
    public MinStack() {
        stack = new Stack();
        min = new Stack();
    }
    
    public void push(int x) {
        minimum = x;
        if(!min.isEmpty() && minimum > (Integer)min.peek())
            minimum = (Integer)min.peek();
        
        stack.push(x);
        min.push(minimum);
    }
    
    public void pop() {
        stack.pop();
        min.pop();
    }
    
    public int top() {
        return (Integer)stack.peek();
    }
    
    public int getMin() {
        return (Integer)min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */