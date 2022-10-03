package be.abis.nodes.factory;

import be.abis.nodes.model.Packet;

public class SuperPacketFactory extends PacketFactory{

    private static SuperPacketFactory instance;

    public SuperPacketFactory() {
    }


    public static SuperPacketFactory getInstance() {
        if (instance == null) { instance = new SuperPacketFactory();}
        return instance;
    }


    public Packet createPacket(String destinationAddress, String contents) {
        return new Packet(destinationAddress, contents);
    }
}
