import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "kim");
        map.put("002", "lee");
        map.put("003", "choi");
        // 같은 키로 값을 입력하면 새로운 값으로 업데이트 된다.
        map.put("001", "kang");

        System.out.println(map.size());

        Set<String> keys = map.keySet();

        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()){
            String key = iter.next();
            String value = map.get(key);
            System.out.println(key+":"+value);
        }
    }
}
