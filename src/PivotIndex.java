import java.util.Arrays;
import java.util.Collections;

class PivotIndex {
    public int pivotIndex(int[] nums) {
        int left=0, sum=0;
        for(int item: nums){
            sum+=item;
        }
        for(int i=0;i<nums.length;i++){
            if(i!=0)
                left +=nums[i-1];
            if(sum - left - nums[i] == left)
                return i;
        }
        return -1;
    }

    public int dominantIndex(int[] nums) {
        int largest = nums[0];
        int index = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]>largest){
                largest = nums[j];
                index = j;
            }
        }
//        System.out.println(largest);
        for(int i=0;i<nums.length;i++){
            if(!(nums[i] * 2 <= largest)&& nums[i]!=largest)
                return -1;
        }
        return index;
    }

    public static void main(String[] args) {
        PivotIndex solution = new PivotIndex();
//        int[] nums = {-1,-1,-1,0,1,1};
//        System.out.println(solution.pivotIndex(nums));

        int[] nums1 = {0,0,1,2};
        System.out.println(solution.dominantIndex(nums1));
    }
}