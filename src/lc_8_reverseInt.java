import java.sql.Struct;
import java.util.Stack;

public class lc_8_reverseInt {
    static int inp(int x){
        String str = String.valueOf(x);
        String rev = "";
        Stack<Character> st  = new Stack<>();
        char[] ch = str.toCharArray();


        for(int i = 0 ; i < str.length() ; i++){
            ch[i] = str.charAt(i);
            st.add(ch[i]);
        }
        int len = str.length();
        if(x < 0)
            len--;

        for(int i = 0 ; i < len; i++){
            if(!st.isEmpty()) {
                rev += st.pop();
            }

        }
        if(!rev.equals(""))
        {
            if(x < 0)
                return -1 * Integer.parseInt(rev);
            else
                return Integer.parseInt(rev);
        }
        return x;
//
//        char[] ch2 = new char[ch.length];
//        String str2 = new String();
//
//        for(Character c : ch){
//            System.out.print(c);
//        }
//        char neg = 'a';
//        for(int i = 0 ; i < ch.length ; i++){
//            if(st.peek() != 'a'){
////                neg = ch[i];
//                ch2[i] = st.pop();
//            }
//            else{
//                neg = ch2[i];
//            }
//        }
//        System.out.println();
//        if(neg == 'a'){
//            for(int i = 0 ; i < ch2.length ; i++){
//                System.out.print(ch2[i]);
//            }
//        }
//        else{
//            for(int i = 0 ; )
//        }
//        if(x < 0){
//            str2 = ch2.toString();
//            System.out.print("-"+str2);
//        }



    }

    public static void main(String[] args) {
        System.out.println(inp(1534236469));
    }
}
