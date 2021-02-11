import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {

    public static void main(String[] args) {
        // 사용한 자원을 자동으로 종료하도록 할 수 있다.
        try(
                // DataOutputStream: 다양한 타입을 쓸 수 있다. (장식하는 클래스)
                // FileOutputStream 을 장식한다.
                DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
                ) {
            // 이렇게 저장하면 읽을 때도 DataInputStream 을 이용해야 한다.
            out.writeInt(100); // 4byte 저장
            out.writeBoolean(true); // 1byte 저장
            out.writeDouble(50.5); // 8byte 저장
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
