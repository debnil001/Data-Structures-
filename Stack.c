//Stack implementation using array
#include<stdio.h>
#include<stdlib.h>

int main ()
{
    int n,i,choice,done=0;
    int top=-1;
    printf("Enter the size of the array : ");
    scanf("%d",&n);
    int *arr;
    arr=(int*)malloc(n*sizeof(int));// allocate the memory
    while(1)
    {
    printf("\n Enter 1 for push() \n Enter 2 for pop() \n Enter 3 for peek() \n Enter 4 for display the stack\n Enter 5 for exit() \n"); 
    scanf("%d",&choice);   
    switch(choice)
    {
        case 1:
                    if(top==n-1)
                    {
                        printf("\n Stack is full , Overflowed \n");
                    }
                    else
                    {
                    printf("Enter the element to be pushed : ");
                    scanf("%d",&arr[++top]);
                    }
                    break;
        case 2:
                    if(top==-1)
                    {
                        printf("Stack is empty \n");
                    }
                    else
                    {
                        printf("Popped element is : %d \n",arr[top--]);  
                    }
                    break;
        case 3:
                    if(top==-1)
                    {
                        printf("Stack is empty \n");
                    }
                    else
                    {
                        printf("Peeked element is : %d \n",arr[top]);
                    }
                    break;
         case 4: if(top==-1)
                            { printf("\nThe stack is empty\n"); }
                        else{
                            for(int j=0; j<=top; j++)
                            {
                                printf("%d ",arr[j]);
                            }
                        } 
                        break;
        case 5: printf("Thanks");done=1;break;          
    }
    if (done==1)
        break;  
    
    }
}    