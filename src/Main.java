public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point.setXY(4,6);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);


        moveablePoint.setSpeed(10,11);
        moveablePoint.setXY(8,9);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
