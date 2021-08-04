package adapter;

import model.VideoSocket;
import model.impl.VGASocket;

public class HMISocket implements VideoSocket {
    VGASocket vgaSocket = new VGASocket();
    @Override
    public void decodeMP4() {
        vgaSocket.decodeMP4();
    }
}
