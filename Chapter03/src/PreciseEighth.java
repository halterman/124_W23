
public class PreciseEighth {

    public static void main(String[] args) {
        double oneEighth = 1.0/8.0;
        double one = 1.0;
        
        double zero = one - oneEighth - oneEighth - oneEighth - oneEighth
                      - oneEighth - oneEighth - oneEighth - oneEighth;
        
        System.out.println(zero);

    }

}
