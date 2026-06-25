class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public void dfs(int[] candidates, int i, int target, List<Integer> subset){
        int n = candidates.length;
        if(target == 0){
            ans.add(new ArrayList<>(subset));
            return;
        }

        if( i == n || target < 0 ) return;
        
        subset.add(candidates[i]);
        dfs(candidates, i+1, target - candidates[i], subset);
        subset.remove(subset.size() - 1);
        while( i<n -1 && candidates[i] == candidates[i+1]) i++;
        dfs(candidates, i+1, target, subset);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<Integer> subset = new ArrayList<>();

        Arrays.sort(candidates);
        dfs(candidates, 0, target, subset);

        return ans;
        
    }
}
