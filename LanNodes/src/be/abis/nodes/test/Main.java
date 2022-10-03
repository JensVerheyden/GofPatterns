package be.abis.nodes.test;

import be.abis.nodes.exceptions.NodeNotFoundException;
import be.abis.nodes.factory.FactoryType;
import be.abis.nodes.factory.LanFacade;
import be.abis.nodes.factory.PacketFactory;
import be.abis.nodes.model.Node;

import java.util.List;

public class Main {

    public static void main(String[] args) throws NodeNotFoundException {



        PacketFactory packetFactory = PacketFactory.createFactory(FactoryType.SIMPLE);

        LanFacade lanFacade = new LanFacade(FactoryType.EXTENDED);

        List<Node> nodeList = lanFacade.constructLan();

        nodeList.get(0).originate(packetFactory.createPacket("jkl456", "test"));



        /*        be.abis.nodes.factory.LanFactory lanFactory = be.abis.nodes.factory.LanFactory.createFactory(be.abis.nodes.factory.FactoryType.EXTENDED);
        List<be.abis.nodes.model.Node> nodeList = lanFactory.createNodes();
        lanFactory.createLan(nodeList);*/

/*        nodeList.get(0).originate(packetFactory.createPacket("jkl456", "test"));

        System.out.println(lanFactory.findWorkStation(nodeList, "abc123" ).getAddress());*/

    }



}

