

class DoublyNode {

    public DoublyNode(int val) {
        this.val = val;
    }

    int val;
    DoublyNode next;
    DoublyNode prev;
}

class LinkedList {
    DoublyNode head = null;
    DoublyNode tail = null;
    int length = 0;

    public LinkedList() {}

    public void insertAtHead(int val) {
        DoublyNode newDoublyNode = new DoublyNode(val);
        newDoublyNode.next = head;
        head = newDoublyNode;
        if (tail == null) {
            tail = newDoublyNode;
        }
        length++;
    }

    public void insertAtTail(int val) {
        DoublyNode newDoublyNode = new DoublyNode(val);
        newDoublyNode.prev = tail;
        if (length == 0) {
            head = tail = newDoublyNode;
        } else {
            tail.next = newDoublyNode;
            tail = newDoublyNode;
        }
        length++;
    }

    public void deleteAtHead() {
        if (length == 0) {
            return;
        }
        else if (length == 1) {
            tail = head = null;
        }
        else {
            head = head.next;
        }
        length--;
    }

    public void deleteTail() {
        if (length == 0) {
            return;
        }
        else if (length == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
        }
        length--;
    }

    public void display() {
        DoublyNode temp = this.head;
        while (temp.next != null) {
            System.out.println(temp.val);;
            temp = temp.next;
        }
    }

    // While still O(n) with abstraction, this is faster practically then going from head
    // By determining if the index is < or > than the middle index, we can cut the run time from
    // O(n) to O(n/2) since at most we will only have to iterate over half of the size of the list
    public int get(int index) {
        if (index < 0 || index >= length) {
            return -1;
        }

        int middle = length / 2;
        if (index <= middle) {
            DoublyNode temp = this.head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.val;
        }

        DoublyNode temp = this.tail;
        for (int i = length - 1; i > index; i--) {
            temp = temp.prev;
        }
        return temp.val;
    }
}

public class DoublyLinkedList {

     public static void main(String[] args) {
         LinkedList list = new LinkedList();
         list.insertAtHead(1);
         list.insertAtHead(2);
         list.insertAtHead(3);
         list.insertAtHead(4);

         list.insertAtTail(9);
         list.insertAtTail(8);
         list.deleteAtHead();
         list.deleteTail();

         list.display();

         System.out.println(list.get(3));
     }

}
