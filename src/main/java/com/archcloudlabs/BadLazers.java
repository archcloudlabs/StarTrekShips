package com.archcloudlabs;

public class BadLazers {
    // oh this is bad because the variables are public!
    // that means anyone can poke at these!
    public int size;
    public int damage;
    public String name;

    public BadLazers() {
        size = 10;
        damage = 42;
        name = "Bad Laser";
    }


    
}
