package Test;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < Integer.MAX_VALUE; i++){
            new Thread().start();
        }
    }
}

