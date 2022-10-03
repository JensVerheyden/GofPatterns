package be.abis.nodes.factory;

import be.abis.nodes.model.Node;
import be.abis.nodes.model.PacketHandler;
import be.abis.nodes.model.Subject;
import be.abis.nodes.model.WorkStation;

import java.util.ArrayList;
import java.util.List;

public abstract class LanFactory implements Subject {

    static List<WorkStation> workStationList = new ArrayList<>();

        public LanFactory() {
        }


        public static LanFactory createFactory(FactoryType factoryType) {

            LanFactory lanFactory = null;

            switch (factoryType) {
                case SIMPLE:
                    lanFactory = SimpleLanFactory.getInstance();
                case EXTENDED:
                    lanFactory = ExtendedLanFactory.getInstance();
            }
            return lanFactory;
        }



    abstract List<Node> createNodes();

    void createLan(List<Node> nodeList) {

        for (int i = 0; i < nodeList.size(); i++) {
            if (i == nodeList.size()-1) {
                nodeList.get(i).setNextComponent(nodeList.get(0));
            } else {
                nodeList.get(i).setNextComponent(nodeList.get(i+1));
            }
        }
    }

    Node findWorkStation(List<Node> nodeList, String address) {
        Node workStation = null;
        for (Node n : nodeList) {
            if (n instanceof WorkStation && n.getAddress().equals(address)) {
                workStation = n;
            }
        }
        return workStation;
    }


    @Override
    public void addListener(Node n) {
        workStationList.add((WorkStation) n);

    }

    @Override
    public void removeListener(Node n) {
        workStationList.remove(n);

    }

    public static List<WorkStation> getWorkStationList() {
        return workStationList;
    }
}
