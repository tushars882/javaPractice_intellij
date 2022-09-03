public class mult_dim_arr {

    public static void main(String[] args) {
        int arr[][]= new int[2][3];
        arr[0][0]=100;
        arr[0][1]=101;
        arr[0][2]=102;
        arr[1][0]=200;
        arr[1][1]=201;
        arr[1][2]=202;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++){
                //here it will go in the length of arr[i] ,i.e., j as well

                System.out.print(arr[i][j]+" ");
            }
            System.out.print('\n');
        }


    }
}
