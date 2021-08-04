package model.impl;

import model.VideoSocket;

public class VGASocket implements VideoSocket {

    @Override
    public void decodeMP4() {
        System.out.println("Decoding mp4");
    }
}
