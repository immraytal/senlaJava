package task6;

/*Имеется набор вещей, которые необходимо поместить в рюкзак.
Рюкзак обладает заданной грузоподъемностью.
Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
Цель задачи заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.
 */

import task6.Entities.Bag;
import task6.Entities.Thing;

import java.util.Comparator;
import java.util.List;

public class Pucker {
    public Bag puck(Bag bag, List<Thing> things) {
        things.sort(new Comparator<Thing>() {           //сортируем вещи по стоимости
            @Override
            public int compare(Thing o1, Thing o2) {
                if (o1.getCost() == o2.getCost()) return 0;
                else if (o1.getCost() < o2.getCost()) return 1;
                else return -1;
            }
        });


        for(Thing thing: things) {
            if (!thing.isInBag())
                if (!bag.addThing(thing))
                    break;
        }

        things.sort(new Comparator<Thing>() {
            @Override                                   //сортировка по весу
            public int compare(Thing o1, Thing o2) {
                if (o1.getWeight() == o2.getWeight()) return 0;
                else if (o1.getWeight() > o2.getWeight()) return 1;
                else return -1;
            }
        });

        if (things.get(0).getWeight() <= bag.getCapacity()- bag.getWeight()) //если в рюкзак можно положить вещи, которые подходят по весу
        {
            for(Thing thing: things) {
                if (!thing.isInBag())
                bag.addThing(thing);
            }
        }


        return bag;
    }

}


