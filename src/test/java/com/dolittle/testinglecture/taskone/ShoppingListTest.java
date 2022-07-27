package com.dolittle.testinglecture.taskone;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShoppingListTest {
    @Test
    void shouldAddProductToList(){

        //given
        Product jablko = new Product("jablko", 2.0);
        Product gruszka = new Product("gruszka", 4.0);
        Product pomarancza = new Product("pomarancza", 3.0);
        ShoppingList list = new ShoppingList();
        ShoppingList expectedList = new ShoppingList();
        list.list.add(jablko);
        expectedList.list.add(jablko);
        list.list.add(gruszka);
        expectedList.list.add(gruszka);
        expectedList.list.add(pomarancza);

        //when
        list.addProduct(pomarancza);

        //then
        assertEquals(expectedList.list, list.list);
    }

    @Test
    void shouldDeleteProductFromList(){
        //given
        Product jablko = new Product("jablko", 2.0);
        Product gruszka = new Product("gruszka", 4.0);
        Product pomarancza = new Product("pomarancza", 3.0);
        ShoppingList list = new ShoppingList();
        ShoppingList expectedList = new ShoppingList();
        list.list.add(jablko);
        expectedList.list.add(jablko);
        list.list.add(gruszka);
        expectedList.list.add(gruszka);
        list.list.add(pomarancza);

        //when
        list.deleteProduct(2);
        //list.list.remove(2);

        //then

        assertEquals(expectedList.list, list.list);

    }

    @Test
    void shouldClearList(){
        Product jablko = new Product("jablko", 2.0);
        Product gruszka = new Product("gruszka", 4.0);
        Product pomarancza = new Product("pomarancza", 3.0);
        ShoppingList list = new ShoppingList();
        ShoppingList expectedList = new ShoppingList();
        list.list.add(jablko);
        list.list.add(gruszka);
        list.list.add(pomarancza);

        //when
        list.clearList();

        //then

        assertEquals(expectedList.list, list.list);
    }
}
