import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {


    @Test
    public void shouldMiddleFilmFindAll() {
        MovieManager manager = new MovieManager();
        manager.add("films1");
        manager.add("films2");
        manager.add("films3");
        manager.add("films4");
        manager.add("films5");

        String[] actual = manager.findAll();
        String[] expected = {
                "films1",
                "films2",
                "films3",
                "films4",
                "films5"
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMinFilmFindAll() {
        MovieManager manager = new MovieManager();
        manager.add("films1");


        String[] actual = manager.findAll();
        String[] expected = {"films1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMaxFilmFindAll() {
        MovieManager manager = new MovieManager();
        manager.add("films1");
        manager.add("films2");
        manager.add("films3");
        manager.add("films4");
        manager.add("films5");
        manager.add("films6");
        manager.add("films7");
        manager.add("films8");
        manager.add("films9");
        manager.add("films10");

        String[] actual = manager.findAll();
        String[] expected = {
                "films1",
                "films2",
                "films3",
                "films4",
                "films5",
                "films6",
                "films7",
                "films8",
                "films9",
                "films10"
        };

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldMiddleFilmFindLast() {
        MovieManager manager = new MovieManager();
        manager.add("films1");
        manager.add("films2");
        manager.add("films3");
        manager.add("films4");
        manager.add("films5");

        String[] actual = manager.findLast();
        String[] expected = {
                "films5",
                "films4",
                "films3",
                "films2",
                "films1"
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMinFilmFindLast() {
        MovieManager manager = new MovieManager();
        manager.add("films1");


        String[] actual = manager.findLast();
        String[] expected = {"films1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMinFilmFindLast2() {
        MovieManager manager = new MovieManager();
        manager.add("films1");
        manager.add("films2");


        String[] actual = manager.findLast();
        String[] expected = {
                "films2",
                "films1"
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMaxFilmFindLast() {
        MovieManager manager = new MovieManager();
        manager.add("films1");
        manager.add("films2");
        manager.add("films3");
        manager.add("films4");
        manager.add("films5");
        manager.add("films6");
        manager.add("films7");
        manager.add("films8");
        manager.add("films9");
        manager.add("films10");

        String[] actual = manager.findLast();
        String[] expected = {
                "films10",
                "films9",
                "films8",
                "films7",
                "films6",
                "films5",
                "films4",
                "films3",
                "films2",
                "films1"
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMaxBoundaryFilmFindLast() {
        MovieManager manager = new MovieManager();
        manager.add("films1");
        manager.add("films2");
        manager.add("films3");
        manager.add("films4");
        manager.add("films5");
        manager.add("films6");
        manager.add("films7");
        manager.add("films8");
        manager.add("films9");
        manager.add("films10");
        manager.add("films11");

        String[] actual = manager.findLast();
        String[] expected = {
                "films11",
                "films10",
                "films9",
                "films8",
                "films7",
                "films6",
                "films5",
                "films4",
                "films3",
                "films2"
        };

        Assertions.assertArrayEquals(expected, actual);
    }

}