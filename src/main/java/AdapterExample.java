import adapter.VideoSocket;
import adapter.impl.HMIFromVGA;

public class AdapterExample {
    public static void main(String[] args) {

        VideoSocket hmiFromVga = new HMIFromVGA();
        hmiFromVga.decodeData();

    }
}
