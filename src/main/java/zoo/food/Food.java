package zoo.food;

public abstract class Food {

    private String nameFood;
    private int nutritionalValue;

    public Food(String nameFood, int nutritionalValue) {
        this.nameFood = nameFood;
        this.nutritionalValue = nutritionalValue;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public int getNutritionalValue() {
        return nutritionalValue;
    }

    public void setNutritionalValue(int nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }
}
