public class maxsubarray {
    static void maxsubarray(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum=currsum+arr[k];
                }
                System.out.println(currsum);
                if(currsum>maxsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("max sum ="+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        maxsubarray(arr);
    }
}
