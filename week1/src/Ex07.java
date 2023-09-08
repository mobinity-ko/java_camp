public class Ex07 {
    public static void main(String[] args) {
        // 정수 자료형
        byte byte_1b = 127;
        short short_2b = 32767;
        int int_4b = 2147483647;
        long long_8b = 9223372036854775807L;

        //  묵시적 형 변환 (작은 수 -> 큰 수)
        // byte -> short
        short_2b = byte_1b;

        // byte->int / short ->int
        int_4b = byte_1b;
        int_4b = short_2b;

        // byte -> long / short -> long / int -> long
        long_8b = byte_1b;
        long_8b = short_2b;
        long_8b = int_4b;

        //  명시적 형 변환 (큰 수 -> 작은 수)
        // int_4b = long_8b; (long -> int)
        int_4b = (int) long_8b;

        // byte->int / short ->int
        // short_2b = int_4b; (int -> short)
        // short_2b = long_8b; (long->short)
        short_2b = (short) int_4b;
        short_2b = (short) long_8b;

        // byte -> long / short -> long / int -> long
        // byte_1b = short_2b; (short -> byte)
        // byte_1b = int_4b; (int -> byte)
        // byte_1b = long_8b; (long -> byte)
        byte_1b = (byte) short_2b;
        byte_1b = (byte) int_4b;
        byte_1b = (byte) long_8b;
    }
}
