package com.assignment6;

import com.assignment6.part2.Application;
import com.assignment6.part3.Application2;


public class Main {

    public static void main(String[] args) {
        System.out.println("Part2:");
        Application app = new Application();
        System.out.println('\n' + "-----------------------------" + '\n');
        System.out.println("Part3:");
        Application2 app2 = new Application2();
        app2.start();
    }
}
