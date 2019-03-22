import observers.DictGraph;
import observers.ObserverProgram;
import peersim.config.Configuration;
import peersim.core.Network;
import spray.Spray;

import static java.lang.System.exit;

public class MySprayObserver implements ObserverProgram {

    private int myparameterInt;
    private String myparameterString;

    public MySprayObserver(String prefix) {
        try {
            this.myparameterString = Configuration.getString(prefix + ".myparameterString", "hello world");
            this.myparameterInt = Configuration.getInt(prefix + ".myparameterInt", 50);
        } catch (Exception e) {
            System.err.println(e);
            exit(1);
        }
        System.err.println("Parameters set: int: " + myparameterInt + " String: " + myparameterString);
    }

    @Override
    public void tick(long currentTick, DictGraph observer) {
        double meanpvsize = 0;

        for(int i = 0; i< Network.size(); ++i) {
            Spray cyc = (Spray) observer.nodes.get(Network.get(i).getID()).pss;
            meanpvsize += cyc.getPeers(Integer.MAX_VALUE).size();
        }

        meanpvsize = meanpvsize / Network.size();
        System.err.println("Time: " + currentTick + " Average Partial View size: " + meanpvsize);
    }

    @Override
    public void onLastTick(DictGraph observer) {
    }
}
