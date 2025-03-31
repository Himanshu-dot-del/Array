public class sellandbuystocks {
    static int stocks(int prices[]){
        int n=prices.length;
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<n;i++){
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(profit, maxprofit);

            }
            else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(stocks(prices));
    }
}
