//if we have opened a browser even then step by step we move into the browser that is select home page then our option then so on

import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();  //<> inside this we write wrapper class which is non primitive(class type)


        //adding items to stack

        st.push(10);
        st.push(20);

        //to see the item on top
        System.out.println(st.peek());
    }
}
