public class Ex08 {
    public static void main(String[] args) {
        // 단순 출력
        System.out.print("hello, world");

        // 출력 후 줄바꿈
        System.out.println();
        System.out.println("hello, world!");

        // 출력 서식
        // boolean
        System.out.printf("불리언 형식: %b\n", false);
        // 정수
        System.out.printf("정수 형식: %d\n", 123);
        // 8진수
        System.out.printf("8진수 형식: %o\n", 123);
        // 16진수
        System.out.printf("16진수 형식: %x\n", 123);
        // 소수점 형식
        System.out.printf("소수점 형식: %f\n", 0.1234567890); // 소수점 6자리까지 표현
        System.out.printf("소수점 형식: %10f\n", 0.12345); // 전체 10자리
        System.out.printf("소수점 형식: %010f\n", 0.12345); // 전체 10자리, 빈자리는 0으로 채움
        System.out.printf("소수점 형식: %3.1f\n", 0.12345); // 전체 3자리, 소수점 아래 1자리
        // 문자 형식
        System.out.printf("문자 형식: %c\n", 'a');
        // 문자열 형식
        System.out.printf("문자열 형식: %s\n", "hello, world!");
        // 줄바꿈
        System.out.printf("줄바꿈: %n");
        // 지수 표현식
        System.out.printf("지수 표현식 형식: %e", 1.145);
    }
}
