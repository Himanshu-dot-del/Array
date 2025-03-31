public class binarysearch {
    static int binary(int arr[],int key,int l,int h){
while(l<=h){
        int mid=(l+h)/2;
        if(key==arr[mid]){
            return mid;
        }
        else if(key<arr[mid]){
            h=mid-1;
        }
        else{
            l=mid+1;
        }
    }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        int key=12;
        int ans=binary(arr, key,0,arr.length);
        System.out.println(ans);
    }
}
