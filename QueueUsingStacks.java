import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> stack = new Stack<Integer>();;
    public void MyQueue() {

    }

    public void push(int x) {
        this.stack.push(x);
    }

    public int pop() {
        Stack<Integer> temp = new Stack<Integer>();
        while(this.stack.size() !=1){
            temp.push(this.stack.pop());
        }
        int y = this.stack.pop();
        while(temp.size()!=0){
            this.stack.push(temp.pop());
        }
        return y;
    }

    public int peek() {
        Stack<Integer> temp = new Stack<Integer>();
        while(this.stack.size() !=1){
            temp.push(this.stack.pop());
        }
        int y = this.stack.peek();
        while(temp.size()!=0){
            this.stack.push(temp.pop());
        }
        return y;
    }

    public boolean empty() {
        return this.stack.isEmpty();
    }
}
