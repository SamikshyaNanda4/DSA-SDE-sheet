class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[]ans={-1,-1};
        //check for first occurence of target
        int start=search(nums, target, true);
        int end=search(nums, target, false);

        ans[0]=start;
        ans[1]=end;
        return ans;
    } 
    //this function returns the index value of target
    int search(int []nums, int target,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }else if(target<nums[mid]){
                end=mid-1;
            }else{
                ans = mid;
                if(findStartIndex==true){
                    end=ans-1;
                }else{
                    start=ans+1;
                };
            }
        }
        return ans;
     }
}
