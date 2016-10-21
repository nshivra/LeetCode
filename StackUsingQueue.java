class MyStack {
    // Push element x onto stack.
    Queue<Integer> q = new LinkedList<Integer>();
    Queue<Integer> qBack = new LinkedList<Integer>();
    
    public void push(int x) {
        if(q.isEmpty()) q.add(x);
        else{
            while(!q.isEmpty()){
                int it = q.remove();
                qBack.add(it);
            }
            q.add(x);
            while(!qBack.isEmpty()){
                int it = qBack.remove();
                q.add(it);
            }
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        q.remove();
    }

    // Get the top element.
    public int top() {
        return q.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        if(q.isEmpty()) return true;
        return false;
    }
}
