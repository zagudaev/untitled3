package zoo.animal;

import zoo.animal.interfacepackage.run;
import zoo.animal.interfacepackage.voice;

public class LandAnimal extends Animal implements run, voice {
    public LandAnimal(String kindOfAnimal, int satietyFull, int satiety) {
        super(kindOfAnimal, satietyFull, satiety);
    }


    @Override
    public void Run() {
        System.out.println("передвигается");

    }

    @Override
    public String Voice() {
        return "издает звук";
    }
}
