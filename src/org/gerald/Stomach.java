package org.gerald;

public class Stomach extends  Organ {
    private boolean isEmpty;

    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    public void digest() {
        System.out.println("Digestion beginning...");
    }

    @Override
    public void getDetails() {
        super.getDetails();

        if(this.isEmpty()) {
            System.out.println("You need to feed");
        }else {
            System.out.println("your stomach is full");
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}
