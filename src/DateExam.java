import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

    public static void main(String[] args) {
        // 기본 생성자를 사용하면 현재 시간과 날짜 정보를 가진다.
        Date date = new Date();
        System.out.println(date);
        // '' 로 감싸면 문자열 그대로 출력
        // MM : 월, mm : 분
        // a : 오전, 오후 표시
        // zzz : 타임존
        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println(ft.format(date));
        // 시간을 long 값으로 반환
        System.out.println(date.getTime());
        // 현재 시간을 long 으로 반환
        long today = System.currentTimeMillis();
        System.out.println(today);
        // 코드 실행시간 측정 가능
        System.out.println(today - date.getTime());
    }
}
