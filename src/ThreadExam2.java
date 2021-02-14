public class ThreadExam2 {

    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("*");
        MyThread2 t2 = new MyThread2("-");
        // Runnable 인터페이스를 상속받은 경우 Thread 객체를 만들어서 사용해야한다.
        // Thread 클래스의 생성자 중 Runnable 을 받는 생성자가 존재한다.
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();

        System.out.println("main end!!!!");
    }
}
