package hour3;

import java.util.ArrayList;

public class ArrayListLesson {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mazda");
        cars.add("Volvo");
        cars.add("Audi");
        cars.add("Jaguar");
        System.out.println(cars);

        System.out.println(cars.get(1));//output is volvo
        cars.set(3, "Bentley"); // this replaces Jaguar with Bentley
        cars.add("Ford");
        cars.add("Buick");
        cars.add("Jaguar");
        System.out.println(cars);
        System.out.println(cars.size());
        ;

        //  cars.remove(1); removes the element in that index
        //  cars.clear(); gets rid of all elements in the array

        for (int i = 0; i < cars.size(); i++)
        {
            System.out.println("I have a " + cars.get(i)); //this loops through the list and displays current index

        }
    }
}