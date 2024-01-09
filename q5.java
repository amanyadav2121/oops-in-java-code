/*Q5-Write a function that takes in age as input and returns 
if that person is eligible to vote or not. 
A person of age > 18 is eligible to vote.*/
import java.util.Scanner;
public class q5 {
    public static void eligbilityForVote(int age) {
        if(age>=18){
            System.out.println("eligble to give vote");
        }
        else{
            System.out.println("not eligble to give vote");
        }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        eligbilityForVote(age);
    }
}
