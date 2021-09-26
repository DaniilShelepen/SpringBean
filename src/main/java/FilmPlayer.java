import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FilmPlayer {

    private List<Films> filmsList = new ArrayList<>();
    private String name;
    private double rating;

    public FilmPlayer() {
    }

    public FilmPlayer(List<Films> films) {
        this.filmsList = films;
    }

    public void playFilm() {
        for (Films films: filmsList) {
            System.out.println("janr: " + films.getFilm() + " name: " + name + " rating: " + rating);
        }

    }
}
