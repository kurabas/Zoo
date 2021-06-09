package com.ing.zoo.models;

import com.ing.zoo.interfaces.Carnivore;

public class Lion extends Animal implements Carnivore {
    public String name;
    public String helloText;
    public String eatText;

    public Lion(String name) {
        super(name);
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
