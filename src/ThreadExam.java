public class ThreadExam {

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("*");
        MyThread1 t2 = new MyThread1("-");

        // run() 이 아니라 start() 를 호출한다.
        // start() 는 쓰레드가 실행 준비를 하게 해준다.
        t1.start();
        t2.start();
        // 메인 스레드가 종료된다고 프로그램이 종료되는것이 아니라 모든 스레드가 종료되어야 프로그램이 종료된다.
        System.out.println("main end !!!");
    }
}
