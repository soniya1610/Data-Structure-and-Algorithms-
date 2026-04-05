// 26. Remove Duplicates from Sorted Array
// time complexity : O(n) because we traverse the array once.
// space complexity : O(1) because we are using in place sorting and no extra space will be used .


class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int i = 0; // Pointer for the position of the last unique element
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { // If we find a new unique element
                i++; // Move the pointer for unique elements
                nums[i] = nums[j]; // Update the position with the new unique element
            }
        }
        
        return i + 1; // The length of the array with unique elements
    }
    
}
