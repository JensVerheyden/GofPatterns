package be.abis.nodes.model;

import be.abis.nodes.exceptions.NodeNotFoundException;
import be.abis.nodes.factory.LanFactory;

public class PacketHandler extends Node implements PacketListener {
    public PacketHandler(String address) {
        super(address);
    }

    public void doAction(Packet p) {}

    public void receive(Packet p) throws NodeNotFoundException {
        if (p.getDestinationAddress().equals(this.getAddress())) {
           notifySenderOfArrival(p);
        } else {
            send(p);
        }
    }


    @Override
    public void notifySenderOfArrival(Packet p) {
            this.doAction(p);
            for ( WorkStation w : LanFactory.getWorkStationList()) {
                if (w.getAddress().equals(p.getPacketOrigin())) {
                    System.out.println(w.confirm() + ", package with contents " + p.getContents() + " arrived at " + this.getAddress());
                }
            }

    }
}
