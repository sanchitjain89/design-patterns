package proxy;

// Client
public class ProxyPatternDemo {
    public static void main(String[] args) {
        VideoDownloader downloader = new ProxyVideoDownloader();

        downloader.download("http://youtube.com/video1");
        downloader.download("http://youtube.com/video2");
        downloader.download("http://youtube.com/video1"); // cached
    }
}
