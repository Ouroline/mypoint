/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.point;

/**
 *
 * @author Mike Daniel
 */
public class Test {
    public static void main(String[] args)
    {
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1.distance(5, 6));
        MyPoint p2 = new MyPoint(5, 6);
        System.out.println(p1.distance(p2));
    }
    private final int radius;
    private MyPoint center;
    public Test(int x, int y, int radius) {
        // Need to construct an instance of MyPoint for the variable center
        MyPoint center;
        center = new MyPoint(x, y);
   this.radius = radius;
}


// Returns the x-coordinate of the center of this MyCircle
public int getCenterX() {
   return center.getX();   // cannot use center.x and x is private in MyPoint
}

// Returns the distance of the center for this MyCircle and another MyCircle
public boolean distance(MyCircle another) {
   return center.distance(another.center); // use distance() of MyPoint
}

    private static class MyCircle {

        private MyPoint center;

        public MyCircle() {
        }
    }
}
