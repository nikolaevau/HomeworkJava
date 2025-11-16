package Homework8;

public class Piano implements Playable{
    @Override
    public void play(int StringsCount) {
        System.out.println("Пианино играет, используя " + StringsCount + " струн");
    }
}
