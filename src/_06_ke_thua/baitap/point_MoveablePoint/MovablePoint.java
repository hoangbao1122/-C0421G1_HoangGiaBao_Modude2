package _06_ke_thua.baitap.point_MoveablePoint;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] array = new float[2];
        array[0] = this.xSpeed;
        array[1] =  this.ySpeed;
        return array;
    }

    public MovablePoint move(){
        super.setX(super.getX() + this.getxSpeed());
        super.setY(super.getY() + this.getySpeed());
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + super.toString() +
                "xSpeed=" + getxSpeed() +
                ", ySpeed=" + getySpeed() +



                '}';
    }




}
