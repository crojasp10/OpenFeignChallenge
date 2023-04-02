package com.canguro.challenge.got;

class A
{
    static void staticMethod()
    {
        System.out.println("Static Method");
    }
}
public class MainClass
{
    public static void main(String[] args)
    {
        A a = null;

        a.staticMethod();
    }
}
