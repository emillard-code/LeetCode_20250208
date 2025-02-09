package com.project.attempt;

public class LeetCodeAttempt {

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
