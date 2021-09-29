package dev.patika;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGym {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(10);
        int firstElement = elements.get(1);
        System.out.println(firstElement);
    }
}

// null
// 10
// 0
// IndexOutOfBoundsException is thrown