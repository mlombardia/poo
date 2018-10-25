package tp6.ej7;

public class ContinentTester {
    public static void main(String args[]){
        System.out.println("Densidades de poblacion:");
        for(Continent continent: Continent.values()){
            System.out.println(String.format("%s = %.2f", continent, continent.getPopulationRatio()));
        }
        System.out.printf("%.2f", Continent.valueOf("AMERICA").getPopulationRatio());
    }
}
