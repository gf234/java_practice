import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteExam4 {

    public static void main(String[] args) {
        try(
                DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));
                ){
            // 저장할때 지정한 타입으로 불러올 수 있다. (파일을 눈으로 읽을 수는 없음)
            int i = in.readInt();
            boolean b = in.readBoolean();
            double d = in.readDouble();

            System.out.println(i);
            System.out.println(b);
            System.out.println(d);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
