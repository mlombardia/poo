package tp6.ej4;

public class Interval {
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
}
