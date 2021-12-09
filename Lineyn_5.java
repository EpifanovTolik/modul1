package by.tolikonline.smolyakova_lekt.zadachi;

// 5. Дано натуральное число Т , которое представляет длительность прошедшего времени в секундах. Вывести данное
// значение длительности в часах, минутах и секундах в следующей форме: HHч MMмин SSс.

public class Lineyn_5 {
    public static void main(String[] args) {

        int t = 85921;               // всего секунд

        int h = t / 3600;           // полных часов

        int ostSec = t - (h*3600);  //остаток секунд минус полных часов

        int m = ostSec/60;            // минут

        int s = ostSec - (m*60);       // секунд


        System.out.println(h +"ч " + m +"мин " + s + "с ");

//        int w = s + m*60 + h*3600;      //проверка
//        System.out.println(w);


//       int t = 12589;
//
//       int h = t/3600;  //всего часов
//
//        int остСек = t - (h * 3600);  //остаток секунд после отнятия часов
//
//        int m = остСек / 60;    //минут
//
//        int s = остСек - (m * 60);
//
//        System.out.println(h + " " + m + " " + s);
//
//        int w = 49 + (29*60) + (3*3600);
//
//        System.out.println(w);









    }
}
