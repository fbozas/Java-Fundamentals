package gr.aueb.cf.ch11;

/*
*   Immutable 3D Point
*/
public final class Point3D {
    public Point getPoint() {
        return point;
    }

    private final int z;

    public Point3D(){
        point = new Point();
        z = 0;
    }

    public Point3D(Point point, int z){
        this.point = point;
        this.z = z;
    }

    private final Point point;

    public int getZ() {
        return z;
    }
}
