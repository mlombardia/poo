package tp8.ej8;

import java.util.ArrayList;

public class ArrayFilterList<T> extends ArrayList<T> implements FilterList<T> {
    @Override
    public FilterList<T> filter(Criteria<T> criteria) {
            FilterList<T> result = new ArrayFilterList<>();
            for(T elem:this){
                if(criteria.satisfies(elem)) {
                    result.add(elem);
                }
            }
        return result;
    }
}
