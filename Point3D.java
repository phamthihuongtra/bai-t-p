package baitap;

public class Point3D extends Point2D {
    protected float z;
    public Point3D() {
        this.z = 0.0f;

    }
    public Point3D(float x, float y, float z) {
      super(x,y);
      this.z = z;

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setxyz(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getxyz() {
        return new float[]{getX(), getY(), getZ()};
    }


   @Override
   public String toString() {
       return "(" + x + ", " + y + "," + z + ")";
   }
}
