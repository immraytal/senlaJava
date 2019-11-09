package task6.Entities;

/*Рюкзак обладает заданной грузоподъемностью.*/

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private float capacity;
    private List<Thing> things;
    private float weight;                        //текущий вес рюкзака
    private float cost;

    public Bag(float capacity) {
        this.capacity = capacity;
        this.weight = 0f;
        this.things = new ArrayList<>();
        this.cost = 0f;
    }

    public Bag(float capacity, List<Thing> things) {
        this.capacity = capacity;
        this.things = things;
        for (Thing thing:things) {
            this.weight+=thing.getWeight();
            this.cost += thing.getCost();
        }
    }

    public float getCost() {
        return cost;
    }

    public List<Thing> getThings() {
        return things;
    }

    public boolean addThing(Thing thing) {
        if (this.weight + thing.getWeight() <= capacity) {
            this.things.add(thing);
            this.weight+=thing.getWeight();
            this.cost+=thing.getCost();
            thing.setInBag(true);
            return true;
        } else {
            return false;
        }
    }

    public boolean delThing(Thing thing) {
        if (this.things.contains(thing)) {
            this.cost-=thing.getCost();
            this.weight-=thing.getWeight();
            this.things.remove(thing);
            thing.setInBag(false);
            return true;
        }
        return false;
    }

    public float getWeight() {
        return weight;
    }


    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) throws Exception {  // если будет попытка сетнуть вместимость, которая меньше
        if (this.weight > capacity)                             // текущего веса - выдаст исключение
            throw new Exception("Bag has weight more than new capacity");
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "\nBag" +
                " capacity= " + capacity +
                ",\n things= " + things +
                ",\n weight= " + weight +
                ", cost= " + cost;
    }
}
