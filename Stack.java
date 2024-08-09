package com.mycompany.java_task;

class stack
{
    int size;
    int top;
    char[] a;
 
    boolean isEmpty()
    {
        return (top < 0);
    }
     
    stack(int n)
    {
        top = -1;
        size = n;
        a = new char[size];
    }
 
    boolean push(char x)
    {
        if (top >= size)
        {
        System.out.println("Stack Overflow");
        return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }
 
    char pop()
    {
        if (top < 0)
        {
        System.out.println("Stack Underflow");
        return 0;
        }
        else
        {
            char x = a[top--];
            return x;
        }
    }
}
 
