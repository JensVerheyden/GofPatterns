package be.abis.nodes.model;

public class LaserPrinter implements PrintStrategy{


    @Override
    public void print() {
        System.out.println(" printed on laser printer");
    }
}
