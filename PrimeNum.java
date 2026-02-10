package JavaPrograms;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println(num + " is prime");
        }else {
            System.out.println(num + " is not a prime");
        }
    }
    public static boolean isPrime(int number){
        for (int i=2;i<=number/2;i++){
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }
}
