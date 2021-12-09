package by.tolikonline.smolyakova_lekt.zadachi;

// 2. Вычислить значение функции на отрезке [a,b] с шагом h: y =  x,  x>2;
//                                                           y = -x, x<=2;

public class Cicly_2 {

    public static void main(String[] args) {


//        int x = scannerInt();
        int x = -5;            //можно менять
        int y;
 //      int shag = scannerInt1() ;
        int shag = 1;           // можно менять


        if (x > 2) {
            for (int i = 3; i <= x; i = i + shag) {
                y = i;
                System.out.println("при x = " + i + " и шагом " + shag + "; y= " + y);
            }
        } else {
            for (int i = 2; i >= x; i = i - shag) {
                y = i*(-1);
                System.out.println("при x = " + i + " и шагом " + shag + "; y= " + y);
            }
        }
    }

    //    private static int scannerInt(){
//        Scanner in = new Scanner(System.in);
//        int number;
//        System.out.println("введите число для координаты х");
//        number = in.nextInt();
//        return number;
//    }
//
//    private static int scannerInt1(){
//        Scanner in = new Scanner(System.in);
//        int number;
//        System.out.println("введите число для шага");
//        number = in.nextInt();
//        return number;
//    }
}