public class MaxWealth {
   public static void main(String[] args) {
   int[][] arr={{1,2,3},{3,2,1}};
   System.out.println(maximumWealth(arr));
   }
   public static int maximumWealth(int[][] accounts) {
    int ans=Integer.MIN_VALUE;
    for (int[] account2 : accounts) {
        int sum=0;
        for (int element : account2) {
            sum+=element;
        }
        if(sum>ans){
            ans=sum;
        }
    }
    return ans;
   }
}
