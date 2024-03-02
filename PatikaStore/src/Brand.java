import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Brand implements Comparable<Brand> {
    private int id;
    private String name;
    private List<Product> products = new LinkedList<>();
    int productIDCounter;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
        this.productIDCounter=0;
    }

    public void addProduct(Product product) {
            products.add(product);
        }

    public List<Product> getProductsOfBrand(int productTypeId) throws Exception {
        if (productTypeId == 1) {
            List<Product> noteBooks = products.stream()
                    .filter(product -> product instanceof Notebook)
                    .collect(Collectors.toList());
            return noteBooks;
        } else if (productTypeId == 2) {
            List<Product> cellPhones = products.stream()
                    .filter(product -> product instanceof CellPhone)
                    .collect(Collectors.toList());
            return cellPhones;
        }
        else {
            throw new Exception("Ürün Bulunamadı");
        }
    }

    public int getProductIDCounter() {
        return ++productIDCounter;
    }

    public void setProductIDCounter(int productIDCounter) {
        this.productIDCounter = productIDCounter;
    }

    public List<Product> getMixedProductsOfBrand(){
        return products;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Brand o) {
        return this.getName().compareTo(o.getName());
    }
}
