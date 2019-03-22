package observers.program;

import observers.DictGraph;
import observers.ObserverProgram;

/**
 *
 */
public class ArcCountProgram implements ObserverProgram {

    final int step = 1000;
    boolean isFirst = true;

    /**
     * @param currentTick {}
     * @param observer    {}
     */
    public void tick(long currentTick, DictGraph observer) {
        /*if (CommonState.getTime() > 100 && CommonState.getTime() % step == 0) {
            boolean imp = this.isFirst;
            this.isFirst =false;
            System.out.println("#=================START=================== step:" + CommonState.getTime());
            System.out.println(observer.networkxDigraph(DictGraph.NetworkX.Connectedness, "g" + (CommonState.getTime()), imp));
            System.out.println("#=================END===================");
        }*/
        System.err.println(observer.countArcs() + " " + observer.size());
    }

    /**
     * @param observer {}
     */
    public void onLastTick(DictGraph observer) {
        /*
        System.out.println("#=================START=================== step:" + CommonState.getTime());
        System.out.println(observer.networkxDigraph(DictGraph.NetworkX.Connectedness, "g" + (CommonState.getTime()), true));
        System.out.println("#=================END===================");
        */
    }
}
