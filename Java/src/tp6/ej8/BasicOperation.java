package tp6.ej8;

public enum BasicOperation implements Operation{
    SUMA("+"){
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    RESTA("-"){
        @Override
        public double apply(double x, double y){
            return x - y;
        }
    },
    PROD("*"){
        @Override
        public double apply(double x, double y){
            return x * y;
        }
    },
    DIV("/"){
        @Override
        public double apply(double x, double y){
            return x / y;
        }
    };

    private final String symbol;

    BasicOperation(String symbol){
        this.symbol = symbol;
    }

    @Override
    public String toString(){
        return symbol;
    }
}
