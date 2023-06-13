//Insertion Sorting
#include <stdio.h>
#include <stdlib.h>
void insert_sorting(int *arr, int len)
{
    int i, j,key;
    for (i = 1; i < len; i++)
    {
        key=arr[i];
        j=i-1;
        while(j>=0 && arr[j]>key)
        {
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=key;
    }
}
int main()
{
    int size,i;
    printf("Enter the size of array : ");
    scanf("%d", &size);
    int *arr;
    arr=(int *)malloc(size*sizeof(int));
    printf("Enter the elements of array : ");
    for(i=0;i<size;i++)
    {
        scanf("%d", &arr[i]);
    }
    insert_sorting(arr,size);
    printf("Sorted array : ");
    for(i=0;i<size;i++)
    {
        printf("%d ", arr[i]);
    }
} 