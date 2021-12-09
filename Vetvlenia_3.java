package by.tolikonline.smolyakova_lekt.zadachi;

// 3. Даны три точки A(x1,y1), B(x2,y2), и C(x3,y3). Определить, будут ли они расположены на одной прямой.

public class Vetvlenia_3 {


    public static void main(String[] args) {

        int x1 = 1;
        int y1 = 1;

        int x2 = 2;
        int y2 = 2;

        int x3 = 5;
        int y3 = 5;

       if((x1 - x2) / (x3 - x2) == (y1 - y2) / (y3 - y2)) {   //формула для определения на линии
           System.out.println("лежат на одной прямой");
       }else {
           System.out.println("не лежат на прямой");
       }

    }
}