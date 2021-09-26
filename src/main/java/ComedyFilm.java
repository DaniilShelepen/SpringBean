public class ComedyFilm implements Films {

    private ComedyFilm() {}

    public static ComedyFilm getComedyFilm(){
        return new ComedyFilm();
    }

    @Override
    public String getFilm() {
        return "Comedy film";
    }

    public void doInit() {
        System.out.println("Doing comedy init");
    }

    public void doDestroy() {
        System.out.println("Doing comedy destroy");
    }
}
