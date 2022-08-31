package org.example;

public class MySqlDatabase extends  BaseDatabaseManager {

    public MySqlDatabase(){
        this.databaseName="MySql";
    }
    @Override
    public void databaseCreate(){
        System.out.print("MySql Database Created.");
    };
}
