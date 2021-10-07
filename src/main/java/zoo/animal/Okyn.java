package zoo.animal;

import zoo.food.Food;
import zoo.food.Grass;

public class Okyn extends Fish {
    public Okyn(String kindOfAnimal, int satietyFull, int satiety) {
        super(kindOfAnimal, satietyFull, satiety);
    }

    @Override
    public String Eat(Food food, int grams) {
        String str = "";
        if (food instanceof Grass) {
            int satiety = this.getSatiety();
            satiety += food.getNutritionalValue() * grams;
            if (satiety >= this.getSatietyFull()) this.setSatiety(this.getSatietyFull());
            else this.setSatiety(satiety);
            str = "Окунь съел" + satiety + "калорий. Текущая сытость:" + this.getSatiety() + " из " + this.getSatietyFull();


        }else str = "окунь ест мясо и ничего другого";

        return str;
    }
}
