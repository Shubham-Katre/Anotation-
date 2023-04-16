package com.example.test164;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.print("This is userController");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
