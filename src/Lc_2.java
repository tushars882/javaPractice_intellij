import java.lang.invoke.CallSite;
import java.util.List;
import java.util.Stack;
public class Lc_2 {
    public ListNode l1;
    public ListNode l2;
    private Object args;

    public class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void pushl1(int last) {
        ListNode newNode = new ListNode(last);        //made an object
        if (l1 == null) {                             //checking if the list is empty or not
            l1 = newNode;                           //assigning newNode value if it is empty
            return;
        }
        ListNode current = l1;                      //if not empty creating a current with head for checking the last position of list
        while (current.next != null) {
            current = current.next;                   //if next of node != null means it is not the last node and then moving current further
        }
        current.next = newNode;                       //if last node found then simply assign the node's next(pointed by current), the value of newNode
    }

    public void pushl2(int last) {
        ListNode newNode = new ListNode(last);        //made an object
        if (l2 == null) {                             //checking if the list is empty or not
            l2 = newNode;                           //assigning newNode value if it is empty
            return;
        }
        ListNode current = l2;                      //if not empty creating a current with head for checking the last position of list
        while (current.next != null) {
            current = current.next;                   //if next of node != null means it is not the last node and then moving current further
        }
        current.next = newNode;                       //if last node found then simply assign the node's next(pointed by current), the value of newNode
    }

    public void Display() {
        ListNode current = l1;          //declaring a temp var pointing head
        ListNode previous = l2;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
//        System.out.print("null");
        while (previous != null) {
            System.out.print(previous.data + "-->");
            previous = previous.next;
        }
        System.out.print("null");
    }

    public void addTwoLL() {
       ListNode dummy = new ListNode(0);            //make a new listNode
       ListNode temp = dummy;                               //assign head of the listNode to temp
       int carry = 0;                                       //initialise a carry
       while(l1 != null  || l2 != null || carry == 1){      //check if the list is not null during traversal
           int sum = 0;                                     //make the sum 0 in evry iteration
           if(l1 != null) {
               sum = sum + l1.data;
               l1 = l1.next;
           }
           if(l2 != null){
              sum = sum + l2.data;
              l2 = l2.next;
           }
           sum = carry + sum ;                                //adding th carry
           carry = sum / 10 ;                                 //obtaining a carry
           ListNode node = new ListNode(sum  % 10);         //obtaining the value to store it into the next node
           temp.next  = node;                                       //stored the modulus into the next node
           temp = temp.next;                                    //shifting temp to its next
       }
        while(dummy != null) {
            System.out.print(dummy.data + " --> ");
            dummy = dummy.next;
        }
        System.out.print("null");


    }

    public static void main(String[] args) {
        Lc_2 sll = new Lc_2();
        sll.pushl1(2);
        sll.pushl1(4);
        sll.pushl1(3);

        sll.pushl2(5);
        sll.pushl2(6);
        sll.pushl2(4);

        sll.Display();
        System.out.println();

        sll.addTwoLL();
    }
}

