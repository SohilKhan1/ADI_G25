package Lecture9;

public class CombinationSumII {
//	class Solution {
//	    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//	        List<List<Integer>> result = new ArrayList<>();
//	          Arrays.sort(candidates);
//	        
//	        backtrack(candidates,target,result,new ArrayList<>(),0,0);
//	        
//	        return result;
//	    }
//
//	    public static void backtrack(int [] candidates,int target, List<List<Integer>> result,
//	    List<Integer>curr ,int sum , int start ){
//
//	        // base case
//	        if(sum > target ) return;
//	        if(sum == target){
//	            result.add(new ArrayList<>(curr));
//	            return;
//	        }
//	        
//
//	        for(int i = start; i < candidates.length; i++){
//	           if(i > start && candidates[i] == candidates[i-1]) continue;
//	           if(candidates[i] > target) break;
//
//	            curr.add(candidates[i]);
//	            backtrack(candidates, target, result , curr , sum + candidates[i],i+1);
//	            curr.remove(curr.size()-1);
//	        }
//	        
//	    }
//	}
}
