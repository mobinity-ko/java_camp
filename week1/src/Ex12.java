import java.util.HashMap;

public class Ex12 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // key, value 추가
        map.put("java", "자바");
        map.put("python", "파이썬");
        map.put("js", "자바스크립트");

        // 키로 값 출력
        System.out.printf("자바 값 출력: %s\n", map.get("java"));

        // 맵에 해당 키가 있는지 확인
        System.out.printf("자바 존재 여부: %b\n", map.containsKey("java"));
        System.out.printf("타입스크립트 존재 여부: %b\n", map.containsKey("ts"));

        // 맵 항목 삭제
        map.remove("python");
        System.out.printf("항목 삭제 후 맵: %s\n", map);

        // 맵 요소 개수
        System.out.printf("맵 요소 개수: %d\n", map.size());

        // 맵의 모든 키 확인
        System.out.printf("맵의 모든 키 확인: %s\n", map.keySet());
    }
}
