package com.ing.zoo.models;
/**
 *
 * @author Surafel
 */
public abstract class Animal {

    private String name;
    private String helloText;
    private String eatText;
    private String performText;


    /**
     * constructor
     *
     */
    public Animal(String name) {
        this.name = name;
    }

    public abstract void sayHello();

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getHelloText() {
        return helloText;
    }

    public void setHelloText(String helloText) {
        this.helloText = helloText;
    }

    public String getEatText() {
        return eatText;
    }

    public void setEatText(String eatText) {
        this.eatText = eatText;
    }

    public String getPerformText() {
        return performText;
    }

    public void setPerformText(String performText) {
        this.performText = performText;
    }
}
