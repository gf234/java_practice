import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        // 같은 값이 이미 존재하면 false 를 반환한다.
        boolean flag1 = set1.add("kang");
        boolean flag2 = set1.add("kim");
        boolean flag3 = set1.add("kang");

        System.out.println(set1.size());

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        Iterator<String> iter = set1.iterator();
        while(iter.hasNext()){
            // 값을 꺼내고 다음 값을 참조한다.
            String str = iter.next();
            System.out.println(str);
        }
    }
}
