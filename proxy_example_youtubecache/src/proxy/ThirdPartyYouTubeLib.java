package proxy;

import java.util.HashMap;

// Interface de Serviço
public interface ThirdPartyYouTubeLib {
    public HashMap<String, Video> popularVideos();
    public Video getVideo(String videoId);
}