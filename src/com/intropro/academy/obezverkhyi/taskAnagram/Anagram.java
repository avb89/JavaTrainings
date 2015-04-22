package com.intropro.academy.obezverkhyi.taskAnagram;

/**
 * Created by dtv on 22.04.2015.
 */
public class Anagram {

    public String getRevers(String str){

        char[] arrChar = str.toCharArray();
        char[] newArrChar = new char[arrChar.length];
        int count = arrChar.length - 1;
        for (int i = 0; i < arrChar.length; i++) {
            newArrChar[i]=arrChar[count - i];

        }
        str = String.valueOf(newArrChar);

        return str;
    }

    public String getAnagram(String str){
        return str;
    }
}
