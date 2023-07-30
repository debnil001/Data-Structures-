import java.util.ArrayList;
public class Swap_array_elements_using_recursion {
    public static void swap_recursion(int i ,ArrayList<Integer>list,int j) {
        if(i>=j)
            return;
        int Start=list.get(i); 
        list.set(i,list.get(j));
        list.set(j,Start);
        swap_recursion(i+1,list,j-1);
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int num:arr){
            list.add(num);
        }
        System.out.println(" The array is " + list);
        swap_recursion(0,list,list.size()-1);
        System.out.println(" The reversed array is "+list);
    }
}