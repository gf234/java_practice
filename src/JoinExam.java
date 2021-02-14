public class JoinExam {

    public static void main(String[] args) {
        MyThread5 thread = new MyThread5();
        thread.start();

        System.out.println("시작");

        try {
            // join() 을 사용하면 해당 스레드가 끝날 때 까지 기다린다.
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("종료!");
    }
}
