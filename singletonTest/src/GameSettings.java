public class GameSettings {
    private static volatile GameSettings instance;
    private String level = "easy";
    private String language = "english";

    private GameSettings(String level, String language) {
        this.level = level;
        this.language = language;
    }

    public static GameSettings getInstance(String level, String language) {
        GameSettings local = instance;
        if(local == null) {
            synchronized (GameSettings.class) {
                local = instance;
                if(local == null) {
                    instance = local = new GameSettings(level, language);
                }
            }
        }
        return instance;
    }

    public String getLevel() {
        return level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
