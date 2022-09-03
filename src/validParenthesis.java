//public class validParenthesis {
//
////    for parenthesis which are not in order
//    static boolean inp(String str) {
//        int p1 = 0;
//        char ch;
//        int p2 = 0;
//        int p3 = 0;
//        int length = str.length();
//
//
//       for(int i = 0 ; i<length ; i++) {
//           if((str.charAt(i) == '(' )) {
//               p1++;
//           }
//           if((str.charAt(i) == '{' )) {
//               p2++;
//           }
//           if((str.charAt(i) == '[' )) {
//               p3++;
//           }
//           if((str.charAt(i) == ')' )) {
//               p1--;
//           }
//           if((str.charAt(i) == '}' )) {
//               p2--;
//           }
//           if((str.charAt(i) == ']' )) {
//               p3--;
//           }
//       }
//       if( p1 == 0 && p2 == 0 && p3 == 0) {
//           return true;
//       }
//       else return false;
//
//    }
//        public static void main (String args[]){
//            System.out.println(inp("{[()}]"));
//        }
//}


//for parenthesis with are in order

import java.util.Stack;

public class validParenthesis{
    static boolean inp(String str){
        Stack<Character> st = new Stack<>();
        char[] ch = str.toCharArray();
        for(int  i = 0 ; i < str.length() ; i++) {
            if( ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
                st.push(ch[i]);
            }
            else if( ch[i] == ')' && !st.isEmpty() && st.peek() == '('){
                st.pop();
            }

            else if( ch[i] == '}' && !st.isEmpty() && st.peek() == '{'){
                st.pop();
            }

            else if( ch[i] == ']' && !st.isEmpty() && st.peek() == '['){
                st.pop();
            }
            else{
                return false;
            }
        }
       return st.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(inp("([}}])"));
    }
}

