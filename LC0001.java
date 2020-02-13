import java.util.*;

public class LC0001 {
  public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    Map<Integer,Integer> numsValueIdxMap = new HashMap<>();
    for(int i = 0; i < nums.length; i ++) {
        int currentNumber = nums[i];
        if (numsValueIdxMap.containsKey(target - currentNumber)) {
            result[0] = numsValueIdxMap.get(target - currentNumber);
            result[1] = i;
            break;
        } else {
            numsValueIdxMap.put(currentNumber, i);
        }
    }
    return result;
  }
}