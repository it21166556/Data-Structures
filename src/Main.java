import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackX myStack = new StackX(5);

        System.out.println("Enter your values");
        myStack.push(sc.nextDouble());
        myStack.push(sc.nextDouble());
        myStack.push(sc.nextDouble());
        myStack.push(sc.nextDouble());
        myStack.push(sc.nextDouble());
        myStack.push(sc.nextDouble());

        myStack.Display();
        System.out.println(myStack.peek()+"\n");

        myStack.pop();
        myStack.pop();

        myStack.Display();
        System.out.println(myStack.peek());


    }
}