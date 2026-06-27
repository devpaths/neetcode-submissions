class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> data = new HashSet<>();                                    
         for(int i : nums){
            data.add(i);
         }
         if(data.size()<nums.length)
         {
            return true;
         }
        return false;
    }
}