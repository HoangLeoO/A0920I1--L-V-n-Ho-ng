package classVsOPP.baiTap.stopWatch;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime ;
    private LocalTime endTime ;
    private String a = "dsf";

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
    public StopWatch(){
        this.startTime = LocalTime.now();
    }
    public void startTime(){
        this.startTime = LocalTime.now();
    }
    public void endTime(){
        this.startTime = LocalTime.now();
    }

    public int getElapsedTime(){
        int miliSecond = ((endTime.getHour()-startTime.getHour())*36000000 + (endTime.getMinute()-startTime.getMinute())*600000 + (endTime.getSecond()-startTime.getSecond())*1000);
        return miliSecond;
    }
}
