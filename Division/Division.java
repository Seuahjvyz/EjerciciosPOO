public class Division {

    private double x, y;

    public Division() {
    }

    public double getDividir() {
        return this.x / this.y;

    }

    @Override
    public String toString() {
        return "\nDivision [x=" + x + ", y=" + y + "]";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}