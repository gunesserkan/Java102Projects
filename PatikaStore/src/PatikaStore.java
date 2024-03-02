import java.util.*;

public class PatikaStore {
    private Set<Brand> brands;

    public PatikaStore() {
        brands = new TreeSet<>();
    }

    public void addBrand(int id, String name) {
        brands.add(new Brand(id, name));
    }

    public void addProduct() {
        Scanner input = new Scanner(System.in);
        System.out.print("Marka id: ");
        int brandId = input.nextInt();
        System.out.print("Ürün türId: ");
        int productType = input.nextInt();
        Brand brand = findBrand(brandId);
        if (brand != null) {
            switch (productType) {
                case 1:
                    new Notebook().createProduct(brand);
                    break;
                case 2:
                    new CellPhone().createProduct(brand);
                    break;
                default:
                    System.out.println("Ürün Eklenemedi, Ürün türü mevcut değil!!");
            }
        } else {
            System.out.println("Marka Bulunamadı!");
        }
    }

    private Brand findBrand(int id) {
        for (Brand brand : brands) {
            if (brand.getId() == id)
                return brand;
        }
        return null;
    }

    public List<Brand> allBrands() {
        return brands.stream().toList();
    }

    public void getProductsList(int productTypeId) {
        try {
            Iterator<Brand> iterator = brands.iterator();
            boolean firstShow = true;
            while (iterator.hasNext()) {
                List<Product> products = iterator.next().getProductsOfBrand(productTypeId);
                for (Product product : products) {
                    if (product instanceof Notebook) {
                        if (firstShow == true) {
                            System.out.format("--------------------------------------------------------------------------------------------------------------------------------------\n");
                            System.out.format("| %-2s | %-30s | %-9s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |\n",
                                    "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Kamera", "Pil", "RAM", "Renk");
                            System.out.format("--------------------------------------------------------------------------------------------------------------------------------------\n");
                        }
                        firstShow = false;
                        Notebook notebook = (Notebook) product;
                        System.out.format("| %-2d | %-30s | %-9.1fTL | %-10s | %-10d | %-10.1f | %-10f | %-10.1f | %-10d | %-10s |\n",
                                notebook.getId(), notebook.getName(), notebook.getPrice(), notebook.getBrand(),
                                notebook.getStorage(), notebook.getScreen(), notebook.getCamera(), notebook.getBattery(),
                                notebook.getRam(), notebook.getColor());
                    } else if (product instanceof CellPhone) {
                        if (firstShow == true) {
                            System.out.format("--------------------------------------------------------------------------------------------------------------------------------------\n");
                            System.out.format("| %-2s | %-30s | %-9s | %-10s | %-10s | %-10s |%-10s    |\n",
                                    "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
                            System.out.format("--------------------------------------------------------------------------------------------------------------------------------------\n");
                        }
                        firstShow = false;
                        CellPhone cellPhone = (CellPhone) product;
                        System.out.format("| %-2d | %-30s | %-9.1f TL | %-10s | %-10d | %-10.1f |%-10d |\n",
                                cellPhone.getId(), cellPhone.getName(), cellPhone.getPrice(), cellPhone.getBrand(),
                                cellPhone.getStorage(), cellPhone.getScreen(), cellPhone.getRam());
                    }
                }
            }
            System.out.format("--------------------------------------------------------------------------------------------------------------------------------------\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteProduct(int productId) {
        try {
            for (Brand tempBrand : brands) {
                List<Product> tempProductList = tempBrand.getMixedProductsOfBrand();
                for (Product product : tempProductList) {
                    if (productId == product.getId()) {
                        tempProductList.remove(tempProductList.indexOf(product));
                        System.out.println("Ürün silindi");
                        return;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void findProductById(int productId) {
        try {
            for (Brand tempBrand : brands) {
                List<Product> tempProductList = tempBrand.getMixedProductsOfBrand();
                for (Product product : tempProductList) {
                    if (productId == product.getId()) {
                        if (product instanceof CellPhone) {
                            System.out.format("--------------------------------------------------------------------------------------------------------------------------------------\n");
                            System.out.format("| %-2s | %-30s | %-9s | %-10s | %-10s | %-10s |%-10s    |\n",
                                    "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
                            System.out.format("--------------------------------------------------------------------------------------------------------------------------------------\n");
                            CellPhone cellPhone = (CellPhone) product;
                            System.out.format("| %-2d | %-30s | %-9.1f TL | %-10s | %-10d | %-10.1f |%-10d |\n",
                                    cellPhone.getId(), cellPhone.getName(), cellPhone.getPrice(), cellPhone.getBrand(),
                                    cellPhone.getStorage(), cellPhone.getScreen(), cellPhone.getRam());
                        } else if (product instanceof Notebook) {
                            System.out.format("--------------------------------------------------------------------------------------------------------------------------------------\n");
                            System.out.format("| %-2s | %-30s | %-9s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |\n",
                                    "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Kamera", "Pil", "RAM", "Renk");
                            System.out.format("--------------------------------------------------------------------------------------------------------------------------------------\n");
                            Notebook notebook = (Notebook) product;
                            System.out.format("| %-2d | %-30s | %-9.1fTL | %-10s | %-10d | %-10.1f | %-10f | %-10.1f | %-10d | %-10s |\n",
                                    notebook.getId(), notebook.getName(), notebook.getPrice(), notebook.getBrand(),
                                    notebook.getStorage(), notebook.getScreen(), notebook.getCamera(), notebook.getBattery(),
                                    notebook.getRam(), notebook.getColor());
                        }
                        return;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
