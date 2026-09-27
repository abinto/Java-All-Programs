class Test {
    static int count = 0;

    Test() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) {
        new Test();
        new Test();
        new Test();

        System.out.println("Objects Created : " + Test.count);
    }
}