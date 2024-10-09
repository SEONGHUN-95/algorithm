package org.solutions.solution01;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Practice {

    private static void dfs(Node startNode){
        Stack<Node> stack = new Stack<>();
        stack.push(startNode);
        while(!stack.isEmpty()) {
            Node node = stack.pop();
            for (Node child : node.children) {
                stack.push(child);
            }
        }
    }
    private static void dfsRecursive(Node node){
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        if(node.children==null){
            return;
        }
        Node node1 = stack.pop();
        for(Node child : node1.children){
            dfsRecursive(child);
        }

    }
    private static void bfs(Node startNode){
        Queue<Node> queue = new LinkedList<>();
        queue.add(startNode);
        while(!queue.isEmpty()){
            Node node = queue.poll();
        for(Node node1 : node.children){
            queue.add(node1);
        }

        }
    }
}

class Node{
    int data;
    List<Node> children;

}