public class ThreadA {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();

        synchronized (b){
            try{
                System.out.println("b가 완료될때까지 기다립니다.");
                // wait() 도 동기화 블록 안에서 사용한다.
                // b.wait() 를 호출하면 메인 스레드는 정지한다.
                // b 에서 notify() 가 실행되면 메인 스레드가 다시 실행한다.
                // wait() 중에는 반드시 다른 스레드가 notify() 를 호출해야한다.
                b.wait();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Total is : " + b.total);
        }
    }
}
