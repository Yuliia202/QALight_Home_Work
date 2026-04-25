//Video: додає поле resolution (String) (наприклад, "1920x1080") і метод play()
// (виводить "Відтворюється відео[title] в роздільній здатності [resolution]").
//Створіть об'єкти для кожного класу і викличте метод play() для демонстрації поліморфізму.

package java_hw_53;

public class Video extends Media {
    private String resolution;

    public Video(String resolution, String title, int duration) {
        super(title, duration);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public void play() {
        System.out.println("Video is playing " + getTitle() + " in resolution " + resolution);
    }

}
