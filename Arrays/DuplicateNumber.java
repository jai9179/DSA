// Find the Duplicate Number
// Example 1:

// Input: nums = [1,3,4,2,2]
// Output: 2
// Example 2:

// Input: nums = [3,1,3,4,2]
// Output: 3

public class DuplicateNumber {
    public static void main(String[] args){
        int arr[] = {3,1,3,4,2};
        int result = findDuplicate(arr);
        System.out.println(result);
    }

    public static int findDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        // if(nums[i]==nums[i-1]){
        // return nums[i];
        // }
        // }
        // return -1;

        // Time Complexity: O(n log n)
        // Space Complexity: O(1)

        // HashSet<Integer> set = new HashSet<>();
        // for(int num : nums){
        // if(set.contains(num)){
        // return num;
        // }
        // set.add(num);
        // }
        // return -1;

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];

        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }
}
