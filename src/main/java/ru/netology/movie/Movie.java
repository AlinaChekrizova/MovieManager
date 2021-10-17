package ru.netology.movie;

public class Movie {
    public Movie(String id, String title, String genre, String img_url, boolean is_premier_tomorrow) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.img_url = img_url;
        this.is_premier_tomorrow = is_premier_tomorrow;
    }

    private String id;
    private String title;
    private String genre;
    private String img_url;
    private boolean is_premier_tomorrow;
}
