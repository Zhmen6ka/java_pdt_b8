package ru.stqa.pft.sandbox;

public class HelloWorld {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Zhenya");

    Square s = new Square(5);
    System.out.println("Пощадь квадрата со стороной " + s.l + " = " + s.area());


    Rectangle r = new Rectangle(4, 6);
    System.out.println("Пощадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }

  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }
}