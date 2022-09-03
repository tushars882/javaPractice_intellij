import java.util.Stack;

public class SinglyLinkedList {

    public ListNode head;                  //instance variable holding complete list

    //as singly linked list internally contains a listnode class therefore-

    public static class ListNode{        //2 properties- data and pointer to next node
        private int data;
        private ListNode next;


        public ListNode( int data){         //this constructor will take data part
            this.data=data;
            this.next=null;

        }
    }


    //printing the list
    public void Display(){
        ListNode current=head;          //declaring a temp var pointing head
        while(current != null)
        {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }

    public void insertFirstValue(int value){
        ListNode newNode=new ListNode(value);       //here we have created a new node
        newNode.next=head;                          //here we have created a link between head and newNode's null
        head=newNode;                               //here we have given it a new head of newNode

    }



    //inserting a node in the last
    public void push(int last){
        ListNode newNode=new ListNode(last);        //made an object
        if(head==null){                             //checking if the list is empty or not
            head=newNode;                           //assigning newNode value if it is empty
            return;
        }
        ListNode current=head;                      //if not empty creating a current with head for checking the last position of list
        while(current.next!=null){
            current=current.next;                   //if next of node != null means it is not the last node and then moving current further
        }
        current.next=newNode;                       //if last node found then simply assign the node's next(pointed by current), the value of newNode
    }




    //finding length of list and printing it
    public void length(){
        if (head==null){
            System.out.println("doesn't have any element");
        }
        int count=0;
        ListNode current=head;
        while(current != null){
            count++;
            current=current.next;

        }
        System.out.println(count+" "+"are the number of elements");
    }



    //delete first node
    public void deleteFirst(){
        if(head==null){
            System.out.print("no elements to delete");
        }
        ListNode temp=head;
        head=head.next;                     //simply changing the position of head to the next node
        temp.next=null;                     //to remove the address from first node's next of head node
    }



    //insert at any position
    public void insertAtAnyPos(int value, int pos){                     //here we have defined value and position
        ListNode newNode=new ListNode(value);
        if(pos==1){                                                     //here we have checked if the position to be inserted at is 1 or other
            newNode.next=head;
            head=newNode;
        }
        else {
            ListNode prev=head;                                  //here we have assigned a new var to head for traversing till 'pos-1' as from here we have to connect the newNode
            int count=1;                                           //initialised count for the traversal of prev
            while (count < pos-1){
                prev=prev.next;
                count++;
            }
            ListNode temp=prev.next;                            //assigned a new var to the position where we have to insert value as we will later connect this to our newNode's next for linking
            newNode.next=temp;
            prev.next=newNode;

        }
    }



    public void deleteLast() {
        if (head == null || head.next == null) {
            System.out.print(head);            //we did this coz if sll has only one node then we need to simply return head
        }
        ListNode current = head;
        ListNode prev = null;             //to keep this one node behind the current
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;                 //here we have simply kept track of last node and secoond last node and haveassigned null to next of secondlast node
        System.out.println(current.data+" has been removed");

    }





    //delete at given pos
    public void deleteAny(int pos) {


        if (pos == 1) {
            ListNode extra = head;
            head = head.next;
            extra.next = null;

        } else {
            ListNode current = head;
            int count = 1;
            ListNode prev = current.next;
            while (count != pos - 1) {
                prev = prev.next;
                current = current.next;
                count++;
            }
            ListNode temp = prev.next;

            current.next = temp;

        }

    }

    //for finding that element exist in list or not
    public boolean search(int searchkey){                   //declaring boolean type as we have to return found or not
       if(head.data==searchkey){                            //if the value is found at pos=1 only
           return true;
       }
       ListNode current=head;
       while(current!=null){                                //this will run until current reaches null
           if(current.data==searchkey){
               return true;
           }
           current=current.next;
       }
       return false;
    }
    public void sort() {
        ListNode current  = head;
        ListNode prev = head.next;
        ListNode tail = null ;
        ListNode temp;
        while(prev != null) {
            if(current.data <= prev.data) {
                tail = current ;
                current = current.next;
                prev = prev.next;
            }
                if(current.data > prev.data){

                    current.next = prev.next;
                    tail.next = prev;
                    prev.next = current;
                    temp = prev;
                    prev = current;
                    current = temp;
                }


        }
    }


    //Leetcode pallendrome Linked list 284

    public boolean isPallendrome() {
        ListNode current = head;
        ListNode temp = head;
        int i = 0;
        Stack <Integer> st = new Stack<>();
        while(temp != null ) {
            st.add(temp.data);
            temp = temp.next;
        }
        int[] arr = new int[st.size()];
        int n = st.size();
        while(!st.isEmpty()){
            arr[i] = st.pop();
            i++;
        }
        for(i = 0 ; i < n ; i++ ) {
            if(current.data == arr[i]) {
                current = current.next;
            }
            else return false;
        }
        return true;
    }
    public ListNode swapInPairs(ListNode head){
        ListNode current = head;
        ListNode prev = current.next;
        ListNode ret = head;
        if(head == null){
            return null;
        }
        else if(head.next == null){
            return head;
        }
        while(prev.next != null){
            current.next = prev.next;
            prev.next = current;
            prev = current.next.next;
            current = current.next;
        }
        return head;
    }


//    public void addTwoLL() {
//        Stack<Integer> st1 = new Stack<>();
//        Stack<Integer> st2 = new Stack<>();
//
//        ListNode c1;
//        ListNode c2;
//        int i =0;
//        while( c1 != null) {
//            st1.add(c1.data);
//            c1 = c1.next;
//        }
//        while(c2 != null) {
//            st2.add(c2.data);
//            c2 = c2.next;
//
//        }
//        int[] a = new int[st1.size()];
//        int[] b = new int[st2.size()];
//        while(!st1.isEmpty()){
//            a[i] = st1.pop();
//        }
//        i = 0 ;
//        while(!st2.isEmpty()){
//            b[i] = st2.pop();
//        }
//
//        for( i = 0 ; i < a.length ; i++ ){
//            System.out.print(a[i]+" ");
//        }
//        for(i = 0 ; i < b.length ; i++) {
//            System.out.print(b[i] + " ");
//        }
//
//
//    }









    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();            //made an object of the class
//        sll.head=new ListNode(10);
//        ListNode second=new ListNode(12);                   //here we are creating nodes
//        ListNode third=new ListNode(77);
//        ListNode fourth= new ListNode(1);
//
//        sll.head.next=second;           //here as the whole list is contained by the head so we need not to keep the other nodes in sll only head is enough
//        second.next=third;
//        third.next=fourth;
//        fourth.next=null;



//        sll.push(21);
//        sll.push(31);
//        sll.push(72);
//        sll.push(3);

//        sll.push(1);
//        sll.push(22);
//        sll.push(2);
//        sll.push(66);
//        sll.push(9);
//        sll.push(1);
//        sll.push(7);
        sll.push(1);
        sll.push(2);
        sll.push(3);
        sll.push(4);
//        sll.push(1);

        sll.Display();






//        System.out.println(sll.isPallendrome());

//        sll.Display();





//        sll.insertFirstValue(2);                //here we have inserted value using insertFirstValue
//        sll.insertFirstValue(99);
//        sll.insertFirstValue(100);
//        sll.insertFirstValue(65);



//        sll.length();
//        sll.deleteFirst();

//        sll.insertAtAnyPos(54,3);
//        sll.insertAtAnyPos(72,4);


//        sll.deleteLast();
//        sll.deleteAny(3);



        //calling the function searckey
//        if (sll.search(112)) {                      //here if the entered element is present in the list it will return true else false giving else statement
//            System.out.println("found!!");
//        }
//        else {
//            System.out.println("Not found---");
//        }





    }

}







