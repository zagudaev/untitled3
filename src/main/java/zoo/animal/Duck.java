package zoo.animal;

import zoo.animal.interfacepackage.swim;
import zoo.food.Food;
import zoo.food.Grass;

public class Duck extends Bird implements swim {
    public Duck(String kindOfAnimal, int satietyFull, int satiety) {
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
            str = "Утка съела" + satiety + "калорий. Текущая сытость:" + this.getSatiety() + " из " + this.getSatietyFull();


        }else str = "Утка ест траву и ничего другого";

        return str;
    }

    @Override
    public void Run() {
        System.out.println("ковыляет утиным шагом");
    }

    @Override
    public String Voice() {
        return "Кря кря";
    }

    @Override
    public void Swim() {
        System.out.println("Птица плавает по поверхности озера");
    }
}
