package tp8.ej9;

public class TimeData<T> {
    private T element;
    private int hours;
    private int minutes;

    public TimeData(T elem, int hours, int minutes){
        this.element = elem;
        this.hours = hours;
        this.minutes = minutes;
    }

    public TimeData(T elem){
        this.element = elem;
    }

    public T getElement(){
        return element;
    }

    public int getHours(){
        return hours;
    }

    public int getMinutes(){
        return minutes;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(!(o instanceof TimeData))
            return false;
        TimeData<?> aux = (TimeData<?>)o;
        return getElement().equals(aux.getElement());
    }

    @Override
    public int hashCode(){
        return getElement().hashCode();
    }

    public boolean between(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo){
        return(hours > hoursFrom || hours == hoursFrom && minutes >= minutesFrom)&&(hours < hoursTo || hours == hoursTo && minutes <= minutesTo);
    }
}
