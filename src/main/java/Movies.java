public class Movies {

    private String[] movies = new String[0];
    private int limit;

    public Movies() {
        this.limit = 10;
    }

    public void addMovie(String film) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = film;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {

        int resultlength;
        if (movies.length < limit) {
            resultlength = movies.length;
        } else {
            resultlength = limit;
        }
        String[] result = new String[resultlength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }

}

