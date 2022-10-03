package be.abis.nodes.factory;

import be.abis.nodes.model.Node;

import java.util.List;

public class LanFacade {

    private LanFactory lanFactory;

    public LanFacade(FactoryType factoryType) {
        this.lanFactory = LanFactory.createFactory(factoryType);
    }

    public List<Node> constructLan() {

        List<Node> nodeList = lanFactory.createNodes();
        lanFactory.createLan(nodeList);

        return nodeList;
    }

}
