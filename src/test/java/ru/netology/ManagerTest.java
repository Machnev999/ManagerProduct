package ru.netology;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTest {

    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);
    Book item1 = new Book(1, "Книга 1", 1_000, "Автор 1");
    Book item2 = new Book(2, "Книга 2", 2_000, "Автор 2");
    Smartphone item3 = new Smartphone(3, "Телефон 1", 10_000, "Марка 1");
    Smartphone item4 = new Smartphone(4, "Телефон 2", 20_000, "Марка 2");
    Smartphone item5 = new Smartphone(5, "Телефон 3", 30_000, "Марка 3");





    @Test
    public void setUp() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
    }




    @Test
    public void shouldSearchByNameAndMadeBy() {
        Product[] actual = manager.searchBy("Телефон 1");
        Product[] expected = {item3};

        assertArrayEquals(actual,expected);

    }



    @Test
    public void shouldSearchByNameBook() {
        Product[] actual = manager.searchBy("Книга 2");
        Product[] expected = {item2};
        assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldSearchByNameSmartphone() {
        Product[] actual = manager.searchBy("Телефон 3");
        Product[] expected = {item5};
       assertArrayEquals(actual,expected);
    }

    @Test
    public void shouldSearchByAuthor() {
        Product[] actual = manager.searchBy("Автор");
        Product[] expected = {item1, item2};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldSearchByPart() {
        Product[] actual = manager.searchBy("и");
        Product[] expected = {item1, item2, item3};
        assertArrayEquals(actual,expected);
    }
}