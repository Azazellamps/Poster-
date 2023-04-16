import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {
    Afisha movie1 = new Afisha(1);
    Afisha movie2 = new Afisha(2);
    Afisha movie3 = new Afisha(3);
    Afisha movie4 = new Afisha(4);
    Afisha movie5 = new Afisha(5);
    Afisha movie6 = new Afisha(6);
    Afisha movie7 = new Afisha(7);
    @Test
    public void  addOneMovie() {
        Afisha kino = new Afisha(1);
        kino.add(movie1);
        Afisha[] expected = {movie1};
        Afisha[] actual = kino.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findAllLessLimit() {
        Afisha kino = new Afisha(7);
        kino.add(movie1);
        kino.add(movie2);
        kino.add(movie3);
        kino.add(movie4);
        kino.add(movie5);
        kino.add(movie6);
        Afisha[] expected = {movie1, movie2, movie3, movie4, movie5, movie6};
        Afisha[] actual = kino.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllEquallyLimit() {
        Afisha kino = new Afisha(2);
        kino.add(movie1);
        kino.add(movie2);

        Afisha[] expected = {movie1, movie2};
        Afisha[] actual = kino.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastEquallyLimit() {
        Afisha kino = new Afisha(7);
        kino.add(movie1);
        kino.add(movie2);
        kino.add(movie3);
        kino.add(movie4);
        kino.add(movie5);
        kino.add(movie6);
        kino.add(movie7);


        Afisha[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Afisha[] actual = kino.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastLessLimit() {
        Afisha kino = new Afisha(7);
        kino.add(movie1);
        kino.add(movie2);
        kino.add(movie3);
        kino.add(movie4);
        kino.add(movie5);
        kino.add(movie6);


        Afisha[] expected = {movie6, movie5, movie4, movie3, movie2,movie1};
        Afisha[] actual = kino.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}