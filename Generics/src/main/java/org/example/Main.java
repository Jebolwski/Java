package org.example;

public class Main {
    public static void main(String[] args) {
        Product supurge = new Product();
        supurge.name="Süpürge";
        ProductDAL productDAL = new ProductDAL();
        productDAL.Add(supurge);
        Customer ali = new Customer();
        ali.name="Ali";
        CustomerDAL customerDal = new CustomerDAL();
        customerDal.Add(ali);
        customerDal.Remove(ali);
        Validator validator = new Validator();
        validator.validate(ali);
    }
}