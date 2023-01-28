package com.archcloudlabs;


public class StaticLazers {

    private static String thisValueWillExistInEveryObject;

    // static + final == "CONSTANT" and CONSTANTS must be set
    // there is no CONSTANT key word, but rather its composed of static + final
    private static final String constVar = "this value must be set";

    public StaticLazers() {
        // notice the class name being used via "this.", this is due to being a static field.
        // if you use the "this." option, VSCode will suggest you update this.
        // techincally because we're in the same class as the static field, you can use "this."
        // but we'll use the class name to make sure we're all on the same page Static means <classname>.<field>
        StaticLazers.thisValueWillExistInEveryObject = "Whoa this exists in every object";
    }

    public void setThisValueWillExistInEveryObject(String data) {
        // notice the class name being used via "this.", this is due to being a static field.
        StaticLazers.thisValueWillExistInEveryObject = data; 
    }

    @Override
    public String toString() {
        return String.format("Value: %s", thisValueWillExistInEveryObject);
    }

    public static String getThisValueWillExistInEveryObject() {
        return thisValueWillExistInEveryObject;
    }

    /**
     * Return the classes constant variable
     * @param None
     * @return constVar
     */
    public static String getConstvar() {
        return constVar;
    }
    
    // The code below DOES NOT WORK because we have a constant
    // field (static + final). Feel free to uncomment and explore!

    //public static String setConstvar(String data) {
    //   StaticLazers.constVar = data;
    //}

}