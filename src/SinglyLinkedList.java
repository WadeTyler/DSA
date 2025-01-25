import static javax.swing.UIManager.get;

class Node {
    public int val;
    public Node next;

    public Node(int x) {
        val = x;
    }

}

class SinglyLinkedListObj {
    Node head = null;
    Node tail = null;
    int length = 0;

    public SinglyLinkedListObj() {
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Val: " + temp.val);
            temp = temp.next;
        }
    }

    public void insertAtHead(int val) {
        Node newNode = new Node(val);

        if (length == 0) {
            head = tail = newNode;
            length++;
            return;
        }

        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertAtTail(int val) {
        Node newNode = new Node(val);
        if (length == 0) {
            head = tail = newNode;
            length++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void deleteNode(int val) {
        if (length == 0) return;

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.val == val) {

                Node temp2 = temp.next; // temp store for free memory
                temp.next = temp.next.next; // Set to the next.next
                temp2.next = null;  // free memory
                length--;
                break;
            }
            temp = temp.next;
        }

        if (length == 1) {
            tail = head;
        }
    }

    public int get(int index) {
        if (length == 0 || index > length - 1) return -1;

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
}

public class SinglyLinkedList {

    private static Node head;
    private static int length;

    public static void main(String[] args) {
        SinglyLinkedListObj list = new SinglyLinkedListObj();

        list.insertAtHead(4);
        list.insertAtTail(5);
        list.insertAtTail(6);
        list. insertAtTail(7);

        list.deleteNode(6);
        list. insertAtHead(6);

        list.printList();

        System.out.println("index 2: " + list.get(2));

    }



}


