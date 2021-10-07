package zoo.animal;

import zoo.animal.interfacepackage.animalActive;
import zoo.food.Food;
//IPOJO.class.isAssignableFrom(clazz)
public abstract class Animal implements animalActive {
        private String kindOfAnimal;
        private int satietyFull;
        private int satiety;

        public String getKindOfAnimal() {
                return kindOfAnimal;
        }

        public void setKindOfAnimal(String kindOfAnimal) {
                this.kindOfAnimal = kindOfAnimal;
        }

        public int getSatietyFull() {
                return satietyFull;
        }

        public void setSatietyFull(int satietyFull) {
                this.satietyFull = satietyFull;
        }

        public int getSatiety() {
                return satiety;
        }

        public void setSatiety(int satiety) {
                this.satiety = satiety;
        }

        public Animal(String kindOfAnimal, int satietyFull, int satiety) {
                this.kindOfAnimal = kindOfAnimal;
                this.satietyFull = satietyFull;
                this.satiety = satiety;
        }

        public String Eat(Food food, int grams) {
                int satiety = this.getSatiety();
                satiety += food.getNutritionalValue() * grams;
                if (satiety >= this.getSatietyFull()) this.setSatiety(this.getSatietyFull());
                else this.setSatiety(satiety);
                String str = "Животное съел" + satiety + "калорий. Текущая сытость:" + this.getSatiety() + " из " + this.getSatietyFull();

                return  str;
        }
}
