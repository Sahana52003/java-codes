 class LinearSearch {
    public static void main(String[] args) {
        int[] nums={23,45,1,2,8,19,-3,16,-11,13};
        int target=19;
        int ans= linearSearch1(nums,target);
         System.out.println(ans);
         int ans2=linearSearch2(nums, target);
         System.out.println(ans2);
         boolean ans3=linearSearch3(nums, target);
         System.out.println(ans3);
    }
   static int linearSearch1(int[] nums,int target){
        if(nums.length==0){
            return -1;
        }
        for(int index=0;index<nums.length;index++){
            int ele=nums[index];
            if(ele==target){
                return index;
            }
        }
        return -1;
    }
//Search target and return element
static int linearSearch2(int[] nums,int target){
        if(nums.length==0){
            return -1;
        }
        for(int ele:nums){
            if(ele==target){
                return ele;
            }
        }
        return -1;
    }
    //sarch target and return boolean
static boolean linearSearch3(int[] nums,int target){
    if(nums.length==0){
        return false;
    }
    for(int ele:nums){
        if(ele==target){
            return true;
        }
    }
    return false;
}
 }