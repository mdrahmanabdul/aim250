import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(hm.containsKey(complement)){
                return new int[]{hm.get(complement),i};
            }else{
                hm.put(nums[i],i);
            }
        }return new int[]{};
    }
}
public class problem1
{
    
	public static void main(String[] args) {
	    Solution s = new Solution();
	    int []result = s.twoSum(new int []{2,7,11,15},9);
        System.out.print("index1 : "+result[0]+" index2 : "+result[1]);
	}
}
