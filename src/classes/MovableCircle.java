package classes;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center=new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Параметры круга:" +
                "\nРадиус:" + radius +
                "\nКоординаты центра:X=" + center.x + ",Y=" + center.y +
                "\nСкорость по X:" + center.xSpeed + ",по Y:" + center.ySpeed +
                "\n________________________";
    }


    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x -= center.xSpeed;
    }
}
