package be.abis.nodes.model;

public class Packet {

    private String destinationAddress;
    private String contents;
    private String packetOrigin;

    public Packet(String destinationAddress, String contents) {
        this.destinationAddress = destinationAddress;
        this.contents = contents;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getPacketOrigin() {
        return packetOrigin;
    }

    public void setPacketOrigin(String packetOrigin) {
        this.packetOrigin = packetOrigin;
    }
}
