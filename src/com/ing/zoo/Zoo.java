package com.ing.zoo;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.Performer;
import com.ing.zoo.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        List<Animal> animalList = new ArrayList<>();

        Lion henk = new Lion("henk");
        animalList.add(henk);
        Hippo elsa = new Hippo("elsa");
        animalList.add(elsa);
        Pig dora = new Pig("dora");
        animalList.add(dora);
        Tiger wally = new Tiger("wally");
        animalList.add(wally);
        Zebra marty = new Zebra("marty");
        animalList.add(marty);
        Dog martin = new Dog("martin");
        animalList.add(martin);
        Cat sara = new Cat("sara");
        animalList.add(sara);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        //All the animals say hello if the command is 'hello'
        String input = scanner.nextLine();
        if(input.equals(commands[0])){
            for (Animal animal : animalList){
                animal.sayHello();
            }
            //This is for the 'hello' with a name
        } else if (input.substring(0, 5).equals(commands[0]) && input.length() > 5) {
            String name = input.substring(6);
            for (Animal animal : animalList) {
                if (animal.getName().equals(name)) {
                    animal.sayHello();
                }
            }
        }
        //When the command is give leaves
        else if (input.equals(commands[1])){
            for (Animal animal : animalList){
                if (animal instanceof Herbivore){
                    ((Herbivore) animal).eatLeaves();
                }
            }
        }

        //When the command is give meat
        else if (input.equals(commands[2])){
            for (Animal animal : animalList){
                if (animal instanceof Carnivore){
                    ((Carnivore) animal).eatMeat();
                }
            }
        }
        //When the command is performer trick
        else if (input.equals(commands[3])){
            for (Animal animal : animalList){
                if (animal instanceof Performer){
                    ((Performer) animal).performTrick();
                }
            }
        }

        else {
            System.out.println("Unknown command " + input);
        }
    }
}
