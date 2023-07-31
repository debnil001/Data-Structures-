import java.util.*;
import java.io.*;
public class Stack_using_java{
    public static void main(String[] args)
    {
        Stack<Integer> stack=new Stack<Integer>();
        int n;
        System.out.println("Enter the number of elements in the stack : " );
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the element :");
            int element=s.nextInt();
            stack.push(element);
        }
        System.out.println("The element at in the top of the stack is : "+stack.peek());
        System.out.println("The elements in the stack are : "+stack);
        for (int i=0; i<n; i++)
        {
            System.out.println("The popped element is : "+stack.pop());
        }
    }
}