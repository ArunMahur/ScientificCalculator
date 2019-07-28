package com.example.scientificcalculator;

public class CalculateFactorial {

    public static final int MAX=1000;

    private int res_size;
    private int res[]=new int[MAX];

    CalculateFactorial()
    {
        res_size = 1;
    }

    public int getRes()
    {
        return res_size;
    }


    public int[] factorial(int n)
    {

        res[0] = 1;


        for (int x=2; x<=n; x++)
            res_size = multiply(x, res_size);

        return res;
    }


    private int multiply(int x, int r)
    {
        int carry = 0;  // Initialize carry


        for (int i=0; i<r; i++)
        {
            int prod = res[i] * x + carry;
            res[i] = prod % 10;
            carry  = prod/10;
        }

        while (carry!=0)
        {
            res[r] = carry%10;
            carry = carry/10;
            r++;
        }
        return r;
    }
}
