package observers.program;

import observers.DictGraph;
import observers.ObserverProgram;

/**
 * Created by julian on 19/05/15.
 */
public class CostProgram implements ObserverProgram {

    public void tick(long currentTick, DictGraph observer) {

    }

    public void onLastTick(DictGraph observer) {

        for (int i = 0; i < observer.totalOutboundCostPerTick().length; i++) {
            System.err.println(observer.totalOutboundCostPerTick()[i]);
        }

    }
}
