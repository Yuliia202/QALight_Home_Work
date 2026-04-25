//Music: додає поле artist (String) і метод play() (виводить"Відтворюється музика [artist]: [title]").
//Video: додає поле resolution (String) (наприклад, "1920x1080") і метод play()
// (виводить "Відтворюється відео[title] в роздільній здатності [resolution]").
//Створіть об'єкти для кожного класу і викличте метод play() для демонстрації поліморфізму.

package java_hw_53;

public class Music extends Media {
    private String artist;

    public Music(String artist, String title, int duration) {
        super(title, duration);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Music is playing " + artist + ": " + getTitle());
    }
}
