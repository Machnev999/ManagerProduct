package ru.netology;


public class ProductRepository {
    private Product[] products = new Product[0];


    public Product[] getProducts() {
        return products;
    }




    public Product[] getItems() {
        return products;
    }



    // добавляем товар
    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1];// создадим новую линию массива
        // перебираем и фиксируем в новый массив тмп
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;// создаем ячейку в массиве для последней переменной
        products = tmp;
    }



    //показываем весь товар
    public Product[] findAll() {
        return products;
    }

    //удвление по id
    public Product[] removeById(int id) {
        int length = products.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[index] = product;
                index++;
            }
        }
        products = tmp;
        return products;
    }


}
