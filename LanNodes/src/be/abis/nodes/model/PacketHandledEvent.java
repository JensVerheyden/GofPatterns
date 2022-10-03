package be.abis.nodes.model;

public class PacketHandledEvent {

    private String message;

    public PacketHandledEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
