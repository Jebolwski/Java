package org.example;

public class PostgresDatabase extends  BaseDatabaseManager {
    public  PostgresDatabase(){
        this.databaseName="Postgres";
    }
    @Override
    public void databaseCreate(){
        System.out.print("Postgres Database Created.");
    };
}