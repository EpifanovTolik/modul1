package by.tolikonline.smolyakova_lekt.zadachi;

// 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):


public class Lineyn_2 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        double z;

       z= ((b + Math.sqrt (Math.pow (b,2) + 4 * a * c)) / (2 *a)) - Math.pow (a,3) * c + Math.pow (b,-2);

        System.out.println(z);


//        double x1 = 16;
//        double x2 = 2.25;
//        double x3 = 0.25;
//        double x4 = 88.675;
//
//        System.out.println( Math.sqrt(x1));
//        System.out.println(Math.sqrt(x2));
//        System.out.printf("sqrt(%.3f) = %.3f%n", x3, Math.sqrt(x3));
//        System.out.printf("sqrt(%.3f) = %.3f%n", x4, Math.sqrt(x4));
    }
}
