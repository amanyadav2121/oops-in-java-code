public class hey {
    public static void main(String[] args) {
        int number = 32145; // Replace this with your input number
        
        int inverse = calculateInverse(number);
        
        System.out.println("Inverse: " + inverse);
    }

    public static int calculateInverse(int number) {
        int originalNumber = number;
        int inverse = 0;
        int position = 1;
        
        while (number > 0) {
            int digit = number % 10;
            inverse += position * (int)Math.pow(10, digit - 1);
            position++;
            number /= 10;
        }
        
        return inverse;
    }
}
