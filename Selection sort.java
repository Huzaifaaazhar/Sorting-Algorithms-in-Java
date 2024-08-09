/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_task;

/**
 *
 * @author Hawk
 */
public class selectionsort {

    public void SelectionSort(int[] arr) {
        int small;
        for (int i = 0; i < arr.length - 1; i++) {
            small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[small]) {
                    small = j;

                    //swap values
                    int temp = arr[i];
                    arr[i] = arr[small];
                    arr[small] = temp;
                }
            }
        }
    }

}
