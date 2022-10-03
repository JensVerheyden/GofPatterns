package be.abis.nodes.model;

import be.abis.nodes.exceptions.NodeNotFoundException;

public class WorkStation extends Node{

    private boolean packetOrigin = false;
    public WorkStation(String address) {
        super(address);
    }

    @Override
    public void send(Packet p) throws NodeNotFoundException {
        if (!this.packetOrigin) {
            getNextComponent().receive(p);
        } else {
            throw new NodeNotFoundException("Destination not found in network");
        }
    }

    public void originate(Packet p) throws NodeNotFoundException {
            this.packetOrigin = true;
            p.setPacketOrigin(this.getAddress());
            getNextComponent().receive(p);

    }

    public String confirm() {
        return this.getAddress();
    }
}
