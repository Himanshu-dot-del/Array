public class kadansalgo {
    static void maxsum(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currsum=currsum+arr[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(currsum, maxsum);
        }
        System.out.println("max sum is ="+maxsum);

    }
    public static void main(String[] args) {
        int arr[]={-2,-3,-4,-1,-2,-1,-5,-3};
        maxsum(arr);
    }
}
 
//MAXSUBARRAY IF ALL VALUE IN ARRAY ARE NEGATIVE

// public class kadansalgo{
//     static void maxsum(int arr[]){
//         int currsum=0;
//         int maxsum=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<0){
//                 if(arr[i]>maxsum){
//                     maxsum=arr[i];
//                 }

//             }
//         }
//         System.out.println("max sum is ="+maxsum);
//     }
//     public static void main(String[] args) {
//         int arr[]={-8,-1,-10,-4,-6};
//         maxsum(arr);
//     }
// }