package be.abis.nodes.model;

import be.abis.nodes.exceptions.NodeNotFoundException;

public class LanComponent {

    private String address;
    private LanComponent nextComponent;

    public LanComponent(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LanComponent getNextComponent() {
        return nextComponent;
    }

    public void setNextComponent(LanComponent nextComponent) {
        this.nextComponent = nextComponent;
    }

    public void send(Packet p) throws NodeNotFoundException {

    }

    public void receive(Packet p) throws NodeNotFoundException {
    }
}
