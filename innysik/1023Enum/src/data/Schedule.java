package data;

public class Schedule {

    private WeeksDay weeksDay;

    public WeeksDay getWeeksDay() {
        return weeksDay;
    }

    public void setWeeksDay(WeeksDay weeksDay) {
        this.weeksDay = weeksDay;
    }

    public void wakeUp (){
        if (this.getWeeksDay() == WeeksDay.SATURDAY || this.getWeeksDay() == WeeksDay.SUNDAY){
            //this.get... to call a private object from another Class
            System.out.println("You can sleep longer");
        }else {
            System.out.println("Wake up!");
        }
    }

    public void getMenu (WeeksDay weeksDay){
        switch (weeksDay){
            case MONDAY:
                System.out.println("Goulash");
                break;
            case TUESDAY:
                System.out.println("Spaghetti");
                break;
            case WEDNESDAY:
                System.out.println("Chicken");
                break;
            case THURSDAY:
                System.out.println("Fish");
                break;
            case FRIDAY:
                System.out.println("Pizza");
                break;
        }
    }
}
