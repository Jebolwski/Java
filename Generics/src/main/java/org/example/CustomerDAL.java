package org.example;

public class CustomerDAL implements IEntityRepo<Customer> {

    @Override
    public void Add(Customer customer) {
        System.out.println("added customer.");
    }

    @Override
    public void Remove(Customer customer) {
        System.out.println("removed customer.");
    }
}
