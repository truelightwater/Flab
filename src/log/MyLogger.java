// 출처 : https://sdesigner.tistory.com/100
package log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
    // String 을 기준으로 Logger 클래스 인스턴스 할당
    Logger logger = Logger.getLogger("mylogger");
    private static MyLogger instance = new MyLogger();

    // Levelquf Log를 생성할 파일 지정
    private static final String errorLog = "log.txt";
    private static final String warningLog = "warning.txt";
    private static final String fineLog = "fine.txt";

    private FileHandler logfile = null;
    private FileHandler warningFile = null;
    private FileHandler fineFile = null;

    private MyLogger() {
        try {
            // path, append 방식으로 생성
            logfile = new FileHandler(errorLog, true);
            warningFile = new FileHandler(warningLog, true);
            fineFile = new FileHandler(fineLog, true);

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        logfile.setFormatter(new SimpleFormatter());
        warningFile.setFormatter(new SimpleFormatter());
        fineFile.setFormatter(new SimpleFormatter());

        logfile.setLevel(Level.ALL);
        fineFile.setLevel(Level.FINE);
        warningFile.setLevel(Level.WARNING);

    }

    public static MyLogger getLogger() {
        return instance;
    }

}
