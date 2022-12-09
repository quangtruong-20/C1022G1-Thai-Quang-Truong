package Day_4_ClassAndObject.bai_tap.StopWatch;

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
