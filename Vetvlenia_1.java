package by.tolikonline.smolyakova_lekt.zadachi;

// Даны два угла треугольника (в градусах). Определить , сущетсвует ли такой треугольник, и если да, то будет ли он
// прямоугольным.

public class Vetvlenia_1 {

    public static void main(String[] args) {

        int x = 45;
        int y = 45;


        if ((x + y) < 180){
            System.out.println("треугольник существует");
        }else {
            System.out.println("треугольник не существует");
        }

        if ((x==90) | (y==90) | ((x+y)==90)){
            System.out.println("он прямоугольный");
        }else {
            System.out.println("он не прямоугольный");
        }

    }
}
