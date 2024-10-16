package org.solutions.bruteforce;

public class Practice {
    public static void main(String[] args) {
        String a = "ab";
        String b = "abc";
        String c = "c";

        System.out.println(b == "ab" + "c"); // true
        String q = "ab";
        String w = "c";
        String e = "abc";

        System.out.println(e == q + w); // false

    }
}
