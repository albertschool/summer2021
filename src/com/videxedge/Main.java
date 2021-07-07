package com.videxedge;

public class Main {

    public static int[] filter(int[] arr, int num){
        int[] temp = new int[arr.length];
        int place = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] != num){
                temp[place] = arr[i];
                place++;
            }
        }
        int[] arrback = new int[place];
        for (int i=0; i<place; i++){
            arrback[i] = temp[i];
        }
        return arrback;
    }

    public static void q1(){
        int[] arr = new int[]{6,9,2,2,9,4,-3};
        int[] result = filter(arr,9);
        System.out.println("q1 done");
    }

    public static void main(String[] args) {
        q1();
    }
}
