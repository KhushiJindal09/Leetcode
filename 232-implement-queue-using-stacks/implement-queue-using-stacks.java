class MyQueue {
    Stack <Integer> st = new Stack<>();
    Stack <Integer> rt = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        while (!st.isEmpty()) {
            rt.push(st.pop());
        }
        st.push(x);
        while(!rt.isEmpty()) {
            st.push(rt.pop());
        }
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        if (st.isEmpty()) return true;
        else return false; 
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */