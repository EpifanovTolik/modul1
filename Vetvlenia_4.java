package by.tolikonline.smolyakova_lekt.zadachi;

// 4. Заданы размеры A, B прямоугольного отверстия , и размеры x, y, z кирпича. Определить, пройдет ли кирпич
// через отверстие.

public class Vetvlenia_4 {
    public static void main(String[] args) {

        int a = 3;      //длина отвер
        int b = 3;      //ширина отвер

        int x = 7;      //размеры кирпича
        int y = 2;
        int z = 4;

        if (                                                //сравниваем каждые две стороны кирпича с дыркой
                (x<=a && y<=b) || (x<=b && y<= a) ||
                (x<=a && z<=b) || (x<=b && z<= a) ||
                (y<=a && z<=b) || (y<=b && z<= a)
        ){
            System.out.println("пролезет");
        }else {
            System.out.println("не пролезет");
        }

    }

}
