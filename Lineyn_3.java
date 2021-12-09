package by.tolikonline.smolyakova_lekt.zadachi;

// 3. Вычислить значение выражения по формуле(все переменные   принимают действительные значения):

public class Lineyn_3 {

    public static void main(String[] args) {

         double x = 45;
         double y = 180;
         double z;

        double r1 = Math.toRadians(x);   // градусы в радианы
        double r2 = Math.toRadians(y);

        z = ((Math.sin(r1) + Math.cos(r2))/(Math.cos(r1) - Math.sin(r2))) * Math.tan(r1*r2);

        System.out.println(z);


    }
}
