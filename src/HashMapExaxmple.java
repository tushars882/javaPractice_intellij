import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapExaxmple {
    static void ex(){
        int ar[] = new int[]{2,5,3,11,42,11,24,54};
        HashMap<Integer , Integer> mp = new HashMap<>();

        HashMap<String , Integer> mp2 = new HashMap<>();

        for(int i = 0 ; i < ar.length ; i++) {
            mp.put(ar[i], i);
        }

        mp2.put("India" , 250);
        mp2.put("china" , 350);
        mp2.put("Usa" , 200);
        mp2.put("India" , 211);
        mp2.put("India" , 150);

        if(mp2.containsKey("India")){
            System.out.println(mp2.get("India"));
        }
        System.out.println(mp2);

//        System.out.println( "key of 11 is "+mp.get(11));

        //for printing the key , value according to you

        Set<String> keys = mp2.keySet();
        System.out.println(keys);

        //provides all the keys present
        for(String key : keys){
            Integer val = mp2.get(key);
            System.out.print(val +" ");
        }


    }

    static void maxFrequency(){
        String str = new String("adaedvsav");
        HashMap<Character , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(hm.containsKey(ch)){
                int oldFreq = hm.get(ch);
                int newFreq = oldFreq + 1 ;
                hm.put(ch,newFreq);
            }
            else{
                hm.put(ch , 1);
            }
        }
        char maxFreq = str.charAt(0);
        for(Character key : hm.keySet()){
            if(hm.get(maxFreq) < hm.get(key)){
                maxFreq = key;
            }
        }
        System.out.println(maxFreq + " " + hm.get(maxFreq));
    }


    static boolean ransomNote(){
        HashMap<Character , Integer> magazine = new HashMap<>();
        HashMap<Character , Integer> ransom = new HashMap<>();
        String mg = new String("baa");
        String rn = new String("a");
        for(int i = 0 ; i < mg.length(); i++){
            char ch = mg.charAt(i);
            if(magazine.containsKey(ch)){
                int of = magazine.get(ch);
                int nf = of + 1;
                magazine.put(ch , nf);
            }
            else{
                magazine.put(ch , 1);
            }
        }
        for(int i = 0 ; i < rn.length() ; i++){
            char ch = rn.charAt(i);
            if(ransom.containsKey(ch)){
                int of = ransom.get(ch);
                int nf = of + 1;
                ransom.put(ch,nf);
            }
            else{
                ransom.put(ch , 1);
            }
        }
        for(char c : rn.toCharArray()){
            if(magazine.containsKey(c) == false){
                return false;
            }
            int count = magazine.get(c);
            if(count == 0){
                return false;
            }
            magazine.put(c , count-1);
        }
        return  true;
    }
    public static void main(String args[]){
//        ex();
//        maxFrequency();
        System.out.println(ransomNote());    }
}
