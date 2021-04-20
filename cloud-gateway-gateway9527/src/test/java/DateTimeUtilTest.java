import java.time.ZonedDateTime;

/**
 * @author Administrator
 * @description
 * @create 2021-04-20 16:34
 * @since 1.0.0
 */
public class DateTimeUtilTest {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        //2021-04-20T16:34:45.023+08:00[Asia/Shanghai]
    }
}
