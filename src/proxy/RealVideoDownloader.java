package proxy;

// RealSubject
class RealVideoDownloader implements VideoDownloader {
    @Override
    public void download(String videoUrl) {
        System.out.println("Downloading video from: " + videoUrl);
    }
}
