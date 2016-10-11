public class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> s;
    Stack<Integer> minS;
    
    public MinStack() {
        s = new Stack<Integer>();
        minS = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(minS.size() > 0){
            if(minS.peek() >= x){
                minS.push(x);
            }
        }
        else{
            minS.push(x); 
        }
        s.push(x);
    }
    
    public void pop() {
        if(s.size() > 0){
            if((int)s.peek() == (int)minS.peek()){
                minS.pop();
            }
            s.pop();
        }
    }
    
    public int top() {
        if(s.size() > 0) return s.peek();
        else return 0;
    }
    
    public int getMin() {
        if(minS.size() > 0) return minS.peek();
        else return 0;
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
