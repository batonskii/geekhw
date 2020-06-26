package ru.geekbrains.hw2;

import java.util.Arrays;

public class gbhw2 {
    public static void main(String[] args) {
        System.out.println("Задание 1: ");
        System.out.println("Заменить в массиве 1 на 0, а 0 на 1. Нам дан массив [1, 1, 0, 0, 1, 0, 1, 1]");
        inversion01();
        System.out.println("\nЗадание 2: ");
        System.out.println("Вывести массив значений 0,3,6,9,12,15,18,21");
        array8();
        System.out.println("\nЗадание 3: ");
        System.out.println("Если число в масиве меньше 6, то при выводе необходимо умножить его на 2.Нам дан массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1]");
        multiplication2();
        System.out.println("\nЗадание 4: ");
        System.out.println("В двумерном массиве сделать диагонали из 1");
        diagonal1();
        System.out.println("\nЗадание 5: ");
        System.out.println("Найти и вывести минимальное и максимальное значение в массиве. наш массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1]");
        minMax();
    }

    /**
     * change01 Замена 1 на 0 и 0 на 1.
     */
    public static void inversion01() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * array8 Вывести массив значений 0,3,6,9,12,15,18,21.
     */
    public static void array8() {
        final int SIZE = 8;
        int[] arr = new int[SIZE];
        arr[0]=0;
        for (int i = 1,j=1; i < arr.length; i++,j++) {
                arr[i]=3;
                arr[i]*=j;
            }
        System.out.println(Arrays.toString(arr));
        }
    /**
     * multiplication2 Если число в масиве меньше 6, то при выводе необходимо умножить его на 2.
     */
    public static void multiplication2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<6){
                arr[i]*=2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * diagonal1 В двумерном массиве сделать диагонали из 1
     */
    public static void diagonal1() {
        final int SIZE = 5;
        int[][] arr = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0, y=arr[i].length-1; j < SIZE; j++,y--) {
                if(i==j || i==y){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
        for (int[] array : arr) {
            System.out.println(Arrays.toString(array));
        }
    }
    /**
     * minMax Найти и вывести минимальное и максимальное значение в массиве.
     */
    public static void minMax(){
        int[]arr={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int maxNum=arr[0];
        int minNum=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(minNum>arr[i]){
                minNum=arr[i];
            }else if(maxNum<arr[i]){
                maxNum=arr[i];
            }
        }
        System.out.print("Минимальное значение= "+minNum+" Максимальное значение= "+maxNum);
    }
    /*
    * идея checkBalance [1,1,1,2,1]
    *1=1+1+2+1 ? =>
    * 1+1=1+2+1 ? =>
    * 1+1+1=2+1 ? => true (или false, если равенство к концу цикла найдено не было) */
    public static void checkBalance(){
        int []arr=new int[]{2,2,3,1,2,1,3};
        int memory=0;
        int rightSum=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j < 0; j++) {
            }
            if((arr[i]+memory)==rightSum){
                return;
            }
            memory=arr[i];
        }
    }
    public static void numOffset(){

    }
}