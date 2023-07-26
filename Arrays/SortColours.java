// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.
// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]
public class SortColours {

    public static void main(String[] args) {
        int nums[] = { 2, 0, 2, 1, 1, 0 };
        Sortcolors(nums);
        printArray(nums);
    }

    static void printArray(int arr[]) {
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void Sortcolors(int nums[]) {
        // int red=0;
        // int blue=0;
        // int white =0;

        // for(int i=0;i<nums.length;i++){
        // if(nums[i]==0){
        // red++;
        // }else if(nums[i] == 1){
        // white++;
        // }else if(nums[i] == 2){
        // blue++;
        // }
        // }
        // for(int i=0;i<red;i++){
        // nums[i]=0;
        // }
        // for(int i=red;i<red+white;i++){
        // nums[i]=1;
        // }
        // for(int i=red+white;i<nums.length;i++){
        // nums[i]=2;
        // }
        // Time complexity = O(n);
        // Space Complexity =O(1);

        // "Dutch National Flag" algorithm

        int low = 0;
        int high = nums.length - 1;
        int current = 0;

        while (current <= high) {
            if (nums[current] == 0) {
                swap(nums, current, low);
                current++;
                low++;
            } else if (nums[current] == 2) {
                swap(nums, current, high);
                high--;
            } else {
                current++;
            }
        }

    }

    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        // }
        // Time complexity = O(n);
        // Space Complexity =O(1);
    }
}
