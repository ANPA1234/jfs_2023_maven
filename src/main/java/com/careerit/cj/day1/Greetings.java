package com.careerit.cj.day1;

public class Greetings {
    public static void main(String[] args) {
        String username = "user";
        if (args.length > 0) {
            username = args[0];
        }
        System.out.println("Hi "+username+", \n\twelcome to java world");

    }
}
