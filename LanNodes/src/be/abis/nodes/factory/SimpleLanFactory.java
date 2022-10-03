package be.abis.nodes.factory;

import be.abis.nodes.model.FileServer;
import be.abis.nodes.model.MQServer;
import be.abis.nodes.model.Node;

import java.util.ArrayList;
import java.util.List;

public class SimpleLanFactory extends LanFactory {

    private static SimpleLanFactory instance;


    public static SimpleLanFactory getInstance() {
        if (instance == null) { instance = new SimpleLanFactory();}
        return instance;
    }

    List<Node> createNodes() {
        List<Node> nodeList = new ArrayList<>();
        nodeList.add( new Node("abc123"));
        nodeList.add( new Node("fre943"));
        nodeList.add( new Node("jhy903"));
        nodeList.add( new Node("klh324"));
        nodeList.add( new FileServer("jkl456"));
        nodeList.add( new MQServer("pml870"));
        return nodeList;
    }


}
