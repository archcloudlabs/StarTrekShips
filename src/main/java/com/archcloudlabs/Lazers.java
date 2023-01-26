package com.archcloudlabs;

import java.text.Format;

// whoa a package! classes in the same package do not need to import eachother they can just create new objects
// What's an example where a class in a different packge you have to import?

public class Lazers {

    // these are private and cannot be directly accessed without the help of a method! 
    private int size;
    private int damage;
    private String name;


    // Oh hey a default constructor
    // we need to explicitly put this here because we have another constructor below!
    public Lazers() {
        this.size = 10;
        this.damage = 10;
        this.name = "Default Lazer";
    }

    // Whoa! constructor overloading occurs when the name is the same
    // but the parameters are different! Radical!
    public Lazers(String name, int damage, int size) {
        this.size = size;
        this.damage = damage;
        this.name = name;

    }

    // the methods below will help you access the fields.
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    // What the heck is this?!
    // this is a special method all objects have and we're overriding it so 
    // we can print things the object.
    @Override
    public String toString() {
        return String.format("Name:%s Damage:%d Size:%d", this.name, this.damage, this.size);
    }
    
}
