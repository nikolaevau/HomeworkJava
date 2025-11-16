package Homework8;

public class Guitar implements Playable{
    @Override
    public void play(int StringsCount) {
        System.out.println("Гитара играет, используя " + StringsCount + " струн");
    }
}
