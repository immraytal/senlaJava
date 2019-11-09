package task6;

/*Имеется набор вещей, которые необходимо поместить в рюкзак.
Рюкзак обладает заданной грузоподъемностью.
Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
Цель задачи заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.
 */

import task6.Entities.Bag;
import task6.Entities.Thing;

import java.util.ArrayList;
import java.util.List;

public class Sixth {
    public static void main(String[] args) {
        Pucker pucker = new Pucker();
        Bag bag = new Bag(10.0f);
        Thing thing = new Thing(5.0f, 3f);          // тест
        Thing thing1 = new Thing(2.0f, 1f);
        Thing thing2 = new Thing(1.0f, 5f);
        Thing thing3 = new Thing(4.0f, 2f);
        Thing thing4 = new Thing(2.0f, 6f);

        List<Thing> things = new ArrayList<>();
        things.add(thing);

        things.add(thing1);
        things.add(thing2);
        things.add(thing3);
        things.add(thing4);

        bag = pucker.puck(bag, things);
        System.out.println(bag.toString());
    }
}
