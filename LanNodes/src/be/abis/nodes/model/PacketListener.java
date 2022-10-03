package be.abis.nodes.model;

public interface PacketListener {

    void notifySenderOfArrival(Packet p);
}
