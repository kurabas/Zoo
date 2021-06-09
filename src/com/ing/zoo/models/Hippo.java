package com.ing.zoo.models;

import com.ing.zoo.interfaces.Herbivore;

public class Hippo extends Animal implements Herbivore {
    public String name;
    public String helloText;
    public String eatText;

    public Hippo(String name){
        super(name);
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
