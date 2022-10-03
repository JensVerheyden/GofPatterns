package be.abis.nodes.factory;

import be.abis.nodes.model.Packet;

public abstract class PacketFactory {

    public PacketFactory() {
    }

    public static PacketFactory createFactory(FactoryType factoryType) {

        PacketFactory PacketFactory = null;

        switch (factoryType) {
            case SIMPLE:
                PacketFactory = SimplePacketFactory.getInstance();
        }
        return PacketFactory;
    }

    public Packet createPacket(String destinationAddress, String contents) {
        return new Packet(destinationAddress, contents);
    }



}
