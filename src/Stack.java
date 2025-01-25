// A stack is useful if you only need to see the most previously added in that order.

class StackNode {
    int val;
    StackNode prev;

    public StackNode(int val) {
        this.val = val;
    }
}

class StackList {
    StackNode head = null;
    int size = 0;

    public StackList() {
    }

    public void push(int val) {
        size++;
        StackNode newNode = new StackNode(val);

        if (size == 1) {
            head = newNode;
            return;
        }

        newNode.prev = head;
        head = newNode;
    }

    public int pop() {
        if (size == 0) {
            return -1;
        }
        size--;

        StackNode temp = head;
        head = head.prev;
        return temp.val;
    }
}

public class Stack {

    public static void main(String[] args) {
        StackList stack = new StackList();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
