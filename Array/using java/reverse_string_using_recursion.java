import java.util.ArrayList;
public class reverse_string_using_recursion {
    public static void swap(int i,ArrayList<Character>lst,int j) {
        if(i>=j)
            return;
        char c=lst.get(i);
        lst.set(i,lst.get(j));
        lst.set(j,c);
        swap(i+1,lst,j-1);
    }
    public static void reverseString(char[] s) {
        char copy[]=s;
        ArrayList<Character>lst=new ArrayList<Character>();
        for(char c:copy) {
            lst.add(c);
        }
        //ArrayList<Character>copY=new ArrayList<Character>();
        //copY=lst;
        swap(0,lst,lst.size()-1);
        System.out.println(lst);
        char[] chars = lst.toString().toCharArray();

        for (char i : chars){
           System.out.print(i);
        }    }   
    public static void main(String[] args){
        char s[]={'h','e','l','l','o'};
        reverseString(s);
    }
}
