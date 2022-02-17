public class ShortNewsItemGenerator implements NewsItemGenerator{

    public ShortNewsItemGenerator(){

    }
    @Override
    public NewsItem publish(String sport, String s){
        NewsItem n;
        switch (sport) {
            case "skating":
                System.out.println("--- Preparing a short figure skating news item ---");
                n = new SkatingNews();
                break;
            case "ski":
                System.out.println("--- Preparing a short ski news item ---");
                n = new SkiNews();
                break;
            case "hockey":
                System.out.println("--- Preparing a short hockey news item ---");
                n = new HockeyNews();
                break;
            case "bobsleigh":
                System.out.println("--- Preparing a short bobsleigh news item ---");
                n = new BobsleighNews();
                break;
            default:
                System.out.println("--- Preparing a short news item ---");
                n = new NewsItem();
        }
        n.setName(s);
        return n;
    }
}
