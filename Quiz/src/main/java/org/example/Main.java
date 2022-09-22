package org.example;

public class Main {
    public static void main(String[] args) {
        Computer Asus = new Computer("intel i7 8400","MotherBoard","Casper",2000);
        Computer Razor = new Computer("Asus 2400","MotherBoard","Razor",1000);
        Computer Msi = new Computer("MSI 2400","MotherBoard","MSI",3000);
        ComputerManager computerManager = new ComputerManager();
        computerManager.AddComputer(Asus);
        computerManager.AddComputer(Msi);
        computerManager.AddComputer(Razor);
        for (int i=0;i<computerManager.computers.size();i++){
            Computer computer_tem = computerManager.computers.get(i);
            computerManager.GetComputer(computer_tem);
        }
        System.out.println("");
        computerManager.ReverseComputers();
        for (int i=0;i<computerManager.computers.size();i++){
            Computer computer_tem = computerManager.computers.get(i);
            computerManager.GetComputer(computer_tem);
        }
    }
}