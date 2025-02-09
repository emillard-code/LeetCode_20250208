package com.project.solution;

public class LeetCodeSolution {

    public static void main(String[] args) {

        NumberContainers numberContainers = new NumberContainers();
        System.out.println(numberContainers.find(10));
        numberContainers.change(2, 10);
        numberContainers.change(1, 10);
        numberContainers.change(3, 10);
        numberContainers.change(5, 10);
        System.out.println(numberContainers.find(10));
        numberContainers.change(1, 20);
        System.out.println(numberContainers.find(10));

    }

}
