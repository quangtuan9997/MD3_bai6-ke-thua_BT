package bai1;

public class Cylinder extends Circle {
   private double height;

    public Cylinder(double radius,double height) {
        super(radius);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume(){
      return  super.acreage()*height;
    }

}