package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    //added these
    private int heightInInches;
    private String hairColor;
    private String gender;
    private String favoriteColor;
    private String finalField;

    public Person() {
        this.setName("");
        this.setAge(Integer.MAX_VALUE);
    }

    public Person(int constructAge) {
        this.setAge(constructAge);
    }

    public Person(String constructName) {
        this.setName(constructName);
    }

    public Person(String constructname2, int constructage2) {
        this.setName(constructname2);
        this.setAge(constructage2);
    }

    public void setName(String setname) {
        this.name = setname;
    }

    public void setAge(int setage) {
        this.age = setage;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    //height
    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }

    //haircolor
    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    //gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //favorite color
    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    //final field
    public String getFinalField() {
        return finalField;
    }

    public void setFinalField(String finalField) {
        this.finalField = finalField;
    }
}
