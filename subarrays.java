public class subarrays {
    static void subarray(int arr[]){
        //int sum=0;
        for(int st=0;st<arr.length;st++){
            for(int end=st+1;end<arr.length;end++){
                for(int k=st;k<=end;k++){

                    System.out.print(arr[k]+" ");
                    // sum=sum+arr[k];
                    // System.out.print(sum);

                }
                System.out.println();
            }
            System.out.println();
        }
    }
       public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        subarray(arr);
      
    }
}
