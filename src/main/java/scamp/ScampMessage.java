package scamp;

import rps.IMessage;

public class ScampMessage implements IMessage {

    private int occ; // number of identities to spread in the network

    public ScampMessage(int occ) {
        this.occ = occ;
    }

    public Object getPayload() {
        return this.occ;
    }

}
