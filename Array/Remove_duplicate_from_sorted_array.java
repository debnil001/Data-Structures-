//remove the duplicateitems from the sorted array
import java.util.*;
public class Remove_duplicate_from_sorted_array{
    public static int remove_duplicate(int[] nums)
    {
        if (nums.length==0)
            return 0;
        HashSet<Integer>set = new HashSet<>();
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
                continue;
            else
            {
                set.add(nums[i]);
                nums[k]=nums[i];
                k++;
            }    
        }
        return k;
    }
    public static void main(String[] args)
    {
        int[] nums={1,1,2,2,2,3,3,3,3,3,3,4,4,4,4,4,5,5};
        int k=remove_duplicate(nums);
         for(int i=0;i<k;i++)
        {
            System.out.println(nums[i]);
        }
        System.out.println("The number of unique elements in the set is " +(k));
       
    }
}