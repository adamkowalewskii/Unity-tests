package com.dolittle.testinglecture.taskone;

import java.lang.reflect.Array;
import java.util.ArrayList;

// Napisz klase do listy zakupów, która pozwala dodawać produkty, usuwać produkty, czyścić listę,
// zliczać ilość pozycji na liście, a następnie przetestuj ją.
public class ShoppingList {

    ArrayList<Product> list = new ArrayList<>();

    public void addProduct(Product product){
        list.add(product);
    }

    public void deleteProduct(Integer idx){
        list.remove(idx);

    }

    public  void clearList(){
        list.clear();
    }


}
