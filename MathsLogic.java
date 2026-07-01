import java.util.*;

public class MathsLogic{

    //QS 1. Count Digits - given a number 'n'. find out and return the number of digits present in a number
    public static int CountDigits(int n){

        int cnt = 0;
        while(n>0){
            int lastDigit = n%10;
            cnt=cnt+1;
            n=n/10;
        }
        return cnt;

    }

    //QS 2. Reverse a Number - write a program to generate the reverse of a given number "n". Print the corrosponding rreverse number.
    public static int ReverseNumber( int n){

        int reverse =0;
        while(n>0){
            int lastDigit = n%10;
            n=n/10;
            reverse = reverse*10+lastDigit;
        }
        return reverse;
    }

    //QS 3. Write a program to determine if given number is palidrome or not. Print if it is true otherwise ,false.
    public static Boolean Palidrome(int n){

        int reverse =0;
        int duplicate = n;

        while(n>0){
            int lastdigit = n%10;
            n=n/10;
            reverse = reverse*10+lastdigit;
        }

        if(reverse == duplicate){
            return true;
        }
        else{
            return false;
        }
    }

    //QS 4. Amstrong Number - it means every number cube after adding equal to the number. eg - 371 - sum=371.
    public static Boolean AmstrongNumber(int n){

        int sum =0;
        int duplicate=n;

        while(n>0){
            int lastdigit = n%10;
            n=n/10;

            sum = sum+(lastdigit*lastdigit*lastdigit);
        }
        if(sum == duplicate){
            return true;
        }
        else{
            return false;
        }
           
    }

    //QS 5. Find GCD/HCF
    public static int GCD(int n1, int n2){

        int minimum = Math.min(n1,n2);
        int result =1;
        for(int i=minimum; i>=1; i--){
            if(n1%i==0 && n2%i==0){
                 result =i;
                break;
            }
        }
        return result;
        

    }

    //QS 6. Check for prime number
    public static boolean PrimeNumber(int n){

        if(n<=1){
            return false;
        }

        if(n%2==0){
            return false;
        }

        if(n==2){
            return true;
        }

        for(int i=3; i<=n;i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }

    //QS 7. Print Divisors - write a function to print all divisors of a number. Divisors are the numbers that divide the number entirely and leaves no remainder.
    public static ArrayList<Integer> Divisors(int n){
        ArrayList<Integer> divisorsList = new ArrayList<>();

        for(int i=1; i*i<=n;i++){

            if(n%i ==0){
                divisorsList.add(i);
            }
            if(i != n/i){
                divisorsList.add(n/i);
            }
        }
         Collections.sort(divisorsList);
        return divisorsList;
    }




    public static void main(String[] args){

        System.out.println(CountDigits(56742356));

        System.out.println(ReverseNumber(4532));

        System.out.println(Palidrome(1221));

        System.out.println(AmstrongNumber(371));

        System.out.println(GCD(9,12));

        System.out.println(PrimeNumber(31));

        System.out.println(Divisors(48));








    }

}

