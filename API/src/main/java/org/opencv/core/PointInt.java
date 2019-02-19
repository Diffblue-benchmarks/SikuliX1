package org.opencv.core;

//javadoc:PointInt_
public class PointInt {

    public int x, y;

    public PointInt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public PointInt() {
        this(0, 0);
    }

    public PointInt(int[] vals) {
        this();
        set(vals);
    }

    public void set(int[] vals) {
        if (vals != null) {
            x = vals.length > 0 ? vals[0] : 0;
            y = vals.length > 1 ? vals[1] : 0;
        } else {
            x = 0;
            y = 0;
        }
    }

    public PointInt clone() {
        return new PointInt(x, y);
    }

    public int dot(PointInt p) {
        return x * p.x + y * p.y;
    }

    @Override
    public int hashCode() {
        return x + y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PointInt)) return false;
        PointInt it = (PointInt) obj;
        return x == it.x && y == it.y;
    }

    public boolean inside(Rect r) {
        return r.contains(this);
    }

    @Override
    public String toString() {
        return "{" + x + ", " + y + "}";
    }
}
