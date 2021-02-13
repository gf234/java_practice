import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 실행시에 감지할 수 있도록 설정한다.
@Retention(RetentionPolicy.RUNTIME)
public @interface Count100 {
}
