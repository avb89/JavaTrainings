package com.intropro.academy.obezverkhyi;

/**
 * Created by dtv on 22.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getAnagram("dfjsghadjghpadfihpg 1241234  fsdafs "));

    }



    public static String getAnagram(String str){

        char[] arrChar = str.toCharArray();
        char[] newArrChar = new char[arrChar.length];
        int count = arrChar.length - 1;
        for (int i = 0; i < arrChar.length; i++) {
            newArrChar[i]=arrChar[count - i];

        }
        str = String.valueOf(newArrChar);

        return str;
    }
}
