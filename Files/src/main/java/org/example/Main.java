package org.example;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\mertg\\IdeaProjects\\Files\\src\\main\\java\\org\\example\\students.txt");
        try{
            if ( !file.createNewFile() ){
                System.out.println("File already exists!");
            }
            else{
                System.out.println("File created.");
            }
        }
        catch (Exception exception){
            System.out.println(exception);
        }

        if (file.exists()){
            System.out.println("Dosya adı : "+file.getName());
            System.out.println("Dosya okunabilir mi : "+file.canRead());
            System.out.println("Dosyaya yazılıbilir mi : "+file.canWrite());
            System.out.println("Dosya yolu : "+file.getAbsolutePath());
        }
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scan.hasNext()){
            System.out.println(scan.next());
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file.getAbsoluteFile(),true));
            writer.write("CHELLINI");
            writer.newLine();
            writer.close();
        }
        catch (Exception exception){
            System.out.println("AAAAAA HATA");
        }
    }
}