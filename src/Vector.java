public class Vector {
    Vector(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    Vector (Vector v){
        this.x=v.x;
        this.y=v.y;
        this.z=v.z;
    }
    private double x, y, z;
    public double getLength(){
        return Math.sqrt(x*x+y*y+z*z);
    }
    public static double scalarMultiply(Vector a, Vector b){
        return a.x*b.x+a.y*b.y+a.z*b.z;
    }
    public static Vector vectorMultiply(Vector a, Vector b){
        return new Vector(
                a.y*b.z-a.z*b.y,
                a.z*b.y-a.x*b.z,
                a.x*b.y-a.y*b.x);
    }
    public static double angleBetweenVectors(Vector a, Vector b){
        double cos=scalarMultiply(a, b)/(a.getLength()*b.getLength());
        return Math.acos(cos);
    }
    public static Vector vecSum(Vector a, Vector b){
        return new Vector(
                a.x+b.x,
                a.y+b.y,
                a.z+b.z);
    }
    public static Vector vecDiff(Vector a, Vector b){
        return  new Vector(
                a.x-b.x,
                a.y-b.y,
                a.z-b.z);
    }
}
