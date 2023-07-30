//Given an integer array nums of unique elements, return all possible subsets(the power set).The solution set must not contain duplicate subsets. Return the solution in any order.
//Input: nums = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
//import java.util.*;
import java.util.ArrayList; 
public class Print_subsequences {
    public static void subsets(int index, int array[],ArrayList<Integer>subset,ArrayList<ArrayList<Integer>> final_list)
    {
        if(final_list.contains(subset)) return;
        if(index==array.length){
            final_list.add(new ArrayList<>(subset));
            return;
        }    
        subsets(index+1,array,subset,final_list);
        subset.add(array[index]);
        
        subsets(index+1,array,subset,final_list);
        subset.remove(subset.size()-1);
    }
    
    public static  ArrayList<ArrayList<Integer>> printF(int [] array){
        ArrayList<ArrayList<Integer>> final_list=new ArrayList<ArrayList<Integer>>();
        subsets(0,array,new ArrayList<Integer>(),final_list);
        return final_list;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3};
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        result=printF(arr);
        System.out.println(result);
    }
}
