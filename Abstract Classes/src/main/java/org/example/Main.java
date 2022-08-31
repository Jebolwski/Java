package org.example;

public class Main {
    public static void main(String[] args) {
        WebsiteManager fifavox = new WebsiteManager();
        fifavox.database = new PostgresDatabase();
        fifavox.databaseCreate();
        System.out.println("");
        fifavox.Created();
    }
}