package be.abis.nodes.model;

public class PrintServer extends PacketHandler implements PrintStrategy {
    PrintStrategy printStrategy;
    public PrintServer(String address, PrintStrategy printStrategy) {
        super(address);
        this.printStrategy = printStrategy;

    }

    @Override
    public void doAction(Packet p) {
        System.out.print(p.getContents());
        print();
    }


    @Override
    public void print() {
        printStrategy.print();
    }
}

