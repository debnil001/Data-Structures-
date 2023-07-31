import java.util.List;
import java.util.ArrayList;
public class combination_sum {
    public static void find_combination(int index,int arr[],List<List<Integer>>final_list,List<Integer>lst,int target)
    {
        if(index==arr.length) // base condition
        {
            if(target==0)
                final_list.add(new ArrayList<>(lst)); //add the sublist to the final list
            return;    
        }
        if(arr[index]<=target)   //code for picking the element
        {
            lst.add(arr[index]);
            // it'll be not working if we write target=target-arr[index]
            find_combination(index, arr, final_list, lst, target-arr[index]);   
            lst.remove(lst.size()-1);
        }

        find_combination(index+1, arr, final_list, lst, target);
    }
    public static List<List<Integer>> combine(int arr[],int target) {
        List<List<Integer>> final_list = new ArrayList<>();
        find_combination(0,arr, final_list,new ArrayList<>(),target);
        return final_list;
    }
   public static  void main(String[] args)
   {
    int arr[]={2,3,6,7};
    List<List<Integer>>result=new ArrayList<>();
    result=combine(arr,7);
    System.out.println(result);
   } 
}
