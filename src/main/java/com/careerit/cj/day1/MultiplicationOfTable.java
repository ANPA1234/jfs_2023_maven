package com.careerit.cj.day1;

public class MultiplicationOfTable {
    public static void main(String[] args) {
        int num = 19;
        for(int i=1;i<=20;i++){
            System.out.println(String.format("%s * %s = %s",num,i,num*i));
        }
    }
}
