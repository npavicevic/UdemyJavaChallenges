package com.challenges;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
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

    public double distance() {
        if (x == 0 && y == 0) {
            return 0;
        } else if (x == 0) {
            return y;
        } else if (y == 0) {
            return x;
        } else {
            return Math.sqrt(x * x + y * y);
        }
    }

    public double distance(int x2, int y2) {
        if (x2 == 0 && y2 == 0) {
            return distance();
        }
        if (x == 0 && y == 0) {
            return Math.sqrt(x2 * x2 + y2 * y2);
        }
        return Math.sqrt(Math.pow((x - x2), 2) + Math.pow(y - y2, 2));
    }

    public double distance(Point a) {
        return distance(a.getX(), a.getY());
    }
}
