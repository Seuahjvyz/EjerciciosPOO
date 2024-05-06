public class Resta {

    private int x, y;

    Resta() {
    }

    public int getRestar() {
        return this.x - this.y;
    }

    @Override
    public String toString() {
        return "\nResta [x=" + x + ", y=" + y + "]";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}