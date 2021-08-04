import adapter.HMISocket;
import model.VideoSocket;
import model.impl.VGASocket;

public class AdapterExample {
    public static void main(String[] args) {
        VideoSocket vgaSocket = new VGASocket();
        vgaSocket.decodeMP4();

        VideoSocket hmiSocket = new HMISocket();
        hmiSocket.decodeMP4();
    }
}
