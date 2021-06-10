package _06_ke_thua.baitap._2d_3d;

public class HaiD {
    public float x = 0.0f;
    public float y = 0.0f;


    public HaiD(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public HaiD() {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;

    }

    public float[] getXY() {
        float[] array = new float[2];
        array[0] = this.x;
        array[1] = this.y;
        return array;
    }

    @Override
    public String toString() {
        return "HaiD{" +
                "x=" + getX() +
                " y=" + getY() +
                '}';
    }
}
