package by.tolikonline.smolyakova_lekt.zadachi;

// 2. Найти max{min(a,b), min(c,d)}.

public class Vetvlenia_2 {

    public static void main(String[] args) {

        int a = 5;
        int b = 51;
        int c = 80;
        int d = 14;
        int min1;
        int min2;
        int max;

        if (a>b){
            min1 = b;
        }else {
            min1 = a;

        }if (c>d){
            min2 = d;
        }else {
            min2 = c;
        }

        if (min1>min2){
            max = min1;
        }else {
            max = min2;
        }
        System.out.println(max);


    }
}
