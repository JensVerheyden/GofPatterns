package be.abis.nodes.model;

public class MQServer extends PacketHandler{
    public MQServer(String address) {
        super(address);
    }

    @Override
    public void doAction(Packet p) {
        System.out.println(p.getContents() + " put on message queu");
    }
}
