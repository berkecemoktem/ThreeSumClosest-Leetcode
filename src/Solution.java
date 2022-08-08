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