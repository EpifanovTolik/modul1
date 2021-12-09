package by.tolikonline.smolyakova_lekt.zadachi;

// 4. Составить программу нахождения произведения квадратов первых двухсот чисел

public class Cicly_4 {
    public static void main(String[] args) {

        int x=2; //менять можно с какого числа начинается
        double z =1;  // для произведения нельзя с ноля начинать, поэтому 1
        double c;
        double p;

        for (int i=x; i<(x+5); i++ ){      // "x+200" первых 200 для наглядности можно менять на меньшее

            c = Math.pow(i, 2);
            System.out.println("квадраты чисел по очереди " + c);
            z = z * c;
            System.out.println("произведения квадратов при каждом след цикле = " + z );
        }
        p = z;
        System.out.println("итоговое произведение квадратов " +p);   //итоговое произведение квадратов


    }
}
