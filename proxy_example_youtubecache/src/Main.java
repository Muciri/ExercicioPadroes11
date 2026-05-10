import proxy.ThirdPartyYouTubeClass;
import proxy.YouTubeCacheProxy;
import proxy.YouTubeDownloader;

public class Main {
    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
        System.out.print("Time saved by caching proxy: " + (smart) + "ms");

    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("video01");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("video02");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("video01");
        downloader.renderVideoPage("someothervideo");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
