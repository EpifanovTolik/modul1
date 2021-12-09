package by.tolikonline.smolyakova_lekt.zadachi;

// 5. Вычислить значение функции

public class Vetvlenia_5 {
    public static void main(String[] args) {

        double x = 1;
        double Fx;


        if (x<=3){
            Fx = Math.pow(x, 2) - 3*x + 9;
            System.out.println("если x <= 3 ");
            System.out.println("Fx = "+ Fx);
        }else if(x>3){
            Fx = 1/((Math.pow(x, 3))+6);
            System.out.println("если x > 3 ");
            System.out.println("Fx = " + Fx);
        }


    }
}
