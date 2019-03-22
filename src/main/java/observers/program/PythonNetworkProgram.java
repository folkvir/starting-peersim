package observers.program;

import peersim.core.CommonState;
import observers.DictGraph;
import observers.ObserverProgram;

/**
 * This Program will print the network as Python-graph
 * <p>
 * Created by julian on 02/05/15.
 */
public class PythonNetworkProgram implements ObserverProgram {

    final int step = 100;
    boolean isFirst = true;

    /**
     * @param currentTick
     * @param observer
     */
    public void tick(long currentTick, DictGraph observer) {

        if (CommonState.getTime() > 100 && CommonState.getTime() % step == 0) {
            boolean imp = this.isFirst;
            this.isFirst = false;
            System.err.println("#=================START=================== step:" + CommonState.getTime());
            System.err.println(observer.networkxDigraph(DictGraph.NetworkX.Connectedness, "g" + (CommonState.getTime()), imp));
            System.err.println("#=================END===================");
        }

    }

    /**
     * @param observer
     */
    public void onLastTick(DictGraph observer) {
        /*
        System.out.println("#=================START=================== step:" + CommonState.getTime());
        System.out.println(observer.networkxDigraph(DictGraph.NetworkX.Connectedness, "g" + (MAX_SIZE - observer.size()), true));
        System.out.println("#=================END===================");
        */
    }
}
