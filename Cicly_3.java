package by.tolikonline.smolyakova_lekt.zadachi;

// 3. Найти сумму квадратов первых ста чисел

public class Cicly_3 {
    public static void main(String[] args) {

        int x=0; //менять можно с какого числа начинается
        double z = 0;
        double c;
        double p;

        for (int i=x; i<(x+100); i++ ){      // x+100 это первых 100 чисел, для наглядности можно менять на меньшее

            c = Math.pow(i, 2);
            System.out.println("квадраты чисел по очереди " + c);
            z = z + c;
            System.out.println("суммы квадратов при каждом след цикле = " + z );
        }
        p = z;
        System.out.println("итоговая сумма всех квадратов" + p);   //итоговая сумма квадратов

    }
}
