package task6.Entities;

/*Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.*/

public class Thing {
    private float weight;
    private float cost;
    private boolean inBag;

    public Thing(float weight, float cost) {
        this.weight = weight;
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getWeight() {
        return weight;
    }

    public boolean setWeight(float weight) {  //можем менять вес, только если вещь не в рюкзаке
        if (!inBag) {
            this.weight = weight;
            return true;
        }
        return false;
    }

    public boolean isInBag() {
        return inBag;
    }

    public void setInBag(boolean inBag) {
        this.inBag = inBag;
    }

    @Override
    public String toString() {
        return "Thing" +
                " weight= " + weight +
                ", cost= " + cost;
    }
}
