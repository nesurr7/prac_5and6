package classes;

public class MovablePoint implements Movable {
    int x, y;//пакетная область
    int xSpeed, ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "Параметры точки:" +
                "\nКоордината x:" + x +
                "\nКоордината y:" + y +
                "\nСкорость по x:" + xSpeed +
                "\nСкорость по y:" + ySpeed +
                "\n____________________________";
    }

    @Override//Принимаю систему отсчета сверху вниз:x ,
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }
}
