package Bai3;

public class Main {
    public static void main(String[] args) {
        MoveablePoint mv=new MoveablePoint(3,5,6,7);
        System.out.println(mv.toString());
        System.out.println(mv.move());
    }
}
