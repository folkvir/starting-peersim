package observers;

/**
 * Created by julian on 4/29/15.
 */
public interface ObserverProgram {

    void tick(long currentTick, DictGraph observer);

    void onLastTick(DictGraph observer);

}
