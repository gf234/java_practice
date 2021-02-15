public class LambdaExam {

    public static void main(String[] args) {
        // 인터페이스 중 하나의 메소드만을 가지는 것을 함수형 인터페이스라고 한다. ex) Runnable
        // 자바는 메소드만을 매개변수로 전달할 수 없기 때문에 객체를 생성해서 전달해야 한다.
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<10; ++i){
                    System.out.println("hello");
                }
            }
        }).start();
        // 람다식을 이용하면 간단하게 정의할 수 있다.
        // jvm 이 Thread 생성자를 보고 () -> {} 이 무엇인지 추론을 하여 자동으로 Runnable 을 구현하는 객체로 만들어준다.
        new Thread(()->{
            for(int i = 0; i < 10; ++i){
                System.out.println("hello2");
            }
        }).start();
    }
}
