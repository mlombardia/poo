package tp5.ej3;

public class Point {
    private Double x;
    private Double y;

    public Point(Double x, Double y){
        this.x = x;
        this.y = y;
    }

    public Double getX(){
        return x;
    }

    public Double getY() {
        return y;
    }

    @Override
    public String toString(){
        return String.format("{%g,%g}", x, y);
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(!(o instanceof Point))
            return false;
        Point aux = (Point) o;
        if(x != aux.x)
            return false;
        return y.equals(aux.y);
    }

    @Override
    public int hashCode(){
        int result=17;
        long aux = Double.doubleToLongBits(x);
        result = (31 * result) + ((int) (aux ^ (aux >>> 32)));
        aux = Double.doubleToLongBits(y);
        result = (31 * result) + ((int) (aux ^ (aux >>>32)));
        return result;
    }
}
