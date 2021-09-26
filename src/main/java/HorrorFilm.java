public class HorrorFilm implements Films{
    @Override
    public String getFilm() {
        return "Horror film";
    }

    public static HorrorFilm getHorrorFilm(){
        return new HorrorFilm();
    }

    public void doInit(){
        System.out.println("Doing horror init");
    }

    public void doDestroy(){
        System.out.println("Doing horror destroy");
    }
}
