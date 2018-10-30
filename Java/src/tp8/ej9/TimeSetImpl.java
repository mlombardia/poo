package tp8.ej9;

import java.util.*;

public class TimeSetImpl<T> implements TimeSet<T>{

    private Set<TimeData<T>> set = new TreeSet<>(Comparator.<TimeData<T>>comparingInt(TimeData::getHours).thenComparingInt(TimeData::getMinutes));

    @Override
    public void add(T elem, int hours, int minutes) {
        TimeData<T> timeData = new TimeData<>(elem, hours, minutes);
        remove(timeData.getElement());
        set.add(timeData);
    }

    @Override
    public void remove(T elem) {
        Iterator<TimeData<T>> iterator = set.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getElement().equals(elem)){
                iterator.remove();
                break;
            }
        }
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean contains(T elem) {
        /*for(TimeData<T> datum : set){
            if(datum.getElement().equals(elem)){
                return true;
            }
        }
        return false;*/
        return set.stream().anyMatch(timeData -> timeData.getElement().equals(elem));
    }

    @Override
    public Set<T> retrieve(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo) {
        Set<T> response = new HashSet<>();
        for(TimeData<T> timeData : set){
            if(timeData.getHours() > hoursTo){
                break;
            }
            if(timeData.between(hoursFrom, minutesFrom, hoursTo, minutesTo))
                response.add(timeData.getElement());
        }
        return response;
    }
}
