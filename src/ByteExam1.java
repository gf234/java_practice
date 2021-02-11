import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/ByteExam1.java");
            fos = new FileOutputStream("byte.txt");

            int readData = -1;
            // read(): 1byte 씩 읽고 int 형식으로 반환한다.
            // 정수 4바이트 중 마지막 바이트에 읽어들인 1 바이트를 저장한다.
            // 더 이상 읽어들일 것이 없을 때 -1을 리턴한다.
            while((readData = fis.read()) != -1){
                fos.write(readData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
