package bai4;

public class Triangle extends Shape {
    private double side1=1,
            side2=1,
            side3=1;

    public Triangle() {
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double perimeter(){
        return side1+side2+side3;
    }
    public double acreage(){
        return Math.sqrt(perimeter()*(perimeter()-side1)*(perimeter()-side2)*(perimeter()-side3))/4;
    }

    @Override
    public String toString() {
        return "Triangle{" +"\n"+
                "- side1=" + side1 +"\n"+
                "- side2=" + side2 +"\n"+
                "- side3=" + side3 +"\n"+
                "- perimeter ="+perimeter()+"\n"+
                "- acreage ="+acreage()+"\n"+
                "- color : "+getColor()+"\n"+
                '}';
    }
}
