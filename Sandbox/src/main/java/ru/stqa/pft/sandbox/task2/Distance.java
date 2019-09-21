package ru.stqa.pft.sandbox.task2;

public class Distance {
  public static void main(String[] args) {
    Point p1 = new Point(7, 5);
    Point p2 = new Point(2, 0);

    System.out.println("Расстояние между двумя точками с координатами "
            + "(" + p1.x + ";" + p1.y + ")" + " и " + "(" + p2.x + ";" + p2.y + ")" + " = " + p1.distance(p2)) ;
  }
}
