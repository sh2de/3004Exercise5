public class LongNewsItemGenerator implements NewsItemGenerator{

    public LongNewsItemGenerator(){

    }

    @Override
    public NewsItem publish(String sport, String s){
        NewsItem n;
        switch (sport) {
            case "skating":
                System.out.println("--- Preparing a long figure skating news item ---");
                n = new SkatingNews();
                break;
            case "ski":
                System.out.println("--- Preparing a long ski news item ---");
                n = new SkiNews();
                break;
            case "hockey":
                System.out.println("--- Preparing a long hockey news item ---");
                n = new HockeyNews();
                break;
            case "bobsleigh":
                System.out.println("--- Preparing a long bobsleigh news item ---");
                n = new BobsleighNews();
                break;
            default:
                System.out.println("--- Preparing a long news item ---");
                n = new NewsItem();

        }

        return n;
    }
}
