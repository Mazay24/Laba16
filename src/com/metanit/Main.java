package com.metanit;


import java.util.Scanner;

class Prim {
        double a;
        double b;
        int c;
        public Prim(double a, double b, int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public void virazh(){
            double result = a * Math.pow(b, c);
        }
    }
    class Convertiruem {
        double a;
        double b;
        int c;
        public Convertiruem(double a, double b, int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public double reshaet(){
            double result = a * Math.pow(b,c);
            return result;
        }
    }
@FunctionalInterface
interface  Converter <Prim, Convertiruem>{
    Convertiruem convert (Prim t);

    static <Prim> boolean isNotNull(Prim t){
        return t != null;
    }
}
    class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a: ");
        double a = in.nextDouble();
        System.out.println("Введите b: ");
        double b = in.nextDouble();
        System.out.println("Введите c: ");
        int c = in.nextInt();
        Prim abc = new Prim(a,b,c);
        Converter <Prim, Convertiruem> converter = x ->  new Convertiruem(x.a,x.b,x.c);
        Convertiruem clown = converter.convert(abc);
        System.out.println(clown.reshaet());
    }
}
