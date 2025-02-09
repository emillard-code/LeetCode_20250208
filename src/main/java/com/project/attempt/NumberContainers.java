package com.project.attempt;

import java.util.HashMap;
import java.util.Map;

public class NumberContainers {

    HashMap<Integer, Integer> numbers;

    public NumberContainers() {

        numbers = new HashMap<Integer, Integer>();

    }

    public void change(int index, int number) {

        if (numbers.get(index) == null) { numbers.put(index, number); }
        else { numbers.replace(index, number); }

    }

    public int find(int number) {

        int smallestIndex = -1;

        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {

            int key = entry.getKey();
            int value = entry.getValue();

            if (number == value && smallestIndex > key) {
                smallestIndex = key;
            } else if (number == value && smallestIndex == -1) {
                smallestIndex = key;
            }

        }

        return smallestIndex;

    }

}
