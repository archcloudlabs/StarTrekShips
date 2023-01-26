package com.archcloudlabs;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Space Lazers are C00L!");


        // Whoa two objects of the lazers class being created with different constructors
        Lazers laser = new Lazers(); 
        Lazers laser2 = new Lazers("super cool lazer", 10, 99); 

        BadLazers badlazer = new BadLazers(); // this object has publicly accessible fields...what can go wrong?

        System.out.println(laser.toString());
        System.out.println(laser2.toString());
        System.out.println(badlazer.name);

        // an example of why having public fields can be super bad
        badlazer.name = "whoa what! I can just overwite this field?";
        System.out.println(badlazer.name);
        badlazer.name = "oh no this object can just be modified Yikes!";
        System.out.println(badlazer.name);



    }
}
