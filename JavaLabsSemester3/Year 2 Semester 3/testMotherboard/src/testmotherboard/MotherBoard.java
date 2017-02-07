/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmotherboard;

import java.util.ArrayList;

/**
 *
 * @author x00125128
 */
public class MotherBoard {

    private String manufacturer;
    private int totalCap;
    private ArrayList<MemoryModule> memModule;

    private class MemoryModule {

        private int capacity;

        public MemoryModule(int capacityIn) {

            capacity = capacityIn;

        }

        public String toString() {

            String s;
            s = "size : " + capacity + "mb" + "\n";
            return s;

        }

    }

    public MotherBoard(String m, int c, int totalCapIn) {

        manufacturer = m;
        totalCap = c;

        memModule = new ArrayList<>();

        for (int i = 0; i < totalCapIn; i++) {
            memModule.add(new MemoryModule(totalCap / totalCapIn));
        }

    }

    public String toString() {

        String s;
        s = "Motherboard " + "Manufacturer" + manufacturer + "containing";

        for (int i = 0; i < memModule.size(); i++) {
            s += "\n" + "module" + (i + 1) + " " + memModule.get(i);
        }

        return s;
    }

}
