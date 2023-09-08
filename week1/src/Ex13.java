import java.util.Arrays;
import java.util.HashSet;

public class Ex13 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("A", "B", "C", "A"));
        System.out.println(set);  // 중복 허용 X, 순서 X

        // 집합 자료형 값 추가
        set.add("AA");
        set.add("BB");
        set.add("A");
        System.out.printf("집합 자료형 값 추가: %s\n", set);
        // 집합 자료형 값 다중 추가
        set.addAll(Arrays.asList("CC", "DD"));
        System.out.printf("집합 자료형 값 다중 추가: %s\n", set);

        // 집합 자료형 값 삭제
        set.remove("CC");
        System.out.printf("집합 자료형 값 삭: %s\n", set);

    }
}
