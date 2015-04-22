package com.intropro.academy.obezverkhyi.taskAnagram;

/**
 * Created by obezverkhyi on 22.04.2015.
 */
public class Anagram {

    public String getRevers(String str){

        char[] arrChar = str.toCharArray();
        char[] newArrChar = new char[arrChar.length];
        int count = arrChar.length - 1;
        for (int i = 0; i < arrChar.length; i++) {
            newArrChar[i] = arrChar[count - i];

        }
        return String.valueOf(newArrChar);
    }

    public String getAnagram(String str){
        String[] stArr = str.split(" ");
        String st = "";
        for (int i = 0; i < stArr.length; i++) {
            stArr[i] = this.getRevers(stArr[i]);
            st = st.concat(stArr[i].concat(" "));
        }
        return st;
    }

    public String getAnagramWithDigits(String str){
        String[] stArr = str.split(" ");




        return str;
    }
}
