public interface NewsItemGenerator {

    default NewsItem publish(String sport, String s){
        NewsItem n;
        switch (sport) {
            case "skating":
                System.out.println("--- Preparing a figure skating news item ---");
                n = new SkatingNews();
                break;
            case "ski":
                System.out.println("--- Preparing a ski news item ---");
                n = new SkiNews();
                break;
            case "hockey":
                System.out.println("--- Preparing a hockey news item ---");
                n = new HockeyNews();
                break;
            case "bobsleigh":
                System.out.println("--- Preparing a bobsleigh news item ---");
                n = new BobsleighNews();
                break;
            default:
                System.out.println("--- Preparing a news item ---");
                n = new NewsItem();

        }

        return n;
    }
}
