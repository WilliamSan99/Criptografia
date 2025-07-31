package entities;

import java.time.LocalTime;

public class ClockUtil {

    public static int getDeslocamento() {
        LocalTime agora = LocalTime.now();
        return agora.getHour() + agora.getMinute() + agora.getSecond();
    }

}
