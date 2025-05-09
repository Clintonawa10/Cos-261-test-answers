import java.util.Scanner; //importing the Scanner class
public class evenOrOdd {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); //Creates the Scanner class input
        System.out.print("Enter a number: ");
        int num = input.nextInt();  //to enter a number
        System.out.println(num % 2 == 0 ? "The number is Even" : "The number is Odd");
        //to show if the number is even or odd
    }
}
