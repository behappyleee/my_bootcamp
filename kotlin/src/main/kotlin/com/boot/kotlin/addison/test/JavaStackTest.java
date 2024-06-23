package com.boot.kotlin.addison.test;

import java.util.Stack;

public class JavaStackTest {

    public static void main(String[] args) {
        Stack<String> st1 = new Stack<String>();

        st1.push("first");
        st1.push("second");
        st1.push("third");


        System.out.println("Stack Size : " + st1.size());
        String pop1 = st1.pop();

        System.out.println("Pop1 Stack : " + pop1);
        System.out.println("Stack Size : " + st1.size());


    }
}

