package org.gerald;

public class Patient {
    private String name;
    private int age;
    private Eye leftEye;
    private Eye rightEye;
    private Heart heart;
    private Skin skin;
    private Stomach stomach;

    public Patient(String name, int age, Eye leftEye, Eye rightEye, Heart heart, Skin skin, Stomach stomach) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.skin = skin;
        this.stomach = stomach;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public Eye getLeftEye() {
        return leftEye;
    }


    public Eye getRightEye() {
        return rightEye;
    }


    public Heart getHeart() {
        return heart;
    }


    public Skin getSkin() {
        return skin;
    }


    public Stomach getStomach() {
        return stomach;
    }

}
