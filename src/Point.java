public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int value) {
        x = value;
        y = value;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    public String quad() {
        String quad;
        if (x > 0 && y > 0) {
            quad = "I";
        } else if (x < 0 && y > 0) {
            quad = "II";
        } else if (x < 0 && y < 0) {
            quad = "III";
        } else if (x > 0 && y < 0) {
            quad = "IV";
        } else if (x == 0 && y == 0) {
            quad = "Origin";
        } else {
            quad = "On axis";
        }
        return quad;
    }
}