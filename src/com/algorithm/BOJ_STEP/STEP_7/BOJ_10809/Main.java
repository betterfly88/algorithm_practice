package com.algorithm.BOJ_STEP.STEP_7.BOJ_10809;

import java.util.*;

/**
 * Created by betterFLY on 2018. 6. 25.
 * Github : http://github.com/betterfly88
 */

public class Main {

    /**
        문제
         알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
     */
    public static void main(String [] args){
        /*
            [입력]
            첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

            [출력]
            각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

            만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
         */

        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();

        Map<Character, Integer> alphabetContainer = new HashMap<>();
        for(int i= 0; i< 26; i++){
            alphabetContainer.put((char)(i+97), -1);
        }

        for(int i=0; i<p.length(); i++){
            Character tempChar = p.charAt(i);
            if(alphabetContainer.keySet().contains(tempChar)){
                if(alphabetContainer.get(tempChar) == -1){
                    alphabetContainer.replace(tempChar, i);
                }
            }
        }

        for(Integer key : alphabetContainer.values()){
            System.out.println(key);
        }
    }
}
