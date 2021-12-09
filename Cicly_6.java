package by.tolikonline.smolyakova_lekt.zadachi;

// 6. Вывести на экран соответствие между символами и их численными обозначениями в память компьютера

public class Cicly_6 {
    public static void main(String[] args) {


        for (int i = 0; i <= 255; i++) {
            System.out.println(i + " " + (char) i);
        }
    }
}