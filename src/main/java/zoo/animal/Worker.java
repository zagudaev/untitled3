package zoo.animal;

import zoo.animal.interfacepackage.voice;

public class Worker {

    void getVoice(Animal animal){
        ;
        if (voice.class.isAssignableFrom(animal.getClass())){
            voice voice1 = (zoo.animal.interfacepackage.voice) animal;
            System.out.println(voice1.Voice());

        }

    }
}
