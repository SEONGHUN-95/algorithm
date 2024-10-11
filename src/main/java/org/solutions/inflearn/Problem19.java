package org.solutions.inflearn;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem19 {
    public static void main(String[] args) {
        Problem19 problem19 = new Problem19();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(problem19.solution(s, t));

    }

    private int solution(String s, String t) {
        Set<Character> setS = new HashSet<>();
        Set<Character> setT = new HashSet<>();
        int answer = 0;
        for (int i = 0; i < t.length(); i++) {
            setT.add(t.charAt(i));
            System.out.println("t = " + t.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            setS.add(s.charAt(i));
            System.out.println("s = " + s.charAt(i));
        }
        for (int i = t.length(); i < s.length(); i++) {
            if (setT.equals(setS)) {
                answer++;
            }
            setS.remove(s.charAt(i - t.length()));
            setS.add(s.charAt(i));
            if (setT.equals(setS)) {
                answer++;
            }

        }
        return answer;
    }
}
