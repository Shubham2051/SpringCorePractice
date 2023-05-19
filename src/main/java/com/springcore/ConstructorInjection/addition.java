package com.springcore.ConstructorInjection;

public class addition {
    private int a;
    private int b;

    public addition(double a, double b) {
        this.a = (int)a;
        this.b = (int)b;
        System.out.println("This is using double:double Constructer");
    }


    public addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("This is using int:int Constructer");
    }

    public addition(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("This is using String:String Constructer");
    }


    public void doSum(){
        System.out.println("Sum is =" + (this.a+this.b));
    }




}
