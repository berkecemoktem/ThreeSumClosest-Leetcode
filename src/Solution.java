/*Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int closest = Integer.MAX_VALUE;

        int diffMax = Integer.MAX_VALUE;

        int value =Integer.MAX_VALUE;
        // Arrays.sort(nums);

        for(int i = 0 ; i < nums.length-2 ; i++){

            for(int j = i+1 ; j < nums.length-1 ; j++){

                for(int k = j+1 ; k < nums.length ; k++){

                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == target){
                        return sum;
                    }
                    else{
                        int diff = Math.abs(target - sum);
                        diffMax = Math.min(diffMax, diff);
                        if(diff == diffMax){
                            closest = sum;
                        }

                    }

                }


            }

        }
        return closest;
    }
}