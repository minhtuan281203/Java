public class Time {
    int hour;
    int minute;
    int second;
    public Time(int hour, int minute, int second){
        this.hour= hour;
        this.minute=minute;
        this.second=second;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int hour){
        this.hour=hour;
    }
    public void setMinute(int minute){
        this.minute=minute;
    }
    public void setSecond(int second){
        this.second=second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour= hour;
        this.minute=minute;
        this.second=second;
    }
    public String toString(){
        return "hh:mm:ss are "+ hour+":"+minute+":"+second;
    }

}
