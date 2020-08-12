public class Point3D extends Point2D{
    private float z = 0.0f;
    Point3D(){};
    Point3D(float z, float x, float y){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float[] result = {z, super.getX(), super.getY()};
        return result;
    }
    public void setXYZ(float x, float y, float z){
        this.z = z;
        this.setX(x);
        this.setY(y);
    }
    public String toString(){
        return super.toString() + ", z = " + getZ();
    }
}
