package org.example;

public class ProductDAL implements  IEntityRepo<Product>{
    @Override
    public void Add(Product product) {
        System.out.println("added product "+product.name+".");
    }

    @Override
    public void Remove(Product product) {
        System.out.println("removed product"+product.name+".");
    }
}
