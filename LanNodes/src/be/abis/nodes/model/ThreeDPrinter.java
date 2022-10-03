package be.abis.nodes.model;

public class ThreeDPrinter implements PrintStrategy{

    @Override
    public void print() {
        System.out.println(" printed on inktjet printer");
    }
}
