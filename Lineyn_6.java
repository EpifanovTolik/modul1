package by.tolikonline.smolyakova_lekt.zadachi;

// 7. Для данной области составить линейную программу , которая печатает true , если точка с координатами (x,y)
// принадлежит закрашенной области , и false - в противном случае

public class Lineyn_6 {

    public static void main(String[] args) {


//        int x = scannerInt();
//        int y = scannerInt();

        int x = 1;
        int y = 2;

        if ((x>=-4 & x<=4 & y>=-3 & y<=0) || (x>=-2 & x<=2 & y>=0 & y<=4)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

//        if ((x >= -4) & (x <= 0) & (y >= -3) & (y <= 0)) {
//            System.out.print("True");
//        } else if ((x >= -2) & (x <= 0) & (y >= 0) & (y <= 4)) {
//            System.out.print("True");
//        } else if ((x >= 0) & (x <= 2) & (y >= 0) & (y <= 4)) {
//            System.out.print("True");
//        } else if ((x >= 0) & (x <= 4) & (y >= -3) & (y <= 0)) {
//            System.out.print("True");
//        } else {
//                System.out.print("False");
//            }


    }
}




