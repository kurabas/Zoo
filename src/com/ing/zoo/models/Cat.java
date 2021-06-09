package com.ing.zoo.models;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.Performer;

import java.util.Random;

public class Cat extends Animal implements Carnivore, Performer {
    public String helloText;
    public String eatText;
    public String trick;


    public Cat(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "Miauuuuw";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom miaaaauuuuw";
        System.out.println(eatText);
    }


    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps on a tree";
        }
        else
        {
            trick = "circles twice";
        }
        System.out.println(trick);
    }
}

