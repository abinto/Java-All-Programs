class Test {
    protected void finalize() {
        System.out.println("Object Destroyed");
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("Object Created");
        t = null;
        System.gc();
        System.out.println("Garbage Collection Requested");
    }
}