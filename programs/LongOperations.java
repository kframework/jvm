public class LongOperations {

    public static void main(String [ ] args) {
        long i = 5;
        long j = 20;
        if (i < 10)
            j = i * 2;
        for (i = 0; i < 8; i+=2)
            j += 1;
        long k = i + j;
        j = j / 6 - 3;
    }
}
