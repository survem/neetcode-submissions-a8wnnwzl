class MyStack {

    Deque<Integer> myStack;

    public MyStack() {
        myStack = new ArrayDeque<>();
    }
    
    public void push(int x) {
        myStack.push(x);
    }
    
    public int pop() {
        return myStack.pop();
    }
    
    public int top() {
       return myStack.peek();
    }
    
    public boolean empty() {
        return myStack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */