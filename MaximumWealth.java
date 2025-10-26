//https://leetcode.com/problems/richest-customer-wealth/
class MaximimWealth{
    public static void main(String[] args) {
        System.out.println(maximimWealth(new int[][]{{1,2,3},{3,2,1}}));
    }
    static int maximimWealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int sum=0;
            for(int account=0;account<accounts[person].length;account++){
                sum+=accounts[person][account];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
} 