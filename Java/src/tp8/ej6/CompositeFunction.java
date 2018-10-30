package tp8.ej6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeFunction implements Function {

    private List<Function> functions;

    public CompositeFunction(){
        functions = new ArrayList<>();
    }

    public void addFunction(Function function){
        functions.add(function);
    }

    @Override
    public double evaluate(double x) {
        double answer = x;
        if(functions.isEmpty())
            throw new IllegalStateException();
        for(Function f: functions)
            answer = f.evaluate(answer);
        return answer;
    }
}
