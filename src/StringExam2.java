public class StringExam2 {

    public static void main(String[] args) {
        // 스트링은 불변 객체
        String str1 = "hello world";
        // 새로운 문자열을 반환한다.
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        // 아무런 문제가 없는것 같아 보이지만 + 연산을 할 때마다 내부적으로 StringBuffer 객체가 생성된다.
        String str3 = str1 + str2;
        System.out.println(str3);
        // 스트링에 + 연산을 하면 내부적으로는 아래와 같은 작업이 이루어진다.
        String str4 = new StringBuffer().append(str1).append(str2).toString();
        System.out.println(str4);
        // 내부적으로 String 객체가 100번 생성된다. -> 문자열을 반복문 안에서 사용하는 것을 피해야 한다.
        String str5 = "";
        for(int i = 0; i<100; ++i){
            str5 = str5 + "*";
        }
        System.out.println(str5);
        // 아래와 같이 StringBuffer 직접 만들어 사용하는것이 효율적이다.
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < 100; ++i){
            sb.append("*");
        }
        String str6 = sb.toString();
        System.out.println(str6);
    }
}
