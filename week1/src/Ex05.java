public class Ex05 {
    public static void main(String[] args) {
        // 문자
        char ch1 = 'a';  // 문자로 표현
        char ch2 = 97;  // 아스키코드로 표현
        char ch3 = '\u0061';  // 유니코드로 표현

        // 문자열
        String st1 = "Hello, world!"; // 리터럴 표기 방식
        String st2 = new String("Hello, world!"); // 새로운 string 객체

        // 문자열 비교 방식
        System.out.println(st1 == st2); // 자료형이 같은지 확인
        System.out.println(st1.equals(st2));
    }
}
