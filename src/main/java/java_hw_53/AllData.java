//Створіть базовий клас Media з полями: title (String) і duration(int) (тривалість у хвилинах),
// і методом play() (виводить"Відтворення мультимедіа").
//Створіть підкласи:
//Music: додає поле artist (String) і метод play() (виводить"Відтворюється музика [artist]: [title]").
//Video: додає поле resolution (String) (наприклад, "1920x1080") і метод play()
// (виводить "Відтворюється відео[title] в роздільній здатності [resolution]").
//Створіть об'єкти для кожного класу і викличте метод play() для демонстрації поліморфізму.

package java_hw_53;

public class AllData {
    public static void main(String[] args) {
        Music firstMusic = new Music("Rihanna", "Album Hip-Hop", 55);
        Video firstVideo = new Video("1920x1080", "Diamond", 55);

        firstMusic.play();
        firstVideo.play();
    }
}
