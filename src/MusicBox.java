public class MusicBox {
    // synchronized 키워드를 붙이면 Monitoring Lock 을 얻어 다른 스레드가 해당 객체를 사용하지 못하게 한다.
    // 모니터링 락은 메소드가 종료되거나 wait()와 같은 메소드를 만나기 전까지 유지된다.
    public synchronized void playMusicA(){
        for(int i = 0; i<10;++i){
            System.out.println("신나는 음악!!!");

            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    // synchronized 블록을 이용하면 메소드 전체가 아니라 특정 부분에만 적용할 수 있다.
    public void playMusicB(){
        for(int i = 0; i<10;++i){
            synchronized (this){
                System.out.println("슬픈 음악!!!");
            }

            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    // synchronized 키워드를 붙이지 않으면 모니터링 락과 관계 없이 실행된다.
    public void playMusicC(){
        for(int i = 0; i<10;++i){
            System.out.println("카페 음악!!!");

            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
