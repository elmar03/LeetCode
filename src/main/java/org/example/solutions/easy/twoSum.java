package org.example.solutions.easy;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {



        Map<Integer,Integer> numsMap = new HashMap<>();

        for(int i =0; i<nums.length;i++){
            int complement = target-nums[i];

            if(numsMap.containsKey(complement)){
                return new int []{ numsMap.get(complement),i};
            }
            numsMap.put(nums[i],i);
        }

        throw new IllegalArgumentException("no match found");
    }
}
