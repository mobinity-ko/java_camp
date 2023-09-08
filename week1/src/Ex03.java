public class Ex03 {
    public static void main(String[] args) {
        // 정수 자료형
        byte byte_1b = 127;
        short short_2b = 32767;
        int int_4b = 2147483647;
        long long_8b = 9223372036854775807L; // long 자료형의 경우 값이 클 때는 뒤에 l or L 을 붙여야 사용 가능

        // 범위가 벗어나는 경우
        // byte overByte = 129;
        // short overShort = 32768;

        // 가독성을 위한 코드
        int int_4b_read = 214_748_364; // 자바 7 이상부터는 언더스코어 함께 사용 가능
    }
}
