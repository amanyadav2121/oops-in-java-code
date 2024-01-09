//4.Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;
public class q4 {
    public static void circumference(int rad) {
        int c=(int) (2*(3.14)*rad);
        System.out.println(c);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rad=sc.nextInt();
        circumference(rad);

    }
}
