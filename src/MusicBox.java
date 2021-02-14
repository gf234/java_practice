public class MusicBox {
    public void playMusicA(){
        for(int i = 0; i<10;++i){
            System.out.println("신나는 음악!!!");

            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void playMusicB(){
        for(int i = 0; i<10;++i){
            System.out.println("슬픈 음악!!!");

            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
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
