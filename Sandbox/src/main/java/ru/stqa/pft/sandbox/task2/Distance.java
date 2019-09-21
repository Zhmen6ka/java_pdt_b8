package ru.stqa.pft.sandbox.task2;

public class Distance {
  public static void main(String[] args) {
    Point p1 = new Point(2, 2);
    Point p2 = new Point(6, 6);
    System.out.println("Расстояние между двумя точками с координатами "
            + "(" + p1.x + ";" + p1.y + ")" + " и " + "(" + p2.x + ";" + p2.y + ")" + " = " + distance(p1, p2)) ;
  }

  public static double distance(Point p1, Point p2){
    return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
  }
}
