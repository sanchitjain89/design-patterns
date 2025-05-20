package proxy;

import java.util.ArrayList;
import java.util.List;

// Proxy
class ProxyVideoDownloader implements VideoDownloader {
    private RealVideoDownloader realDownloader = new RealVideoDownloader();
    private List<String> downloadedUrls = new ArrayList<>();

    @Override
    public void download(String videoUrl) {
        if (downloadedUrls.contains(videoUrl)) {
            System.out.println("Using cached video for: " + videoUrl);
        } else {
            realDownloader.download(videoUrl);
            downloadedUrls.add(videoUrl);
        }
    }
}
