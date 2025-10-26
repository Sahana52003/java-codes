public class InfiniteSize {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,8,10,11,12,15,20,23,30};
        int target=10;
        System.out.println(searchingInInfiniteArray(arr, target));
    }

    public static int searchingInInfiniteArray(int[] arr,int target) {
        //First taking start and end to be 0 and 1 as it's an infinite array and we don't know the end.
        int start=0,end=1;
        //Now we will just get the chunks and check target lies in which chunk
        while(arr[end]<target){
            //Increase the size
            int newStart = end+1;
            //Doubling the end size = end = end+sizeOfend()*2
            end = end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    
    //Applying binary Search to that chunk
    public static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = (start+(end-start)/2);
            if(target>arr[mid]){
                start = mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}