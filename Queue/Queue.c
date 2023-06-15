#include<stdio.h>
#include<stdlib.h>
# define size 10
typedef struct{
    int data[size];
    int front; 
    int rear;
}Queue;
void initialize(Queue *queue)
{
    queue->front = queue->rear = -1;
}
int isempty(Queue *queue)
{
    return queue->front==-1;
}
int isfull(Queue *queue)
{
    return queue->rear==size-1;
}
void enqueue(Queue *queue,int value)// insert in queue 
{
    if(isfull(queue))
    {
        printf("Queue is full\n");
        return;
    }
    else if(isempty(queue))
    {
        queue->front=queue->rear = 0;
        queue->data[queue->rear] = value;
        printf("%d  value is inserted in queue\n",value);
        return;
    }
    queue->rear++;
    queue->data[queue->rear] = value;
    printf("%d  value is inserted in queue\n",value);

}
void dequeue(Queue *queue)
{
    if(isempty(queue))
    {
        printf("Queue is empty\n");
        return;
    }
    int value = queue->data[queue->front];
    printf("%d is deleted from the queue\n",value);
    if (queue->front==queue->rear)
    {
        queue->front = queue->rear = -1;
    }
    else
    {
        queue->front++; 
    }
}
void display(Queue *queue)
{
    if(isempty(queue))
    {
        printf("Queue is empty\n");
        return;
    }
    int i;
    for(i=queue->front;i<=queue->rear;i++)
    {
        printf("%d ",queue->data[i]);
    }
    printf("\n");
}
int main()
{
    Queue queue;
    initialize(&queue);
    enqueue(&queue,1);
    enqueue(&queue,2);
    enqueue(&queue,3);
    enqueue(&queue,4);
    enqueue(&queue,5);
    enqueue(&queue,6);
    enqueue(&queue,7);
    enqueue(&queue,8);
    enqueue(&queue,9);
    display(&queue);
    dequeue(&queue);
    dequeue(&queue);
    dequeue(&queue);
    dequeue(&queue);
    dequeue(&queue);
    display(&queue);

}