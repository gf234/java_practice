// java 는 단일 상속만 지원하기 때문에 Runnable 인터페이스를 이용하는 방법을 지원한다.
public class MyThread2 implements Runnable{
    String str;
    public MyThread2(String str){
        this.str = str;
    }

    @Override
    public void run(){
        for(int i = 0; i<10;++i){
            System.out.println(str);

            try {
                Thread.sleep((int)(Math.random()*100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
