package be.abis.nodes.model;

import be.abis.nodes.exceptions.NodeNotFoundException;

public class Node extends LanComponent{

    public Node(String address) {
        super(address);
    }

    @Override
    public void send(Packet p) throws NodeNotFoundException {
        getNextComponent().receive(p);
    }

    @Override
    public void receive(Packet p) throws NodeNotFoundException {
        this.send(p);
    }


    public void originate(Packet p) throws NodeNotFoundException {}
}
