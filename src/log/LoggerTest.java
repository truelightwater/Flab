// 출처 : https://micropilot.tistory.com/2504
package log;

import java.util.logging.Level;
import java.util.logging.*;
import java.util.*;

public class LoggerTest {
    private static final Logger logger
            = Logger.getLogger(LoggerTest.class.getName());

    public static void main(String[] args) {

        // Logger 를 생성할 때 주어진 이름의 로거가 이미 생성되어 있다면
        // 그 Logger 를 리턴하고 없다면 새로 생성된다.
        Logger logger = Logger.getLogger(LoggerTest.class.getName());

        logger.log(Level.INFO, "Start Logging");

        List<Integer> list = new ArrayList<>();
        logger.log(Level.INFO, "list.size()={0}", list.size());

        Object[] obj = new String[]{"A", "B"};
        logger.log(Level.INFO, "배열 원소={0}, {1}", obj);

        logger.log(Level.INFO, "종료 {0}시간 전입니다.", 1);

        try {
            throw new Exception("심각한 오류입니다.");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "에러, {0}", e.toString());
        }

        // 기본 로거의 레벨이 INFO 이므로 INFO 보다 낮은 레벨인 FINE 은 출력되지 않는다.
        logger.log(Level.FINE, "레벨 FINE 1 로그");

        // 기본 로거의 레벨을 ALL 으로 설정하면 자식 핸들러에서 지정한 모든 레벨의 로그를 출력 할 수 있다.
        logger.setLevel(Level.ALL);

        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.FINE);

        SimpleFormatter sf = new SimpleFormatter();
        ch.setFormatter(sf);

        logger.addHandler(ch);

        logger.log(Level.FINE, "레벨 FINE 2 로그");
    }
}
