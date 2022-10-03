package be.abis.nodes.model;

public class InktjetPrinter implements PrintStrategy{


    @Override
    public void print() {
        System.out.println(" printed on inktjet printer");
    }
}
