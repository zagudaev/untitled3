package zoo.animal;

public class Zoo {
    public static void main(String[] args) {
        Animal duck = new Duck("gernn",100,50);
        Worker worker = new Worker();
        worker.getVoice(duck);
    }
}

