package hust.soict.dsai.garbage;

public class ConcatenationInLoops {
    private static final int ITERATIONS = 100_000;

    public static void main(String[] args) {
        // Test concatenation with +
        long startTime = System.nanoTime();
        String testString = "";
        for (int i = 0; i < ITERATIONS; i++) {
            testString += i;
        }
        long endTime = System.nanoTime();
        System.out.println("Time with + operator: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // Test concatenation with StringBuffer
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuffer.append(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time with StringBuffer: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // Test concatenation with StringBuilder
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuilder.append(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time with StringBuilder: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}