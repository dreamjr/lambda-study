package main;

import main.map.MapOperation;

public class Main {

    public static void main(String[] args) {
        // FilterOperation filterTest = new FilterOperation();
        // filterTest.printFilteredNameList();

        MapOperation mapOperation = new MapOperation();
        mapOperation.printMapNames();
        mapOperation.printObjectMapToInt();
        mapOperation.printObjectMapToObject();
    }
}
