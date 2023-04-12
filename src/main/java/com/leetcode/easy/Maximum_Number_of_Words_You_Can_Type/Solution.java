package com.leetcode.easy.Maximum_Number_of_Words_You_Can_Type;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().canBeTypedWords("abc de",""));;
    }
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] wordArray = text.split(" ");
        int result = wordArray.length;
        boolean found = false;
        String[] letterArray = brokenLetters.split("");
        if(brokenLetters.isEmpty())
            return result;
        for(int i=0;i<wordArray.length;i++){
            for(int j=0;j<letterArray.length;j++){
                if(wordArray[i].contains(letterArray[j])){
                    result--;
                    found = true;
                    break;
                }
            }
            if(found == true)
                continue;
        }
        return result;
    }
}
