import java.util.*;

public class Patterns {

    /*
    *****
    *****
    *****
    *****
     */

    public static void Print1(int n){  
        for (int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
    *
    **
    ***
    ****
    *****
     */

    public static void Print2(int n){  
        for (int i =1; i<n; i++){
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    1
    12
    123
    1234
    12345
     */
    public static void Print3(int n){  
        for (int i =1; i<n; i++){
            for(int j=1; j<i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
    1
    22
    333
    4444
    55555
     */
    public static void Print4(int n){  
        for (int i =0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /*
    *****
    ****
    ***
    **
    *
     */

    public static void Print5(int n){  
        for (int i =0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /*
    12345
    1234
    123
    12
    1
     */
    public static void Print6(int n){  
        for (int i =0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    
    
    
    
    
    
    
    
    
    
    public static void main (String[] args){
            int n = 5;
            Print1(n);
            Print2(n);
            Print3(6);
            Print4(6);
            Print5(n);
    }
}