package zoo.animal;

import zoo.animal.interfacepackage.swim;
import zoo.food.Food;

public class Fish extends Animal implements swim {


    public Fish(String kindOfAnimal, int satietyFull, int satiety) {
        super(kindOfAnimal, satietyFull, satiety);
    }


    @Override
    public void Swim() {
        System.out.println("рыба плывет");
    }


}
