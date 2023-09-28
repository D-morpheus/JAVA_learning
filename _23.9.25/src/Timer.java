import java.time.LocalTime;


public class Timer {
    private int hour;
    private int minute;

    /**记录当前时间是24/12小时制*/
    private int clock;
    /**记录AM/PM*/
    private String A_P;

    /**默认构造方法：用当前时间构造对象*/
    public Timer() {
        this.hour = LocalTime.now().getHour();
        this.minute = LocalTime.now().getMinute();
        this.clock = 24;
        this.A_P = "";
    }
    /**用特定时间构造对象*/
    public Timer(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.clock = 24;
        this.A_P = "";
    }
    /**访问时间的小时数的get方法(均以24小时制访问)*/
    public int getHour() {
        if(clock == 12)
        {
            if(A_P.equals("AM"))
            {
                return hour;
            }
            else
            {
                return hour + 12;
            }
        }
        else
        {
            return hour;
        }
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    /**访问时间的分钟数的get方法*/
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    /**增加小时数的方法*/
    public void plusOneHour(){
        if(clock == 12)
        {
            this.to24Clock();
            this.hour = (hour + 1) % 24;
            this.to12Clock();
        }
        else
        {
            this.hour = (hour + 1) % 24;
        }
    }
    public void plusHours(int h){
        if(clock == 12)
        {
            this.to24Clock();
            this.hour = (hour + h) % 24;
            this.to12Clock();
        }
        else
        {
            this.hour = (hour + h) % 24;
        }
    }
    /**增加分钟数的方法*/
    public void plusOneMinute(){
        this.minute = minute + 1;
        this.plusHours(minute/60);
        this.minute %= 60;
    }
    public void plusMinutes(int m){
        this.minute = minute + m;
        this.plusHours(minute/60);
        this.minute %= 60;
    }
    /**24转12*/
    public void to12Clock(){
        if(this.clock == 24){
            if (hour >= 12)
            {
                A_P = "PM";
                hour %= 12;
            }
            else
            {
                A_P = "AM";
            }
            clock = 12;
        }
    }
    /**12转24*/
    public void to24Clock(){
        if(this.clock == 12)
        {
            if(A_P.equals("PM"))
            {
                this.hour = hour + 12;
            }
            //使A_P失效
            A_P = "";
            clock = 24;
        }
    }

    @Override
    public String toString(){
        if(hour < 10)
        {
            if(minute < 10)
            {
                return "0" + this.hour + " : 0" + this.minute + A_P;
            }
            return "0" + this.hour + " : " + this.minute + A_P;
        }
        else
        {
            if(minute < 10)
            {
                return this.hour + " : 0" + this.minute + A_P;
            }
            return this.hour + " : " + this.minute + A_P;
        }
    }
}
