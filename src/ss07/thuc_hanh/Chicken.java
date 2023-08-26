package ss07.thuc_hanh;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSoud(){
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
