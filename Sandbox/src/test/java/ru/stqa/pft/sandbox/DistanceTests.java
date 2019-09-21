package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.task2.Point;

public class DistanceTests {

  @Test
  public void testDistance1() {
    Point p1 = new Point(2, 3);
    Point p2 = new Point(4, 5);

    Assert.assertEquals(p1.distance(p2), 2.8284271247461903);
  }

  @Test
  public void testDistance2() {
    Point p1 = new Point(2, 3);
    Point p2 = new Point(4, 5);

    Assert.assertEquals(p1.distance(p2), 2.0);
  }

  @Test
  public void testDistance3() {
    Point p1 = new Point(2, 3);
    Point p2 = new Point(4, 5);

    Assert.assertEquals(p1.distance(p2), 2);
  }
}
