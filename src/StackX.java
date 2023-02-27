import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class StackX {

    private int top; // This is the indicator of the index of the top most item
    private int maxSize; // To define the stack array size
    private double stackArray[]; // To store value

    public StackX(int maxSize){
        this.maxSize = maxSize;
        top = -1;
        stackArray = new double[maxSize];
    }

    //After successful push
    //  *top +1;
    //  the new item must be stored in the top index of the stackArray
    //reasons for an unsuccessful push
    //   stackArray is full
    public boolean isFull(){
        if(maxSize == top+1)
            return true;
        else
            return false;
    }

    public void push(double newElement){
        if(!isFull()){
            top ++;
            stackArray[top] = newElement;
        }
        else
            System.out.println("Stack is full");
    }

    //After successful pop
    // return the top value by using temp
    //  *top -1;
    //Reason for unsuccessful pop
    //  stackArray is empty
    // top = -1

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else
            return false;
    }

    public double pop(){
        if(!isEmpty()){
            int temp = top;
            top --;
            return
                    stackArray[temp];
        }
        else
            return
            -99;
    }

    public double peek(){
        if(!isEmpty()){
            return

                    stackArray[top];
        }
        else
            return
            -99;
    }

    public void Display(){
        for (int i = 0; i<= top; i++){
            System.out.println("Value is "+ stackArray[i]);
        }
    }
}
