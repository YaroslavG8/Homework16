package Set;

import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        Pet cat1 = new Cat("cat1");
        Pet cat2 = new Cat("cat2");
        Pet cat3 = new Cat("cat3");
        Pet dog1 = new Dog("dog1");
        Pet dog2 = new Dog("dog2");
        Pet dog3 = new Dog("dog3");

        Set<Pet> set = new HashSet();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(dog1);
        set.add(dog2);
        set.add(dog3);


        for (Pet item: set)
            System.out.println(item);
    }
}