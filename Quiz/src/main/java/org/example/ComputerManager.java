package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComputerManager {
    ArrayList<Computer> computers = new ArrayList<Computer>();

    public void AddComputer(Computer computer){
        computers.add(computer);
    }


    public ArrayList<Computer> ReverseComputers(){

        Collections.reverse(computers);

        return computers;
    }


    public void GetComputer(Computer computer){
        System.out.println("Cpu : "+computer.CPU+" Speed : "+computer.Speed+" Manufacturer : "+computer.Manufacturer+" Motherboard : "+computer.Motherboard);
    }


}
