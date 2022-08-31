package org.example;

public class WebsiteManager extends  BaseDatabaseManager {
    BaseDatabaseManager database;

    @Override
    public void databaseCreate(){
        System.out.print("Websites database created. ("+database.databaseName+")");
    }
}
