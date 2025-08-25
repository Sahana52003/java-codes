public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        int target=14;
        System.out.println(linearsearch(arr,target,1,5));
    }
    static int linearsearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int index=start;index<=end;index++){
            int ele=arr[index];
            if(ele==target){
                return index;
            }
        }
        return -1;
    }
}

