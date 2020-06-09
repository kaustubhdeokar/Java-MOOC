package generics;

import generics.example.Building;
import generics.example.House;
import generics.example.Office;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardExample {

    public static void main(String[] args) {


        Office office1 = new Office();
        Office office2 = new Office();
        Office office3 = new Office();

        List<Office> officeList = Arrays.asList(office1,office2,office3);
        printBuildings(officeList);


        Building building1 = new Building();
        Building building2 = new Building();
        Building building3 = new Building();

        List<Building> buildingList = Arrays.asList(building1,building2,building3);
        printBuildings(buildingList);

        printHouses(buildingList);


    }

    static void printBuildings(List<? extends Building> list){
        for(Building b:list){
            if(b instanceof Office){
                System.out.println("office:-" + b.getName());
            }
            else{
                System.out.println("building:-" + b.getName());
            }
        }
    }
    static void printHouses(List<? super House> list) {

    }

    }
