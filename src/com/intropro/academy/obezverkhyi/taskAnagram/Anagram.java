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

    public static String getAnagrams(String str){
        String[] stArr = str.split(" ");
        String newString = "";

        for (int i = 0; i < stArr.length; i++) {
            char[] ch = stArr[i].toCharArray();
            int startCh = 0;
            int finishCh = ch.length - 1;

            while(startCh < finishCh){
                while(isChar(ch[startCh]) == false){
                    startCh++;
                }
                while(isChar(ch[finishCh]) == false){
                    startCh--;
                }
                char temp = ch[startCh];
                ch[startCh] = ch[finishCh];
                ch[finishCh] = temp;
                startCh++;
                finishCh--;
            }
            newString = newString.concat(String.valueOf(ch).concat(" "));
        }

        return newString;
    }


    public char[] stringToChar(String str){
        return str.toCharArray();
    }



    public static boolean isChar(char ch){
        return ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));
    }


}
