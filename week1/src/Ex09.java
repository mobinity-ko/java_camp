import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        // scanner 선언
        Scanner sc = new Scanner(System.in);
        // 문자형에 맞는 값
        System.out.print("성을 입력하세요: ");
        String lastName = sc.next();

        // 문자열형에 맞는 값
        sc.nextLine(); // 앞에서의 남은 개행을 받아와 입력을 받지 못하는 경우 방지
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        // 정수형에 맞는 값
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        // 실수형에 맞는 값
        System.out.print("키를 입력하세요: ");
        double height = sc.nextDouble();

        // 문자열형에 맞는 값
        sc.nextLine();
        System.out.print("자기소개를 입력하세요: ");
        String str = sc.nextLine();

        System.out.println(lastName + name +"님의 나이는 "+ age + "이고 키는 "+ height + "입니다.");
        System.out.println(lastName + name +"님의 자기소개: "+ str);

        // close scanner
        sc.close();
    }
}
