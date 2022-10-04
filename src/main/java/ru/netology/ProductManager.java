package ru.netology;


public class ProductManager {
    protected ProductRepository repository;  // поле типа репозиторий

    public ProductManager(ProductRepository repository) { // конструктор с параметором репозитория
        this.repository = repository;
    }

    public void add(Product product) { // метод добавление товаров в репозиторий
        repository.add(product);
    }

    public Product[] getProduct() {
        Product[] all = repository.getProducts();
        return all;
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product : repository.findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }

        return result;

    }

    // метод определения соответствия товара product запросу search
    public boolean matches(Product product, String search) {
        if (product.getName().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}