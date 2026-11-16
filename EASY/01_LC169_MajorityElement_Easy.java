import java.util.HashMap;
import java.util.Map;

class LC169_MajorityElement_Easy {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            int count = counts.getOrDefault(num, 0) + 1;
            if (count > nums.length / 2) {
                return num;
            }
            counts.put(num, count);
        }
        return nums[0];
    }
}
