public class MusicBoxExam1 {

    public static void main(String[] args) {
        MusicBox box = new MusicBox();
        // box 가 공유 객체가 된다.
        MusicPlayer kang = new MusicPlayer(1, box);
        MusicPlayer kim = new MusicPlayer(2, box);
        MusicPlayer lee = new MusicPlayer(3, box);

        kang.start();
        kim.start();
        lee.start();
    }
}