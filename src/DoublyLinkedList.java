import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private ListNode head;
    private  ListNode tail;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode prev;

        public ListNode(int data) {
            this.data = data;
        }


    }
    public DoublyLinkedList(){
    this.head = null;
    this.tail = null;
    this.length = 0;
    }
    public boolean isEmpty() {
        return length == 0;
    }
    public int length() {
        return length;
    }

    public void insert(int value) {
        ListNode newNode = new ListNode(value);

        if(head == null) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        newNode.prev = tail;
        tail = newNode;
        length++;
    }

    public void displayForward (){
            if(head == null) {
                return;
            }
            ListNode temp = head;
            while(temp != null) {
                System.out.print(temp.data + "-->");
                temp=temp.next;
            }
        System.out.print("null");
    }

    public void displayBackward() {
        if(tail == null) {
            return;
        }
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "<--");
            temp = temp.prev;
        }
        System.out.print("null");
    }

    public void insertAtFirst(int value) {
        ListNode newNode = new ListNode(value);
        if(head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        temp.prev = newNode;
        newNode.next = temp;
        newNode.prev = null;
        head = newNode;
    }

    public ListNode deleteFirst() {
        ListNode current = head;
//        if(isEmpty()) {
//            throw new NoSuchElementException();
//        }
        if(head == tail) {
            tail = null;
//            return null;
        }
        else{
            head.next.prev = null;
        }
        head = head.next;
        current.next = null ;
        return current;


    }




    public static void main(String args[]) {
        DoublyLinkedList dll = new DoublyLinkedList();

//        dll.insert(2);
//        dll.insert(3);
//        dll.insert(4);

        dll.insertAtFirst(7);
        dll.insertAtFirst(2);
        dll.insertAtFirst(44);
        dll.insertAtFirst(63);

        dll.displayForward();
        System.out.println();

        dll.deleteFirst();

        dll.displayForward();
//        dll.displayBackward();

    }
}
