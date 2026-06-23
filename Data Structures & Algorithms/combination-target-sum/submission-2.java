class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void dfs(int[] nums, int i, int target, List<Integer> subset) {
        if (target == 0) {                       // success
            ans.add(new ArrayList<>(subset));
            return;
        }
        if (i == nums.length || target < 0) {    // dead end / out of bounds
            return;
        }

        // Branch 1: pick nums[i], stay at i (reuse allowed)
        subset.add(nums[i]);
        dfs(nums, i, target - nums[i], subset);
        subset.remove(subset.size() - 1);        // backtrack

        // Branch 2: skip nums[i], move to i+1
        dfs(nums, i + 1, target, subset);
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> subset = new ArrayList<>();
        dfs(nums, 0, target, subset);
        return ans;
    }
}