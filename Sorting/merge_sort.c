#include <stdio.h>
#include <stdlib.h>

void mergesort(int *arr,int low,int mid,int high)
{
    int size = high+1;
    int *temp = (int *)malloc(size*sizeof(int));
    int i = low;
    int j = mid+1;
    int k = low;
    while(i<=mid && j<=high)
    {
        if(arr[i]<=arr[j])
        {
            temp[k] = arr[i];
            i++;
        }
        else
        {
            temp[k] = arr[j];
            j++;
        }
        k++;
    }
    while(i<=mid)
    {
        temp[k] = arr[i];
        i++;
        k++;
    }
    while(j<=high)
    {
        temp[k] = arr[j];
        j++;
        k++;
    }
    for(i=low;i<=high;i++)
    {
        arr[i] = temp[i];
    }
}
void merge(int *arr,int low,int high)
{
    
    if(low<high)
    {
    int mid = (high+low)/2;
    merge(arr,low,mid);
    merge(arr,mid+1,high);
    mergesort(arr,low,mid,high);
    }
    
}

int main()
{
    int size,i,low, high;
    printf("Enter the size of array : ");
    scanf("%d", &size);
    int *arr;
    arr=(int *)malloc(size*sizeof(int));
    printf("Enter the elements of array : \n");
    for(i=0;i<size;i++)
        scanf("%d", &arr[i]);
    printf("The elements of the array before sortinng : \n");
     for (i=0;i<size;i++) 
     { 
        printf("%d ", arr[i]); 
     }  
    low=0; high=size-1; 
    merge(arr,low,high);
    printf("\nThe elements of the array after sortinng : \n");
     for (i=0;i<size;i++) 
     { 
        printf("%d ", arr[i]); 
     }  
     free(arr);
     return 0;
}