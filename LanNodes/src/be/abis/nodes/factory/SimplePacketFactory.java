package be.abis.nodes.factory;

import be.abis.nodes.model.Packet;

public class SimplePacketFactory extends PacketFactory{

    private static SimplePacketFactory instance;

    public SimplePacketFactory() {
    }


    public static SimplePacketFactory getInstance() {
        if (instance == null) { instance = new SimplePacketFactory();}
        return instance;
    }


    public Packet createPacket(String destinationAddress, String contents) {
        return new Packet(destinationAddress, contents);
    }

}
