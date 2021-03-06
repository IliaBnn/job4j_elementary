package ru.job4j.pojo;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

public class ShopDropTest {

    @Test
    public void whenDropFirst() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.leftShift(products, 0);
        assertThat(rsl[0].getName(), is("Bread"));
        assertThat(rsl[1], is(nullValue()));
    }

    @Test
    public void whenDropLast() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.leftShift(products, 1);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[1], is(nullValue()));
    }

    @Test
    public void whenDropFirstFrom4() {
        Product[] products = new Product[4];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Meat", 15);
        products[3] = new Product("Potato", 8);
        Product[] rsl = ShopDrop.leftShift(products, 0);
        assertThat(rsl[2].getName(), is("Potato"));
        assertThat(rsl[3], is(nullValue()));
    }

    @Test
    public void whenDropSecondFrom4() {
        Product[] products = new Product[4];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Meat", 15);
        products[3] = new Product("Potato", 8);
        Product[] rsl = ShopDrop.leftShift(products, 1);
        assertThat(rsl[2].getName(), is("Potato"));
        assertThat(rsl[3], is(nullValue()));
        assertThat(rsl[1].getName(), is("Meat"));
    }
}