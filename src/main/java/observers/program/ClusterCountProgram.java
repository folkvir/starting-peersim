package observers.program;

import observers.DictGraph;
import observers.ObserverProgram;

/**
 * Created by julian on 4/30/15.
 */
public class ClusterCountProgram implements ObserverProgram {

    final int COUNTDOWN = 30;
    int prevSize = -1;
    int countDown = COUNTDOWN;

    /**
     * @param currentTick
     * @param observer
     */
    public void tick(long currentTick, DictGraph observer) {

        if (prevSize == -1) {
            prevSize = observer.size();
        } else if (prevSize < observer.size()) {
            prevSize = observer.size();
        }

        if (prevSize > observer.size()) {
            // we are loosing nodes

            if (countDown == 0) {
                countDown = COUNTDOWN;
                prevSize = observer.size();
                DictGraph.ClusterResult r = observer.countClusters();
                System.err.println(r.count + " " + r.deadLinks + " " + r.maxClusterSize);
            }
            countDown--;
        }
    }

    /**
     * @param observer
     */
    public void onLastTick(DictGraph observer) {

    }
}
