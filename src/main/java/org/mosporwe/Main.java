package org.mosporwe;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Заполните массив элементами: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Заданные элементы массива:" + "\n");
        for (int i = 0; i < size; i++) {
            System.out.print("" + array[i] + "\n");
        }
        System.out.println();
        boolean flag = false;

        for (int i = 1; i < array.length; i++){
            if (array[i] % 5 == 0 || array[i] % 5 == 10 || array[i] % 5 == 10) {
                flag = true;
            }
        if (flag == true){
            int max = array[0];
            for (int counter = 1; counter < array.length; counter++) {
                if (array[counter] > max) {
                    max = array[counter];

                }
            }
            System.out.println("Максимальное число: " + max);
        }else if (flag == false){
            int min = array[0];
            for (int counter = 1; counter < array.length; counter++) {
                if (array[counter] < min) {
                    min = array[counter];

                }
            }
            System.out.println("Минимальное число: " + min);
        }



        }
    }
}