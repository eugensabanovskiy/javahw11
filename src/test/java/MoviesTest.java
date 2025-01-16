import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MoviesTest {
    @Test
    public void shouldAddNewMovie() {
        Movies movie = new Movies();

        movie.addMovie("Movie1");

        String[] expected = {"Movie1"};
        String[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNoneMovie() {
        Movies films = new Movies();

        String[] expected = {};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMovies() {
        Movies movie = new Movies();

        movie.addMovie("Movie1");
        movie.addMovie("Movie2");
        movie.addMovie("Movie3");
        movie.addMovie("Movie4");
        movie.addMovie("Movie5");
        movie.addMovie("Movie6");
        movie.addMovie("Movie7");
        movie.addMovie("Movie8");
        movie.addMovie("Movie9");
        movie.addMovie("Movie10");

        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5", "Movie6", "Movie7", "Movie8", "Movie9", "Movie10"};
        String[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllNull() {
        Movies films = new Movies();

        String[] expected = {};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovie() {
        Movies movie = new Movies();

        movie.addMovie("Movie10");

        String[] expected = {"Movie10"};
        String[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovieIfOverTheLimit() {
        Movies movie = new Movies();

        movie.addMovie("Movie1");
        movie.addMovie("Movie2");
        movie.addMovie("Movie3");
        movie.addMovie("Movie4");
        movie.addMovie("Movie5");
        movie.addMovie("Movie6");
        movie.addMovie("Movie7");
        movie.addMovie("Movie8");
        movie.addMovie("Movie9");
        movie.addMovie("Movie10");
        movie.addMovie("Movie11");

        String[] expected = {"Movie11", "Movie10", "Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2"};
        String[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovieIfBelowTheLimit() {
        Movies movie = new Movies();

        movie.addMovie("Movie1");
        movie.addMovie("Movie2");
        movie.addMovie("Movie3");
        movie.addMovie("Movie4");
        movie.addMovie("Movie5");
        movie.addMovie("Movie6");
        movie.addMovie("Movie7");

        String[] expected = {"Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNoneMovie() {
        Movies movie = new Movies();

        String[] expected = {};
        String[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
