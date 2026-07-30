class Solution {
    public int[] twoSum(int[] nums, int target) {
        int complement = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if(map.containsKey(complement)) {
                if (map.get(complement) < i) {
                    return new int[] {map.get(complement), i};
                } else {
                    return new int[] {i, map.get(complement)};
                }   
            } else {
                map.put(nums[i], i); 
            }
        }
        return new int[] {}; 
    }
}
