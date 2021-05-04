import org.opencv.videoio.VideoCapture;
import org.opencv.videoio.Videoio;

public class TimestampOpenCV {

    public double fps;

    public TimestampOpenCV(String path) {
        VideoCapture capture = new VideoCapture(path);
        this.fps = capture.get(Videoio.CAP_PROP_FPS);
    }

    public double get(int frame) {
        return (double) frame / fps;
    }


}
