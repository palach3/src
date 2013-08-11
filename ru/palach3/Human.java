package ru.palach3;

public class Human {
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 100;
    private static final int MIN_LENGTH = 3;


    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        if (newName != null && newName.length() >= MIN_LENGTH) {
            name = newName;
        }
    }

    public void setAge(int newAge) {
        if (newAge > MIN_AGE && newAge < MAX_AGE) {
            age = newAge;
        }
    }
}
