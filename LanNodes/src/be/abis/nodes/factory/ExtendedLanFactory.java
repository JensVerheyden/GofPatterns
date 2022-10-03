package be.abis.nodes.factory;

import be.abis.nodes.adaptor.TapeStreamerAdaptor;
import be.abis.nodes.model.*;

import java.util.ArrayList;
import java.util.List;

public class ExtendedLanFactory extends LanFactory {

    private static ExtendedLanFactory instance;


    public static ExtendedLanFactory getInstance() {
        if (instance == null) { instance = new ExtendedLanFactory();}
        return instance;
    }


    @Override
    List<Node> createNodes() {
        List<Node> nodeList = new ArrayList<>();
        nodeList.add( new WorkStation("abc123"));;
        nodeList.add( new PrintServer("fre943", new LaserPrinter()));
        nodeList.add( new Node("jhy903"));
        nodeList.add( new WorkStation("paz987"));;
        nodeList.add( new PrintServer("klh324", new InktjetPrinter()));
        nodeList.add( new TapeStreamerAdaptor("pml870", new TapeStreamer()));
        nodeList.add( new MQServer("jkl456"));

        for (Node n : nodeList) {
            if (n instanceof WorkStation) {
                addListener(n);
            }
        }

        return nodeList;
    }
}
