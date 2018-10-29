package tp8.ej3;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class Interval implements Iterable<Double>{
    private double start, end, increment;

    public Interval(double start, double end, double increment){
        if(Math.abs(increment)<Double.MIN_VALUE){
            throw new IllegalArgumentException("Incremento no puede ser 0");
        }
        this.start = start;
        this.end = end;
        this.increment = increment;
        if(size() == 0){
            throw new IllegalArgumentException("Intervalo vacio");
        }
    }

    public Interval(double start, double end){
        this(start,end,1);
    }

    public long size(){
        return Math.max(0, (int) ((end-start)/increment) + 1);
    }

    public double at(long index){
        double answer = start + (increment * index);
        if(index < 0){
            throw new IllegalArgumentException("Fuera de los limites");
        }
        if((increment < 0 && end <= answer && answer <= start) || (increment > 0 && start <= answer && answer <= end)){
            return answer;
        }
        throw new IllegalArgumentException("Fuera de los limites");
    }

    public long indexOf(double valor){
        double inicio, fin, incremento;
        if(start <= end){
            inicio = start;
            fin = end;
            incremento = increment;
        }else{
            inicio = end;
            fin = start;
            incremento = -increment;
        }
        for(double rec = inicio; rec <= fin; rec += incremento){
            if(Math.abs(rec - valor) < epsilon(valor)){
                return Math.round((rec - start)/increment);
            }
        }
        return -1;
    }

    public boolean includes(double valor){
        return indexOf(valor) != -1;
    }

    private double epsilon(double nro){
        return Math.pow(2, -52 + (int) Math.log(Math.abs(nro))/Math.log(2));
    }

    @Override
    public String toString(){
        StringBuilder aux = new StringBuilder("[");
        double rec;
        if(start <= end){
            for(rec = start; rec <= end; rec = rec + increment){
                aux.append(String.valueOf(rec)).append(", ");
            }
        }else{
            for (rec = start; rec >= end; rec = rec + increment){
                aux.append(String.valueOf(rec)).append(", ");
            }
        }
        return aux.substring(0, aux.length() - 2) + "]";
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if (!(o instanceof Interval))
            return false;
        Interval interval = (Interval) o;
        if(Double.compare(interval.start, start) != 0)
            return false;
        if(Double.compare(interval.end, end) != 0)
            return false;
        return Double.compare(interval.increment, increment) == 0;
    }

    @Override
    public int hashCode(){
        int result = Double.hashCode(start);
        result = 31 * result + Double.hashCode(end);
        result = 31 * result + Double.hashCode(increment);
        return result;
    }

    @Override
    public Iterator<Double> iterator() {
        return new IntervalIterator();
    }

    private class IntervalIterator implements Iterator<Double>{

        private double current;

        IntervalIterator(){
            current = start;
        }

        @Override
        public boolean hasNext() {
            return current <= end;
        }

        @Override
        public Double next() {
            if(!hasNext())
                throw new NoSuchElementException();
            double toReturn = current;
            current += increment;
            return toReturn;
        }
    }
}
