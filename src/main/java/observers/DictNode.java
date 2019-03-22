package observers;

import rps.IRandomPeerSampling;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by julian on 26/01/15.
 */
public class DictNode {

    public long id;
    public List<Long> neighbors;
    public IRandomPeerSampling pss;
    public int pid;

    public DictNode(long id, IRandomPeerSampling pss, int pid) {
        this.id = id;
        this.neighbors = new ArrayList<Long>();
        this.pss = pss;
        this.pid = pid;
    }

    public void reset() {
        this.neighbors.clear();
    }

    @Override
    public String toString() {
        return "(" + id + ") -> " + this.neighbors.toString();
    }
}
