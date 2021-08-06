package adapter.impl;

import adapter.VideoSocket;
import model.VGA;

public class HMIFromVGA implements VideoSocket {
    VGA vga = new VGA();
    @Override
    public void decodeData() {
        vga.decodeData();
    }
}
