public class Afisha {

    private Afisha[] movies = new Afisha[0];
    private int limit;


    public Afisha(){
        limit = 10;
    }

    public Afisha(int limit) {

        this.limit = limit;
    }

    public void add(Afisha movie) {
        Afisha[] tmp = new Afisha[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Afisha[] findAll() {
        return movies;
    }

    public Afisha[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        Afisha[] result = new Afisha[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}










