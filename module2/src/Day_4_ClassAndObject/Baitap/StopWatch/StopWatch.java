package Day_4_ClassAndObject.Baitap.StopWatch;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Timer;

public class StopWatch {

    private long startTime ;
    private long endTime ;


    public long getStartTime() {
        return this.startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return this.endTime = System.currentTimeMillis();

    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
    public void start(){
        getStartTime();
    }
    public void stop(){
        getEndTime();
    }
}
