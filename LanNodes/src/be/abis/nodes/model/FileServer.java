package be.abis.nodes.model;

public class FileServer extends PacketHandler{
    public FileServer(String address) {
        super(address);
    }

    @Override
    public void doAction(Packet p) {
        System.out.println("Saving " +p.getContents() + " in a file");
    }
}
