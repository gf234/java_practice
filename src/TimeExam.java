import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

    public static void main(String[] args) {
        // java se 8 부터 제공
        // 현재 시간을 구한다.
        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint);
        // 원하는 날짜를 가지는 객체 생성
        LocalDate ld1 = LocalDate.of(2012,12,12);
        System.out.println(ld1);
        // 원하는 시간을 가지는 객체 생성
        LocalTime lt1 = LocalTime.of(17,18);
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.parse("10:15:30");
        System.out.println(lt2);
        // DateTime 에서 여러가지 날짜나 시간 정보를 얻을 수 있다.
        LocalDate theDate = timePoint.toLocalDate();
        System.out.println(theDate);
        Month month = timePoint.getMonth();
        System.out.println(month);
        System.out.println(month.getValue());
        System.out.println(timePoint.getHour());
    }
}
