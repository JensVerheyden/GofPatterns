package be.abis.nodes.adaptor;

import be.abis.nodes.model.Packet;
import be.abis.nodes.model.PacketHandler;
import be.abis.nodes.model.TapeStreamer;

public class TapeStreamerAdaptor extends PacketHandler {

    TapeStreamer tapeStreamer;

    public TapeStreamerAdaptor(String address, TapeStreamer tapeStreamer) {
        super(address);
        this.tapeStreamer = tapeStreamer;
    }

    public TapeStreamer getTapeStreamer() {
        return tapeStreamer;
    }

    public void setTapeStreamer(TapeStreamer tapeStreamer) {
        this.tapeStreamer = tapeStreamer;
    }

    @Override
    public void doAction(Packet p) {
        tapeStreamer.stream(p);
    }
}
