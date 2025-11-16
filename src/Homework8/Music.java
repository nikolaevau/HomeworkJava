package Homework8;

public class Music {
    public enum StringsCount {
        GUITAR (6),
        PIANO (230);

private final int count;
        StringsCount(int count) {
            this.count = count;
        }

        public int getCount() {
            return count;
        }
    }
}
