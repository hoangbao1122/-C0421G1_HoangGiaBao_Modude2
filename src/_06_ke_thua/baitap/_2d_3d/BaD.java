package _06_ke_thua.baitap._2d_3d;

public class BaD extends HaiD {
    private float z = 0.0f;


    public BaD(){

    }
    public BaD(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public BaD(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] array = new float[3];
        array[0] = this.getX();
        array[1] = this.getY();
        array[2] = this.z;
        return array;
    }

    @Override
    public String toString() {
        return "BaD{" +
                "x=" + getX() +
                " Y=" + getY() +
                " Z=" + getZ() +
                '}';
    }
}
