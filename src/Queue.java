// A queue is useful if you don't need to see the middle values and only what was added to the queue in the same order.

class QueueNode {
    public int val;
    public QueueNode next;
    public QueueNode(int x) {
        val = x;
    }
}


class QueueList {
    public int size = 0;
    public QueueNode head = null;
    public QueueNode tail = null;

    public QueueList() {
    }

    public void enqueue(int val) {
        QueueNode newNode = new QueueNode(val);
        size++;
        if (size == 1) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int dequeue() {
        if (size == 0) {
            return -1;
        }

        QueueNode temp = head;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }

        return temp.val;
    }

}


public class Queue {

    public static void main(String[] args) {
        QueueList list = new QueueList();

        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(4);
        list.enqueue(5);
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());

    }

}
