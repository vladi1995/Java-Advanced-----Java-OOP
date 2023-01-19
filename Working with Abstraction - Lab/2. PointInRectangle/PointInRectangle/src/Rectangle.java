public class Rectangle {
    private Point pointLeft;
    private Point pointRight;

    public Rectangle(Point pointLeft, Point pointRight) {
        this.pointLeft = pointLeft;
        this.pointRight = pointRight;
    }

    public boolean contains(Point point) {
        int bottomLeftX = pointLeft.getX();
        int bottomLeftY = pointLeft.getY();
        int topRightX = pointRight.getX();
        int topRightY = pointRight.getY();

        int currentPointX = point.getX();
        int currentPointY = point.getY();

        if (currentPointX >= bottomLeftX && currentPointX <= topRightX && currentPointY >= bottomLeftY && currentPointY <= topRightY) {
            return true;
        }
        return false;
    }
}
