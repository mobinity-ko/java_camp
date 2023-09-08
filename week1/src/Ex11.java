import java.util.ArrayList; // 자바가 기본적으로 제공하는 패키지
import java.util.Arrays;

public class Ex11 {
    public static void main(String[] args) {
        ArrayList<String> studentName = new ArrayList<>();
        // ArrayList<String> studentName2 = new ArrayList<String>(); // 일반적인 방식이지만 자료형이 명확하면 적지 않아도 된다.

        // 요솟값 추가하는 함수
        studentName.add("홍길동");
        studentName.add("김철수");
        studentName.add(0, "최미소");

        // 특정 인덱스 값 추출
        System.out.printf("0번째 학생 이름: %s\n", studentName.get(0));

        // arraylist의 요소 개수
        System.out.printf("학생 리스트 길이: %d\n", studentName.size());

        // 리스트 안에 항목이 있는지 검증하는 함수
        System.out.printf("박미희 학생 존재 여부: %b\n", studentName.contains("박미희"));
        System.out.printf("김철수 학생 존재 여부: %b\n", studentName.contains("김철수"));

        // 항목 삭제
        studentName.remove("최미소");
        studentName.remove(0); // 홍길동 삭제

        System.out.printf("삭제한 뒤 학생 이름 리스트: %s\n", studentName);


        // 심화
        // 배열이 이미 있는 경우 리스트화
        String[] studentNameArr = {"홍길동", "김철수", "박미희"};
        ArrayList<String> studentNameList = new ArrayList<>(Arrays.asList(studentNameArr));

        // ArrayList를 문자열로 만드는 방법
        // for문을 이용해 만드는 방식이 가장 기초이므로 이후 for문을 배울 때 실습해볼 예정이니 아래는 간단하게 알아두고 넘어가기.
        String resultString = String.join(",", studentNameList); // java 8버전부터 사용 가능
        System.out.printf("학생 이름 문자열로 변환: %s\n", resultString);  // 138,129,142 출력
    }
}
