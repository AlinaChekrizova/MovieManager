package ru.netology.movie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    private Movie first = new Movie("1", "Green Mile, drama", "drama", "url1.jpg", true);
    private Movie second = new Movie("2", "Shawshank Redemtion", "drama", "url2.jpg", true);
    private Movie third = new Movie("3", "The Lord of the Rings: The Return of the King", "fantasy", "url3.jpg", false);
    private Movie fourth = new Movie("4", "Forrest Gump", "drama", "url4.jpg", false);
    private Movie fifth = new Movie("5", "Lion King", "cartoon", "url5.jpg", false);
    private Movie sixth = new Movie("6", "Interstellar", "sci-fi", "url6.jpg", true);

    @Test
    public void shouldAddNewMovie() {
        MovieManager manager = new MovieManager();


        manager.addMovie(first);

        Movie[] actual = manager.getMovies();
        Movie[] expected = {first};
        assertArrayEquals(actual, expected);

    }
    @Test
    public void shouldGetLastMoviesOverLimit() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = {sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldGetLastMoviesUnderLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = {fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

}