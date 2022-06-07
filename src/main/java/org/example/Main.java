package org.example;

public class Main {
    public static void main(String[] args) {
        int time = 12;

        if (time < 11) {
            System.out.println("yes 23 is greater");

        } else if (time >= 12) {
            System.out.println("it's almost equal to our number");

        } else{
            System.out.println("time not recognised");
        }
        int age = 30;
        String result = (age >= 30) ? "your a young parent" : " your just a grown up";
        System.out.println(result);

    }
}