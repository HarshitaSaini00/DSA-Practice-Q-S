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

    /*
        *    
       ***   
      *****
     *******
    *********
     */
    public static void Print7(int n){
        for(int i=0;i<n;i++){
            //for spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print("");
            }
            //for stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print("");
            }
            System.out.println();
        }
    }

    /*
    *********
     *******
      *****
       ***
        *
     */
    public static void Print8(int n){
        for(int i=0; i<n; i++){
            //for spaces
            for(int j=0; j<i; j++){
                System.out.print("");
            }
            //for stars
            for(int j=0; j<(2*n)-(2*i+1);j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=0; j<i; j++){
                System.out.print("");
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
    **** 
    ***
    **
    * 
     */
    public static void Print9(int n){
        for(int i=0; i<2*n-1;i++){
            int stars = i;
            if(i>n){
                stars=2*n-i;
            }
            for(int j=0; j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
    1
    01
    101
    0101
     */
    public static void Print10(int n){
        for(int i=0;i<n;i++){
            int start = 1;
            if(i%2==0){
                start =1;
            }
            else{
                start=0;
            }
            for(int j=0;j<i;j++){
                System.out.print(start);
                start= start-1;
            }
            System.out.println();
        }
    }

    /*
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
     */
    public static void Print11(int n){
        int num =1;
        for(int i=0;i<n;i++){
            for(int j=0; j<i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    /*
    A
    A B
    A B C
    A B C D
    A B C D E
     */
    public static void Print12(int n){
        for(int i=0; i<n;i++){
            for(char ch='A'; ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();

        }
    }

   /*
   A B C D E
   A B C D
   A B C 
   A B
   A
   */
public static void Print13(int n){
    for(int i=0;i<n;i++){
        for(char ch='A';ch<='A'+(n-i-1);ch++){
            System.out.print(ch);
        }
        System.out.println();
    }
}

/*
A
B B
C C C
D D D D
E E E E E
 */
public static void Print14(int n){
    for(int i=0; i<n; i++){
        char ch = 'A'+i;
        for(int j=0; j<i; j++){
            System.out.print(ch);
        }
        System.out.println();
    }
}

/*
E
D E
C D E
B C D E
A B C D E
 */
public static void Print15(int n){
    for(int i=0; i<n; i++){
        for(char ch='E'-i; ch<='E';ch++){
            System.out.print(ch);
        }
        System.out.println();
    }
}

/*
* * * *
*     *
*     *
* * * *
 */
public static void Print16(int n){
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(i==0 || i==n-1 || j==0 || j==n-1){
                System.out.print("*");
            }
        }
        System.out.println();
    }
}

/*
1      1       
12    21 
123  321  
12344321      
 */
public static void Print17(int n){
    int space = 2*(n-1);
    for(int i=0; i<n; i++){
        //numbers
        for(int j=0; j<i; j++){
            System.out.print(j);
        }
        //spaces
        for(int j=1; j<space; j++){
            System.out.print("");
        }
        //numbers
        for(int j=0; j<i; j++){
            System.out.print(j);
        }
        System.out.println();
        space= space-2;
    }
}

/*
        A
      A B A
    A B C B A
  A B C D C B A
A B C D E D C B A
   
 */
public static void Print18(int n){
    for(int i=0; i<n; i++){
        //spaces
        for(int j=0; j<n-i; j++){
            System.out.print("");
        }
        //character
        char ch="A";
        int breakdown = (2*i+1)/2;

        for(int j=0; j<2*i+1; j++){
            System.out.print(ch);

            if(j<=breakdown){
                ch++;
            }
        }
        //spaces
        for(int j=0; j<n-i; j++){
            System.out.print("");
        }

    }
    System.out.println();
}

/*

**********
****  ****
***    ***
**      **
*        *
------------
*        *
**      **
***    ***
****  ****
**********

 */
public static void Print19(int n){
    int spaces=0;
    for(int i=0; i<n; i++){
        //stars
        for(int j=0; j<i;j++){
            System.out.print("*");
        }
        //spaces
        for(int j=0; j<spaces;j++){
            System.out.print("");
        }
        //stars
        for(int j=0; j<i;j++){
            System.out.print("*");
        }
        spaces= spaces+2;
        System.out.println();

        
    }

    int spaces1=8;
    for(int i=0; i<n; i++){
        //stars
        for(int j=0; j<i;j++){
            System.out.print("*");
        }
        //spaces
        for(int j=0; j<spaces;j++){
            System.out.print("");
        }
        //stars
        for(int j=0; j<i;j++){
            System.out.print("*");
        }
        spaces= spaces-2;
        System.out.println();

        
    }
}

/*
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
 */

public static void Print20(int n){
    int spaces=2*n-2;

    for(int i=0; i<2*n-1; i++){

        int stars = i;

        if(i>n){
            stars = 2*n-i;
        }

        //stars
        for(int j=0; j<stars;j++){
            System.out.print("*");
        }

        //spaces
        for(int j=0; j<spaces; j++){
            System.out.print("");
        }

        //stars
        for(int j=0; j<stars;j++){
            System.out.print("*");
        }
        System.out.println();

        if(i<n){
            spaces = spaces-2;
        }
        else{
            spaces = spaces+2;
        }

    }
}


    
    
    
    
    
    
    
    
    
    
    public static void main (String[] args){
            int n = 5;
            Print1(n);
            System.out.println();

            Print2(n);
            System.out.println();

            Print3(6);
            System.out.println();

            Print4(6);
            System.out.println();

            Print5(n);
            System.out.println();

            Print6(n);
            System.out.println();

            Print7(n);
            System.out.println();

            Print8(n);
            System.out.println();

            Print9(n);
            System.out.println();

             Print10(n);
            System.out.println();

            Print11(n);
            System.out.println();

             Print12(n);
            System.out.println();

             Print13(n);
            System.out.println();

             Print14(n);
            System.out.println();

             Print15(n);
            System.out.println();

            Print16(n);
            System.out.println();

             Print17(n);
            System.out.println();

             Print18(n);
            System.out.println();

             Print19(n);
            System.out.println();

             Print20(n);
            System.out.println();
  

    
}

