import java.time.temporal.ChronoField;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class lc_383_ransomNote {
    static boolean canConstruct(String ransomNote , String magazine) {
//
//        HashSet<Character> rn = new HashSet<>();
//        HashSet<Character,> mg = new HashSet<>();
//
//        char[] c1 = ransomNote.toCharArray();
//        char[] c2 = magazine.toCharArray();
//        for(int i = 0 ; i < c1.length ; i++) {
//            rn.add(c1[i]);
//        }
//        for(int i= 0 ; i < c2.length; i++ ){
//            mg.add(c2[i]);
//        }
//        mg.toString();
//        rn.toString();
//        String s = "";
//        String t = "";
//        for (Character n:mg)
//            s+= n;
//        char[] m = s.toCharArray();
//
//        for(Character n : rn){
//            t+=n;
//        }
//        char[] r = t.toCharArray();
//        int count = 0;
//        for(int i = 0 ; i<m.length ; i++){
//            for(int j = 0 ; j < r.length; j++){
//                if(r[j] == m[i]){
//                    count++;
//                    break;
//                }
//            }
//        }
//        if(count == r.length){
//            return true;
//        }
//        return false;
////        System.out.println(mg);


//a    b


        Stack <Character> st = new Stack<>();
        char[] rn = ransomNote.toCharArray();
        char[] mg = magazine.toCharArray();

        for(int i = 0 ; i < mg.length ; i++){
            st.add(mg[i]);
        }
        int len = rn.length;
        int count = 0 ;
        while(!st.isEmpty()){
            for(int i = 0 ; i < mg.length ; i++){
                for(int j = len-1 ; j >= 0 ; ){
                    if(!st.isEmpty() && rn[i] == st.peek() ){
                        count++;
                        st.pop();
                        len--;
                    }
                    else if (!st.isEmpty() && st.peek() != rn[i] ){
                        st.pop();
                        j++;
                    }
                    else{
                        st.pop();
                    }
                }

            }
        }
        if(count == rn.length){
            return  true;
        }
        return  false;

    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
    }
}
