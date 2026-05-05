package scratch;
import com.hazelcast.config.Config;
import iuh.fit.spa.product.Product;

public class TestHz {
    public static void main(String[] args) {
        Config config = new Config();
        config.getSerializationConfig().getCompactSerializationConfig().addClass(Product.class);
        System.out.println("Success");
    }
}
