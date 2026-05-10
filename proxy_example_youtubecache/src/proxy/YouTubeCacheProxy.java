package proxy;

import java.util.HashMap;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib youTubeClass;
    private HashMap<String, Video> popularVideos = new HashMap<String, Video>();
    private HashMap<String, Video> personalVideos = new HashMap<String, Video>();

    @Override
    public HashMap<String, Video> popularVideos() {
        initializateIfEmpty();
        
        if(popularVideos.isEmpty()) {
            popularVideos = youTubeClass.popularVideos();
        } else {
            System.out.println("log: pegou vídeos do cache");
        }
        
        return popularVideos;
    }

    @Override
    public Video getVideo(String videoId) {
        initializateIfEmpty();

        if(!personalVideos.containsKey(videoId)) {
            personalVideos.put(videoId, youTubeClass.getVideo(videoId));
        } else {
            System.out.println("log: pegou vídeo pessoal do Cache");
        }
        
        return personalVideos.get(videoId);
    }

    private void initializateIfEmpty() {
        if(this.youTubeClass == null) {
            this.youTubeClass = new ThirdPartyYouTubeClass();
        }
    }
}