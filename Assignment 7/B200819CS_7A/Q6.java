// package Assign7A;

import java.util.Scanner;

class EmptyQueueException extends Exception{
    EmptyQueueException(String s){
        super(s);
    }
}

class Queue{
    int[] arr;
    int front;
    int rear;
    int size;
    Queue(int n){
        arr = new int[n];
        front = -1;
        rear = -1;
        size = n;
    }
    void enqueue(int x){
        if(front==-1 && rear==-1){
            front = 0;
            rear = 0;
            arr[rear] = x;
        }
        else if((rear+1)%size==front){
            System.out.println("Queue is full");
        }
        else{
            rear = (rear+1)%size;
            arr[rear] = x;
        }
    }
    int dequeue() throws EmptyQueueException{
        if(front==-1 && rear==-1){
            throw new EmptyQueueException("Queue is empty");
        }
        else if(front==rear){
            int x = arr[front];
            front = -1;
            rear = -1;
            return x;
        }
        else{
            int x = arr[front];
            front = (front+1)%size;
            return x;
        }
    }
}
public class Q6 {
    public static void main(String[] args){
        Queue queue = new Queue(1000);
        Scanner scn = new Scanner(System.in);
        //continuously take input from user until enter is pressed
        while(true){
            String s = scn.nextLine();
            if(s.equals("")) break;
            String[] arr = s.split(" ");
            if(arr[0].equals("E")){
                queue.enqueue(Integer.parseInt(arr[1]));
            }
            else if(arr[0].equals("D")){
                try{
                    System.out.println(queue.dequeue());
                }
                catch(EmptyQueueException e){
                    System.out.println(e);
                }
            }
        }
    }
}
