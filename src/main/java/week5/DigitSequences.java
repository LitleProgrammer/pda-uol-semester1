package week5;

public class DigitSequences {

    public static void main(String[] args) {
        System.out.println(symetricDigitSequence(0));
        System.out.println(symetricDigitSequenceRec(5));
    }

    public static String symetricDigitSequence(int max) {
        String sequence = "";

        for (int i = max; i > 0; i--) {
            sequence += i;
        }

        for (int i = 0; i <= max; i++) {
            sequence += i;
        }

        return sequence;
    }

    public static String symetricDigitSequenceRec(int max) {
        if (max == 0) {
            return "0";
        }

        return max + symetricDigitSequenceRec(max - 1) + max;
    }

}
