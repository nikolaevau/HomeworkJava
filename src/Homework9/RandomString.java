package Homework9;

class RandomString {
    public String[] strings = {
            "Строка 1",
            "Строка 2",
            "Строка 3"
    };
    public void printRandomString () {
       int randomIndex = (int) (Math.random()*3);
       System.out.println("Выбрана строка: " + strings[randomIndex]);
    }
    public static void main(String[] args) {
        RandomString printer = new RandomString();
        printer.printRandomString();
    }
}
