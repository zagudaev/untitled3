package zoo.animal;

import zoo.animal.interfacepackage.swim;
import zoo.food.Food;
import zoo.food.Grass;
import zoo.food.Meat;

public class Bear extends LandAnimal implements swim {
    public Bear(String kindOfAnimal, int satietyFull, int satiety) {
        super(kindOfAnimal, satietyFull, satiety);
    }

    @Override
    public String Eat(Food food, int grams) {
        String str = "";
        if (food instanceof Meat) {
            int satiety = this.getSatiety();
            satiety += food.getNutritionalValue() * grams;
            if (satiety >= this.getSatietyFull()) this.setSatiety(this.getSatietyFull());
            else this.setSatiety(satiety);
            str = "Медведь съел" + satiety + "калорий. Текущая сытость:" + this.getSatiety() + " из " + this.getSatietyFull();


        }else str = "Медведь ест мясо и ничего другого";

        return str;
    }

    @Override
    public String Voice() {
        return "рычит как медведь";
    }

    @Override
    public void Run() {
        System.out.println("косолапит");
    }

    @Override
    public void Swim() {
        System.out.println("медведь плывет");
    }
}
