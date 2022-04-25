public class Date {
    int day, month, year;
    public Date(int day, int month, int year){
        if(day>=0 && day<=31 && month>=1 && month<=12 && year>=1900 && year<=9999){
            this.day=day;
            this.month=month;
            this.year=year;
        }else {
            System.out.println("Not input validation needed");
        }

    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        this.day=day;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String toString(){
        return "dd/mm/yyyy: "+ day/month/year;
    }
}
