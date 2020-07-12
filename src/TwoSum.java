import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static int[]  numsarr = {2,7,11,15};
    static int targetVal = 9;


    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumBruteForce(numsarr,targetVal)));
        System.out.println(Arrays.toString(twoSumExtraSpace(numsarr,targetVal)));
        System.out.println(Arrays.toString(twoSumSlidingWindow(numsarr,targetVal)));
    }



    public static int[] twoSumExtraSpace(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap();
        Integer secondNum = 0;
        for(int i=0; i<nums.length; i++) {
            secondNum = target - nums[i];
            if(hm.containsKey(secondNum))
                return new int[]{hm.get(secondNum), i};
            else
                hm.put(nums[i],i);
        }
        return new int[]{};
    }

    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i=0;i<nums.length-1;i++){
            int secondIndexNum = target - nums[i];
            for(int j=i+1;j<nums.length;j++)
                if (secondIndexNum == nums[j])
                    return new int[]{i,j};
        }

        return new int[]{};

    }
    public static int[] twoSumSlidingWindow(int[] nums, int target) {

        int j=nums.length-1, i=0;
        while (i<j){
            if(target>nums[j] ) {
                if(target-nums[j] == nums[i])
                    return new int[]{i,j};
                i++;
            }
            else {
                j--;
            }

        }
        return new int[]{};

    }
}
