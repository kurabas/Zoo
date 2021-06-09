package com.ing.zoo.models;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Performer;

import java.util.Random;

public class Dog extends Animal implements Carnivore, Performer {
    public String helloText;
    public String eatText;
    public String trick;

    public Dog (String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "WoefWoef";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom wafwaf";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "gives one hand";
        }
        else
        {
            trick = "sits down";
        }
        System.out.println(trick);
    }
}
