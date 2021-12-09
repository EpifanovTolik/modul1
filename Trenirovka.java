package by.tolikonline.smolyakova_lekt.zadachi;

import java.util.Arrays;
public class Trenirovka {

    public static void main(String[] args) {


        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));

        for(int i = 1; i<array.length; i++) {

            int current = array[i];  //выбранное знач

            int j = i - 1; //предыдущее знач

            while(j >= 0 && current < array[j]) {

                array[j+1] = array[j];

                j--;
            }
            array[j+1]=current;
        }
        System.out.println(Arrays.toString(array));
    }
}







