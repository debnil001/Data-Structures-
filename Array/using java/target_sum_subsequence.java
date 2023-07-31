import java.util.ArrayList;
public class target_sum_subsequence {
    public static void subs(int index,int arr[],ArrayList<Integer>subl,ArrayList<ArrayList<Integer>>final_lst,int target,int sum)
    {
        
        if(index==arr.length)
        {
            if(sum<=target)
                {
                    final_lst.add(new ArrayList<Integer>(subl));
                    return;
                }
            return;    
        }
        subl.add(arr[index]);
        sum+=arr[index];
        subs(index+1,arr,subl,final_lst,target,sum);
        sum-=arr[index];
        subl.remove(subl.size()-1);
        subs(index+1,arr,subl,final_lst,target,sum);
    }
    public static ArrayList<ArrayList<Integer>> printS(int arr[],int target)
    {
        ArrayList<ArrayList<Integer>> final_lst=new ArrayList<ArrayList<Integer>>();
        subs(0,arr,new ArrayList<Integer>(),final_lst,target,0);
        return final_lst;
    }
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>>result = new ArrayList<ArrayList<Integer>>();
        int arr[]={3,5,6,7};
        result=printS(arr,9);
        System.out.println(result);
    }
}
