package Pr10;

public class Test {

    public static void main(String[] args) {
        ConcreteFactory cf = new ConcreteFactory();
        cf.createComplex();
        cf.CreateComplex(-23, 34);
        System.out.println(cf.toString());
    }
}