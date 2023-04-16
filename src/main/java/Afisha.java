public class Afisha {


    private int limit;


    public Afisha(int limit) {
        this.limit = limit;
    }
    private Afisha[] movies = new Afisha[0];
    public void add(Afisha movie) {
        Afisha[] tmp = new Afisha[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Afisha[] findAll() {
        int resultLength = movies.length;
        if (resultLength >= limit) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        Afisha[] result = new Afisha[ resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[i];
        }
        return result;
    }

    public Afisha[] findLast() {
        int resultLength = movies.length;
        if (resultLength >= limit) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        Afisha[] result = new Afisha[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[resultLength - 1 - i];
        }
        return result;
    }
}










