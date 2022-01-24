package com.DesignPattern;

public class Patterns {

    void pattern1()
    {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }

    void pattern2()
    {
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }

    void pattern3()
    {
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <= (4+ 1) -i ; j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }

    void pattern4()
    {
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println( );
        }
    }

    void pattern5()
    {
        for (int i = 1; i <=(2*4)-1 ; i++) {
            int col = i>4?2*4-i:i;
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    void pattern6(int n)
    {
        for (int i = 1; i <=(2*n)-1 ; i++) {
            int col = i>n?2*n-i:i;
            int spaces = n-col;
            for(int s=1;s<=spaces;s++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void pattern7(int n)
    {
        for (int i = 1; i <= n; i++) {
            int col = n-i;
            for (int space = 1; space <= col; space++) {
                System.out.print("  ");
            }

            for (int colms = i; colms >=1 ; colms--) {
                System.out.print(colms + " ");
            }
            for(int colms =2 ; colms<=i;colms++)
            {
                System.out.print(colms + " ");
            }
            System.out.println();
        }
    }

}
