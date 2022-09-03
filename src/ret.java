public class ret {
    public int sum(int x, int y){
        return(x+y);
    }
    public int sum(int x,int y,int z){
        return (x+y+z);
    }

    public static void main(String[] args) {
        ret s=new ret();
        System.out.print(s.sum(5,3));
    }
}
