package main;
import java.util.Scanner;
import java.util.Random;

public class StackADT {


    private int topofStack;
    private int[] stackArray;
    private int size;

    public StackADT(int siz){
        stackArray=new int[siz];
        topofStack=-1;
        size=siz;

    }

    public void push(int element){
        if(topofStack==size){

            System.out.println("STACK IS FULL");
        }
        else{
            topofStack++;
            stackArray[topofStack]=element;
        }
    }

    public int pop(){
        int response=0;
        if(topofStack!=-1){
            response=stackArray[topofStack];
            topofStack--;
        }
        else
        {
            System.out.println("Stack is Empty");
        }
        return response;
    }

    public void display(){
        int temp=topofStack;
        while(temp!=-1){
            System.out.println(stackArray[temp]);
            temp--;
        }
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter size of Stack u wanna fix");
        int range=scan.nextInt();
        StackADT obj=new StackADT(range);
        Random rand=new Random();
        for (int i = 0; i < range; i++) {
            int n=rand.nextInt(50);
            obj.push(n);
        }
        obj.display();
    }

}
