import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SubsetsOfGivenArray {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        subsets(nums, nums.length-1, res);
        return res;
    }
    private void subsets(int [] nums, int endIdx, List<List<Integer>> res){
        if(endIdx==-1) res.add(Collections.emptyList());
        else{
            subsets(nums, endIdx-1, res);
            List<List<Integer>> newSubsets = new LinkedList<List<Integer>>();
            for(List<Integer> subset: res){
                List<Integer> newSubset = new LinkedList<Integer>(subset);
                newSubset.add(nums[endIdx]);
                newSubsets.add(newSubset);
            }
            res.addAll(newSubsets);
        }
    }
}
