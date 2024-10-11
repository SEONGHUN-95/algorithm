//package org.solutions.inflearn;
//
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Problem24 {
//    public static void main(String[] args) {
//        Problem24 problem24 = new Problem24();
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        System.out.println(problem24.solution(line));
//
//    }
//
//    private int solution(String line) {
//        Stack<Character> stack = new Stack<>();
//        int answer = 0;
//
//        for (char c : line.toCharArray()) {
//            if (Character.isDigit(c)) {
//                char op = stack.pop();
//                if (op == '-') {
//                    answer-=c;
//                } else if (op == '+') {
//
//                } else if (op == '*') {
//
//                } else if (op == '/') {
//
//                }
//
//            } else {
//                stack.push(c);
//            }
//
//        }
//
//
//        int answer = 0;
//
//        return 0;
//    }
//}
