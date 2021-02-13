import java.lang.reflect.Method;

public class MyHelloExam {

    public static void main(String[] args) {
        MyHello hello = new MyHello();

        // getClass() -> Object 의 메소드, 해당 인스턴스를 만들 때 사용한 클래스의 정보를 리턴한다.
        // getDeclaredMethod("hello") -> 그 클래스의 정보로부터 "hello" 라는 이름의 method 정보를 리턴한다.
        try {
            Method method = hello.getClass().getDeclaredMethod("hello");
            // 특정 어노테이션이 메소드에 적용되어 있는지 알아낼 수 있다.
            if(method.isAnnotationPresent(Count100.class)){
                for(int i = 0; i<100; ++i){
                    hello.hello();
                }
            } else{
                hello.hello();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
