package classes;

public class MovableRectangle implements Movable {
    private int length;
    private int width;
    private MovablePoint leftUpPoint, rigthDownPoint;

    MovableRectangle(int x, int y, int xSpeed, int ySpeed, int length, int width) {
        leftUpPoint=new MovablePoint(x,y,xSpeed,ySpeed);
        rigthDownPoint=new MovablePoint(x+length,y+width,xSpeed,ySpeed);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Параметры прямоугольника:" +
                "\nДлина:" + length +
                "\nШирина:" + width +
                "\nКоординаты верхней , левой точки:" + leftUpPoint.x + " " + leftUpPoint.y +
                "\nКоординаты нижней , правой точки:" + rigthDownPoint.x + " " + rigthDownPoint.y +
                "\n___________________";
    }

    @Override
    public void moveUp() {
        leftUpPoint.y -= leftUpPoint.ySpeed;
        rigthDownPoint.y -= rigthDownPoint.ySpeed;
    }

    @Override
    public void moveDown() {
        leftUpPoint.y += leftUpPoint.ySpeed;
        rigthDownPoint.y += rigthDownPoint.ySpeed;
    }

    @Override
    public void moveLeft() {
        leftUpPoint.x -= leftUpPoint.xSpeed;
        rigthDownPoint.x -= leftUpPoint.xSpeed;
    }

    @Override
    public void moveRight() {
        leftUpPoint.x += leftUpPoint.xSpeed;
        rigthDownPoint.x += leftUpPoint.xSpeed;
    }

    public boolean checkPointsSpeed() {
        if ((leftUpPoint.ySpeed == rigthDownPoint.ySpeed) &&
                (rigthDownPoint.xSpeed == leftUpPoint.xSpeed)) {
            return true;
        }
        return false;
    }

    public void upSpeed() {//Доводит скорость до быстрейшей точки
        if (leftUpPoint.ySpeed > rigthDownPoint.ySpeed) {
            rigthDownPoint.ySpeed = leftUpPoint.ySpeed;
        } else {
            leftUpPoint.ySpeed = rigthDownPoint.ySpeed;
        }
        if (leftUpPoint.xSpeed > rigthDownPoint.xSpeed) {
            rigthDownPoint.xSpeed = leftUpPoint.xSpeed;
        } else {
            leftUpPoint.xSpeed = rigthDownPoint.xSpeed;
        }
    }
}
