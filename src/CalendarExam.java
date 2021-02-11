import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExam {

    public static void main(String[] args) {
        // Calendar 는 추상 클래스이다. -> new 로 객체를 생성할 수 없음.
        // getInstance() 를 실행하면 GregorianCalendar 의 인스턴스를 반환해준다.
        // new GregorianCalendar 로 하지 않는 이유는 생성되는 클래스를 숨겨서 나중에 달력 표준이 변경되는 경우 내부적으로 변경하기 위해 getInstance() 를 사용한다.
        Calendar cal = Calendar.getInstance();
        // Calendar 는 여러가지 상수들을 제공한다.
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1); // java 가 월을 표현할 때 0~11로 표현하기 때문에 +1을 해주어야 한다.
        System.out.println(cal.get(Calendar.DATE));
        // HOUR : 12시간 표현
        // HOUR_OF_DAY : 24시간 표현
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
        // 시간을 변경핧 수 있음
        cal.add(Calendar.HOUR, 5);
    }
}
