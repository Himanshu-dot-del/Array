// public class prefixsum {
//     static int[] prefix(int arr[]){
//         for(int i=1;i<arr.length;i++){
//             arr[i]=arr[i-1]+arr[i];
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,-2,6,-1,3};
//         int ans[]=prefix(arr);
//         for(int i=0;i<ans.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
    
// }

// MAXSUBARRAY USING PREFIXSUM

public class prefixsum{
    static void maxsubarray(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
              
            currsum= i==0 ? prefix[j]:prefix[j]-prefix[i-1];
            if(currsum>maxsum){
                maxsum=currsum;
            }
                
            }
        }
        System.out.println("max sum is ="+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxsubarray(arr);
    }
}