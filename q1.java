//Enter 3 numbers from the user & make a function to print their average.
import java.util.Scanner;
public class q1{
    public static int calculateAverage(int a, int b, int c){
        int x=((a+b+c)/3);
        return x;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(calculateAverage(a, b, c));
    }
}