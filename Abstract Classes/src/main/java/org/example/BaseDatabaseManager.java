package org.example;

public abstract class BaseDatabaseManager {

    String databaseName;


    public abstract void databaseCreate();

    public final void Created(){
        System.out.print("Database created.");
    }

}
