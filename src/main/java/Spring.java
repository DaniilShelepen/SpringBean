import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ApplicationContext.xml"
        );
      //  Films films = context.getBean("FilmBean", Films.class);
        FilmPlayer filmPlayer = context.getBean("FilmPlayer",FilmPlayer.class);
        filmPlayer.playFilm();

        filmPlayer.setRating(6.2);
        filmPlayer.playFilm();
        FilmPlayer filmPlayer1 = context.getBean("FilmPlayer",FilmPlayer.class);

        filmPlayer1.playFilm();
        context.close();
    }
}
