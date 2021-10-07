package zoo.animal;

import zoo.animal.interfacepackage.fly;
import zoo.animal.interfacepackage.run;
import zoo.animal.interfacepackage.voice;

public class Bird extends Animal implements run, fly, voice {


    public Bird(String kindOfAnimal, int satietyFull, int satiety) {
        super(kindOfAnimal, satietyFull, satiety);
    }



    @Override
    public void Run() {
        System.out.println("Птица передвигается");
    }

    @Override
    public void Fly() {

        System.out.println("Птица полетела");

    }

    @Override
    public String Voice() {
        return "Птичье щебеченье";
    }


}
