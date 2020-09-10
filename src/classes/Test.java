package classes;

public class Test {

    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(10,15,5,5,2);
        circle.moveDown();
        circle.moveLeft();
        System.out.println(circle.toString());
        MovableRectangle rectangle = new MovableRectangle(0,0,4,3,5,5);
        rectangle.moveUp();
        rectangle.moveUp();
        rectangle.moveLeft();
        System.out.println(rectangle.toString());
    }
}
