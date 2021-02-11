import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {

    public static void main(String[] args) {
        // 시간 측정
        long startTime = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/ByteExam1.java");
            fos = new FileOutputStream("byte.txt");

            int readCount = -1;
            // 여러 바이트씩 읽기 (512 바이트씩 읽기)
            byte[] buffer = new byte[512];
            // read(buffer): 최대 버퍼의 크기만큼 읽기
            // 512바이트씩 읽는것이 더 빠른 이유: 1바이트씩 읽어오라고 해도 운영체제는 512바이트씩 읽어오기 때문이다. 512를 읽고 1바이트만 사용하고 511은 버리게 된다.
            while((readCount = fis.read(buffer)) != -1){
                // buffer 의 0부터 시작해서 readCount 만큼 쓰기
                fos.write(buffer,0,readCount);
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
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
