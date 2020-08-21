import java.util.Comparator;

public class SortProductDecrease implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        if (product1.gia < product2.gia){
            return 1;
        }
        else if (product1.gia == product2.gia){
            return 0;
        }
        else {
            return -1;
        }
    }
}
