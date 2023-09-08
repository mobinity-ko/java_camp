public class Ex10 {
    public static void main(String[] args) {
        // 선언과 동시에 초기화
        String[] week = {"월", "화", "수", "목", "금", "토", "일"};
        String[] week2 = new String [] {"월", "화", "수", "목", "금", "토", "일"};
        // 초기화 하지 않고 선언
        String[] enWeek = new String[7];
        // String[] enWeek2 = new String[]; // 불가능
        // 배열 인덱스는 0부터 시작한다.
        enWeek[0] = "Mon"; enWeek[1] = "Tue"; enWeek[2] = "Wed";
        enWeek[3] = "Thu"; enWeek[4] = "Fri"; enWeek[5] = "Sat"; enWeek[6] = "Sun";

        // 인덱스 정수를 [] 안에 넣어 접근
        System.out.printf("week의 첫 번째 인덱스 값: %s\n", week[0]);

        // 배열 길이 구하기
        int weekLen = week.length;
        int enWeekLen = enWeek.length;

        // 문자열 배열 기능
        String weekJoin = String.join(", ", week2);
        System.out.printf("일주일: %s\n", weekJoin);
    }
}
