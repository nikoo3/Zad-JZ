package sda.zadKlasyInterfejsy.ex2;

public class Movie {
    private String title;
    private String director;
    private String type;
    private String publisher;
    private double yearOfRelease;

    public Movie(String title, String director, String type, String publisher, double yearOfRelease) {
        this.title = title;
        this.director = director;
        this.type = type;
        this.publisher = publisher;
        this.yearOfRelease = yearOfRelease;
    }

    static class MovieCreator{
        private String title;
        private String director;
        private String type;
        private String publisher;
        private double yearOfRelease;



        public MovieCreator setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieCreator setDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieCreator setType(String type) {
            this.type = type;
            return this;
        }

        public MovieCreator setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public MovieCreator setYearOfRelease(double yearOfRelease) {
            this.yearOfRelease = yearOfRelease;
            return this;
        }

        public Movie movieCreator (){
            Movie movie = new Movie(title,director,type,publisher,yearOfRelease);
            return movie;
        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", type='" + type + '\'' +
                ", Publisher='" + publisher + '\'' +
                ", YearOfRelease=" + yearOfRelease +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(double yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}
