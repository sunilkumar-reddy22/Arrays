package com.sunil.leetcode;
public class Panagram {
    public static void main(String[] args) {
    String  sentence = "thequickbrownfoxjumpsoverthelazydog";
   boolean ans = stack(sentence);
        System.out.println(ans);
    }
    static boolean stack(String sentence) {
        boolean[] seen = new boolean[26];
        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true;
        }
        for (boolean val : seen) {
            if (!val) {
                return false;
            }

        }
        return true;
    }
}
