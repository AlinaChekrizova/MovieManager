package ru.netology.movie;

public class MovieManager {

    private int moviesLimit = 10;

    private Movie[] movies = new Movie[0];


    public MovieManager() {

    }

    public MovieManager(int movieLimit) {
        this.moviesLimit = movieLimit;

    }


    public Movie[] getMovies() {
        return movies;
    }


    public void addMovie(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }


    public Movie[] getLastMovies() {
        int resultLength;
        if (movies.length >= moviesLimit) {
            resultLength = moviesLimit;
        } else {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

}











