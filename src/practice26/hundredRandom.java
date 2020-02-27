package practice26;

public class hundredRandom {
    public static void main(String[] args) {
        hundredRan();
    }

    public static void hundredRan() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(200 + (int) (Math.random() * 100));
        }
    }
}