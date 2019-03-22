package observers.program;

import observers.DictGraph;
import observers.ObserverProgram;

/**
 * Created by julian on 4/29/15.
 */
public class VarianceAndArcCountProgram implements ObserverProgram {

    int lastSize = -1;
    int lastCount = 0;
    int lastCountTemp = 0;
    double firstVar = -1;

    public void tick(long currentTick, DictGraph observer) {

        if (this.lastSize != observer.size()) {
            this.lastSize = observer.size();
            firstVar = observer.variancePartialView();
            lastCount = lastCountTemp;
            lastCountTemp = observer.countArcs();
        }
        // Cyclon cyc = (Cyclon) observer.nodes.get(Network.get(0).getID()).pss;
        System.err.println(observer.countArcs() + " "
                + observer.variancePartialView() + " "
                + observer.meanPartialViewSize() + " " + observer.size() + " "
                + firstVar + " " + lastCount + " " /*+ cyc.getPeers(100000).size()*/);

    }

    public void onLastTick(DictGraph observer) {
        System.err.println("LAST");
    }
}
