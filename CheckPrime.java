package Prime;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println("Enter a number");
      Scanner scanner=new Scanner(System.in);
               int a = scanner.nextInt();
      scanner.close();
      boolean result = isPrime(a);

      if (result)
        {
            System.out.println("The number is a prime number");
        }
else
            System.out.println("The number is not a prime number");

    }
    public static boolean isPrime(int a)
    {
        if (a<=1){
            return false;
        }
       for(int i=2;i<=a/2;i++) {
           if (a % i == 0) {
               return false;
           }
       }

        return true;
    }

}
