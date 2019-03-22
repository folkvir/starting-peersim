package observers.program;

import observers.DictGraph;
import observers.ObserverProgram;

/**
 * Created by julian on 15/05/15.
 */
public class ClusteringCoefficientProgram implements ObserverProgram {

    public void tick(long currentTick, DictGraph observer) {
        System.err.println(observer.meanPartialViewSize() + " " + observer.meanClusterCoefficient());
    }

    public void onLastTick(DictGraph observer) {

    }
}
